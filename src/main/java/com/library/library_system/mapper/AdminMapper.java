package com.library.library_system.mapper;

import com.library.library_system.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {

    @Select("select * from admin where username=#{username} and password=#{password}")
    Admin login(Admin admin);

}