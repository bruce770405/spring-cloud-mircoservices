package com.bruce.mircoservice.clientservice.controller.common;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "common controller")
@Slf4j
@RestController
public class CommonController {

    private DiscoveryClient client;

    @Autowired
    CommonController(DiscoveryClient client) {
        this.client = client;
    }

    @GetMapping(value = "/getServiceIndex")
    public List<ServiceInstance> getServiceIndex() {
        List<String> serviceIxds = client.getServices();
        List<ServiceInstance> instances = client.getInstances(serviceIxds.get(0));
        instances.forEach(instance -> {
            log.debug("啟動 service --- service host {}, serviceId {}", instance.getHost(), instance.getServiceId());
        });
        return instances;
    }

}
