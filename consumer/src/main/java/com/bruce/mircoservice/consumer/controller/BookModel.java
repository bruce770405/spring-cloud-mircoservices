
package com.bruce.mircoservice.consumer.controller;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookModel implements Serializable {

    /**
     * @Description:
     * @Param:
     * @return:
     */
    private Integer bookId;

    /**
     * @Description:
     * @Param:
     * @return:
     */
    private String name;

    /**
     * @Description:
     * @Param:
     * @return:
     */
    private String author;

}