package edu.xalead.service;

import edu.xalead.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增删改查，查全部的书
    int addBook(Books books);

    int deleteBookById( int id);

    int updateBook(Books books);

    Books queryBookById( int id);

    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName")String bookName);
}
