package com.bruce.mircoservice.clientservice.controller.book;

import com.bruce.mircoservice.clientservice.Repository.BookRepository;
import com.bruce.mircoservice.clientservice.entity.BookEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Api(tags = "Book controller")
@RestController
@RequestMapping(value = "/api")
public class BookController {

    private BookRepository bookDao;

    @Autowired
    BookController(BookRepository dao) {
        this.bookDao = dao;
    }

    @ApiOperation(value = "取得書本", notes = "列出所有書本資訊")
    @GetMapping(value = "/book")
    public List<BookModel> getBookModel() {
        List<BookModel> modelList = new ArrayList<>();
        List<BookEntity> bookList = bookDao.findAll();
        for (BookEntity book : bookList) {
            BookModel model = new BookModel();
            model.setName(book.getName());
            model.setAuthor(book.getAuthor());
            model.setBookId(book.getBookid());
            modelList.add(model);
        }

        return modelList;
    }

    @ApiOperation(value = "新增書本資訊", notes = "新增書本的內容")
    @PostMapping(value = "/add/book", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public BookModel addBookModelInDb(@RequestBody BookModel param) {

        BookEntity entity = new BookEntity();
        entity.setBookid(param.getBookId());
        entity.setAuthor(param.getAuthor());
        entity.setName(param.getName());
        BookEntity returnE = bookDao.save(entity);
        BookModel model = new BookModel();
        model.setBookId(returnE.getBookid());
        model.setAuthor(returnE.getAuthor());
        model.setName(returnE.getName());
        return model;
    }
}
