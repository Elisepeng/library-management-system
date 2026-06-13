package com.library.library_system.mapper;

import com.library.library_system.entity.Book;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface BookMapper {

    @Select("select * from book")
    List<Book> findAll();

    @Select("select * from book where id = #{id}")
    Book findById(Integer id);

    @Insert("insert into book(name,author,stock) values(#{name},#{author},#{stock})")
    int add(Book book);

    @Delete("delete from book where id = #{id}")
    int deleteById(Integer id);

    @Update("update book set name=#{name},author=#{author},stock=#{stock} where id=#{id}")
    int update(Book book);

    @Update("update book set stock = stock - 1 where id = #{id} and stock > 0")
    int borrow(Integer id);

    @Update("update book set stock = stock + 1 where id = #{id}")
    int returnBook(Integer id);
//    @org.apache.ibatis.annotations.Delete("delete from book where id = #{id}")
//    int deleteById(Integer id);
}