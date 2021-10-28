package com.kuang.controller;

import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hzqstart
 * @create 2021-10-27-11:49
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询所有书籍，返回一个书籍展示页面
    @RequestMapping("allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list",books);
        return "allBook";
    }
    //跳转到新增书籍页面
    @RequestMapping("toAddBook")
    public  String toAddPaper(){
        return "addBook";
    }
    //添加书籍请求
    @RequestMapping("/addBook")
    public  String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/toUpdateBook")
    public  String toUpdatePaper(int id,Model model){
        Books books = bookService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("QBook",books);
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updateBook")
    public  String updateBook(Books books){
        System.out.println("updateBook=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    //删除书籍
    @RequestMapping("/deleteBook/{bookID}")
    public  String deleteBook(@PathVariable("bookID") int id){
         bookService.deleteBookById(id);
        return "redirect: /book/allBook";
    }
    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list=new ArrayList<Books>();
        list.add(books);
        model.addAttribute("list",list);
        return "allBook";
    }

}
