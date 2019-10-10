package com.atguigu.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.springboot.bean.TAdmin;
//@Mapper//组件注解
public interface TAdminMapper {

	List<TAdmin> selectAdmins();

}
