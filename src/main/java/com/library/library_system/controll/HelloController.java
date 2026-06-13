//package com.library.library_system.controll;
//
//import com.library.library_system.entity.Book;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloController {
//
//    @GetMapping("/book")
//    public Book book() {
//
//        Book book = new Book();
//
//        book.setId(1);
//        book.setName("Java从入门到精通");
//        book.setAuthor("张三");
//
//        return book;
//    }
//}

package com.library.library_system.controll;

import com.library.library_system.entity.Book;
import com.library.library_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.library.library_system.entity.Admin;
import com.library.library_system.service.AdminService;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AdminService adminService;

    @GetMapping("/books")
    public List<Book> books(){
        return bookService.findAll();
    }

    @GetMapping("/book/{id}")
    public Book findById(@PathVariable Integer id){
        return bookService.findById(id);
    }

    @GetMapping("/book/add")
    public String add(String name,String author,Integer stock){

        Book book = new Book();

        book.setName(name);
        book.setAuthor(author);
        book.setStock(stock);

        bookService.add(book);

        return "添加成功";
    }

    @GetMapping("/book/delete/{id}")
    public String delete(@PathVariable Integer id){

        bookService.deleteById(id);

        return "删除成功";
    }

    @GetMapping("/book/update")
    public String update(Integer id,String name,String author,Integer stock){

        Book book = new Book();

        book.setId(id);
        book.setName(name);
        book.setAuthor(author);
        book.setStock(stock);

        bookService.update(book);

        return "修改成功";
    }

    @GetMapping("/book/borrow/{id}")
    public String borrow(@PathVariable Integer id){

        int result = bookService.borrow(id);

        if(result > 0){
            return "借书成功";
        }

        return "库存不足";
    }

    @GetMapping("/book/return/{id}")
    public String returnBook(@PathVariable Integer id){

        bookService.returnBook(id);

        return "还书成功";
    }

    @GetMapping("/admin/login")
    public String login(String username,String password){

        Admin admin = new Admin();

        admin.setUsername(username);
        admin.setPassword(password);

        Admin result = adminService.login(admin);

        if(result != null){
            return "登录成功";
        }

        return "用户名或密码错误";
    }

}