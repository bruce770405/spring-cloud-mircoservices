
package com.bruce.consumerwithhystrix.service.impl;

import com.bruce.consumerwithhystrix.common.model.BookModel;
import com.bruce.consumerwithhystrix.common.model.ExceptionHandler;
import com.bruce.consumerwithhystrix.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: spring-cloud-microservice-pom
 * @description: BookService Impl
 * @author: BruceHsu
 * @create: 2018-09-16 18:34
 */
@Service("BookService")
@Slf4j
public class BookServiceImpl extends ExceptionHandler implements BookService {

    private RestTemplate restTemplate;

    @Autowired
    public BookServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    /**
     * 使用 @HystrixCommand 指定當該方法發生異常 調用方法.
     * @param bookId book id
     * @return the BookModel
     */
    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public BookModel findBookByBookId(Integer bookId) {
        log.info("method book id ",bookId);
        BookModel model = restTemplate.getForObject("http://bookservice/api/book",BookModel.class);
        return model;
    }

    @Override
    public Object fallback() {
        log.info("exception，進入 fallback 方法");
        BookModel book = new BookModel();
        book.setBookId(-1);
        book.setName("default username");
        book.setAuthor("no author");
        return book;
    }
}
