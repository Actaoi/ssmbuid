package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hzqstart
 * @create 2021-10-27-0:50
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookId")int id);
    //查询所有书
    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName")String bookName);
}
