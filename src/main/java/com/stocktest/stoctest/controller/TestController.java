package com.stocktest.stoctest.controller;

import com.stocktest.stoctest.dao.BookDao;
import com.stocktest.stoctest.entity.Book;
import com.stocktest.stoctest.entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class TestController {

    @Autowired
    private BookDao bookDao;

    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "<h1>Hello first app</h1>";
    }


    @RequestMapping(value = "api/saveBook", method = RequestMethod.POST)
    public Response saveBook(@RequestBody Book book){
        Book b = bookDao.save(book);
        if (b != null){
        Response response = new Response();
        response.setStatus("success");
        response.setMessage("book data was inserted successfully");
        response.setData(b);
        return response;
        }
        Response response = new Response();
        response.setStatus("error");
        response.setMessage("Invalid request");
        response.setData(null);
        return response;
    }
}
