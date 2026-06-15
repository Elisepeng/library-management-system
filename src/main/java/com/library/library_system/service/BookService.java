//package com.library.library_system.service;
//
//public class BookService {
//}

package com.library.library_system.service;

import com.library.library_system.entity.Book;
import com.library.library_system.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Book> findAll(){
        return bookMapper.findAll();
    }

    public Book findById(Integer id){
        return bookMapper.findById(id);
    }

    public int add(Book book){
        return bookMapper.add(book);
    }

    public int deleteById(Integer id){
        return bookMapper.deleteById(id);
    }

    public int update(Book book){
        return bookMapper.update(book);
    }

    public int borrow(Integer id){
        return bookMapper.borrow(id);
    }

    public int returnBook(Integer id){
        return bookMapper.returnBook(id);
    }


}
