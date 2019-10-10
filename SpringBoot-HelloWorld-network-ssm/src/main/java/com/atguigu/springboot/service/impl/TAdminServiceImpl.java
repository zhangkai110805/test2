package com.atguigu.springboot.service.impl;

import java.util.List;

import javax.xml.ws.WebServiceClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.mapper.TAdminMapper;
import com.atguigu.springboot.service.TAdminService;
@WebServiceClient 
@Service
public class TAdminServiceImpl implements TAdminService{
	
	@Autowired
	TAdminMapper adminMapper;
	@Override
	public List<TAdmin> listAdmins() {
		return adminMapper.selectAdmins();
		//return null;
	}

}
