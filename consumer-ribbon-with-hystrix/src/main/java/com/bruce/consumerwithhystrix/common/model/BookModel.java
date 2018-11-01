
package com.bruce.consumerwithhystrix.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: spring-cloud-microservice-pom
 * @description: book model
 * @author: BruceHsu
 * @create: 2018-09-16 18:17
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
