package com.oracle.web.service;

import com.oracle.web.bean.Admin;

public interface AdminService {

	Admin login(Admin admin);

	int save(Admin admin);

	Admin queryone(String userName);


}
