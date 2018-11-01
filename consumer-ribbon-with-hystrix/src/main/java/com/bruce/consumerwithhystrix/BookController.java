
package com.bruce.consumerwithhystrix;

import com.bruce.consumerwithhystrix.common.model.BookModel;
import com.bruce.consumerwithhystrix.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-microservice-pom
 * @description: book controller
 * @author: BruceHsu
 * @create: 2018-09-16 18:14
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/ribbon/{id}")
    public BookModel findById(@PathVariable Integer id) {
        return bookService.findBookByBookId(id);
    }
}
