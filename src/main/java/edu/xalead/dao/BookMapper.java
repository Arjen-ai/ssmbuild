package edu.xalead.dao;

import edu.xalead.pojo.Books;
import org.apache.ibatis.annotations.Param;


import java.util.List;
public interface BookMapper {
    //增删改查，查全部的书
    int addBook(Books books);

    int deleteBookById(@Param("bookID") int id);

    int updateBook(Books books);

    Books queryBookById(@Param("bookID") int id);

    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName")String bookName);
}
