package com.bruce.mircoservice.clientservice.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 */
@Entity(name = "book")
@Data
public class BookEntity {

    /**
     *
     */
    @Id
    @GeneratedValue
    private Integer bookid;

    /**
     *
     */
    @Column(name = "name")
    private String name;

    /**
     *
     */
    @Column(name = "author")
    private String author;

}
