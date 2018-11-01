
package com.bruce.consumerwithhystrix.service;

import com.bruce.consumerwithhystrix.common.model.BookModel;

/**
 * @program: spring-cloud-microservice-pom
 * @description: book service
 * @author: BruceHsu
 * @create: 2018-09-16 18:15
 */
public interface BookService {

    
    /**
     * @Description: find book.
     * @Param: [bookId]
     * @return: com.bruce.consumerwithhystrix.common.model.BookModel
     */
    public BookModel findBookByBookId(Integer bookId);
}
