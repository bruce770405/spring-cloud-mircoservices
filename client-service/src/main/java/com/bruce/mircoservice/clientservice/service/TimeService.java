package com.bruce.mircoservice.clientservice.service;

import com.bruce.mircoservice.clientservice.entity.BookEntity;

import java.util.Date;

/**
 *
 */
public interface TimeService {

    /**
     * @return the date
     */
    public Date getTime();


    /**
     * @return the long
     */
    public Long getCurrentTimeMillis();

    /**
     * 取得書本資訊.
     * @return the BookEntity
     */
    public BookEntity getBook();

}
