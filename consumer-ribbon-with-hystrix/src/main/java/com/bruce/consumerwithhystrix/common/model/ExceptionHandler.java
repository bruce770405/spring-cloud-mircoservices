
package com.bruce.consumerwithhystrix.common.model;

/**
 * @program: spring-cloud-microservice-pom
 * @description:
 * @author: BruceHsu
 * @create: 2018-09-16 18:41
 */
public abstract class ExceptionHandler {

    /**
     * hystrix fallback方法
     * @return default exception return data
     */
    public abstract Object fallback();


}
