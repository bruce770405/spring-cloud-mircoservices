package com.bruce.mircoservice.consumer.controller;

import com.netflix.discovery.converters.jackson.EurekaJsonJacksonCodec;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


@Slf4j
@RestController
public class ConsumerController {

    private RestTemplate restTemplate;

    @Autowired
    ConsumerController(RestTemplate template) {
        this.restTemplate = template;
    }

    @GetMapping(value = "/consumer")
    public String getConsumerText(){
        BookModel model = restTemplate.getForObject("http://bookservice/api/book",BookModel.class);

        log.debug("物件返回",model);

        return restTemplate.getForEntity("http://bookservice/api/book",String.class).getBody();
    }

    @GetMapping(value = "/consumer/test")
    public String getConsumerTestText(){
        UriComponents uri = UriComponentsBuilder.fromUriString("").build().expand("dodo").encode();
        return restTemplate.getForEntity(uri.toUri(),String.class).getBody();
    }
}
