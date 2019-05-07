package com.oracle.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.mapper.AdminMapper;
import com.oracle.web.bean.Admin;
import com.oracle.web.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	@Transactional(readOnly=true)
	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return this.adminMapper.queryAdmin(admin);
	}

	@Override
	@Transactional
	public int save(Admin admin) {
		// TODO Auto-generated method stub
		return this.adminMapper.insert(admin);
	}

	@Override
	@Transactional
	public Admin queryone(String userName) {
		// TODO Auto-generated method stub
		return this.adminMapper.findAdmin(userName);
	}


}
