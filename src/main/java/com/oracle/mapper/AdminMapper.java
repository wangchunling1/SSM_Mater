package com.oracle.mapper;

import com.oracle.web.bean.Admin;

public interface AdminMapper {
	
    int insert(Admin admin);
    
    Admin queryAdmin(Admin admin);
    
    Admin findAdmin(String userName);
}