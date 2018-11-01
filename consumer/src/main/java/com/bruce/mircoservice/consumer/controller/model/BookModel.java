package com.bruce.mircoservice.consumer.controller.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: spring-cloud-microservice-pom
 * @description: Book service get Book model
 * @author: BruceHsu
 * @create: 2018-09-16 00:19
 */
@Data
public class BookModel implements Serializable {

    /** bookIxd.*/
    private Integer bookId;

    /** name.*/
    private String name;

    /** author.*/
    private String author;

}
