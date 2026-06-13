package com.library.library_system.service;

import com.library.library_system.entity.Admin;
import com.library.library_system.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public Admin login(Admin admin){
        return adminMapper.login(admin);
    }
}