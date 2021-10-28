package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hzqstart
 * @create 2021-10-27-1:05
 */
public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询所有书
    List<Books> queryAllBook();
    Books queryBookByName(String bookName);
}
