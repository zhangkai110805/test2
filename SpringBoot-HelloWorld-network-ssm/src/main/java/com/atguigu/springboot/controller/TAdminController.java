package com.atguigu.springboot.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.service.TAdminService;

@Controller
public class TAdminController {
	@Autowired
	TAdminService adminService;
	
	@Autowired
	DataSource dataSource;
	
	@RequestMapping("/listAdmins")
	public String listAdmins() {
		List<TAdmin> list = adminService.listAdmins();
		System.out.println(list);
		System.out.println(dataSource.getClass());
		return "admin/admin";
	}
}
