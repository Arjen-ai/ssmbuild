package edu.xalead.controller;

import edu.xalead.pojo.Books;
import edu.xalead.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调 service 层
    @Autowired
    @Qualifier("bookServiceImpl")
    public BookService bookService;

    //查询全部书籍，并展示到一个展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> booksList= bookService.queryAllBook();
        model.addAttribute("booksList",booksList);
        return "allBook";
    }

    @RequestMapping("/addBook")
    public String addToBook(){
        return "addBook";
    }

    @RequestMapping("/insertBook")
    public String addBook(Books books){
        System.out.println("books==>"+ books);
        bookService.addBook(books);
        return "redirect: /book/allBook";//重定向，请求复用
    }

    @RequestMapping("/toUpdate/{id}")
    public String toUpdateBook(@PathVariable("id") int id, Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("book",books);
        return "updateBook";
    }

    @RequestMapping("/updateBookById")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect: /book/allBook";
    }

    @RequestMapping("/deleteBookById/{id}")
    public String updateBook(@PathVariable("id") int id){
        bookService.deleteBookById(id);
        return "redirect: /book/allBook";
    }

    @RequestMapping("/queryBook")
    public String  queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        System.out.println(books);
        List<Books> booksList=new ArrayList<Books>();
        if(books==null){
            booksList= bookService.queryAllBook();
            model.addAttribute("err","未找到对应书籍");
        }else{
            booksList.add(books);
        }
        model.addAttribute("booksList",booksList);
        return "allBook";
    }

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        System.out.println(username);
        session.setAttribute("username",username);
        return "redirect: /book/allBook";
    }

}
