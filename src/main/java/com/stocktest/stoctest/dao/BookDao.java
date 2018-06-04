package com.stocktest.stoctest.dao;

import com.stocktest.stoctest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BookDao extends JpaRepository<Book,Long>  {

}
