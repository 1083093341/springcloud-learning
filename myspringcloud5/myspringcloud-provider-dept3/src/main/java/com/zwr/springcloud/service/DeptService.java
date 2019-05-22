package com.zwr.springcloud.service;

import com.zwr.springcloud.entities.Dept;

import java.util.List;

public interface DeptService
{
	  boolean add(Dept dept);

	  Dept get(Long id);

	  List<Dept> list();
}
