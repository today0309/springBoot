package com.ztw.hxzq.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ztw.hxzq.BaseTest;

public class SecuMainServiceTest extends BaseTest{

	@Autowired
	private SecuMainService secuMainService;
	
	@Test
	public void test001(){
		System.out.println(secuMainService.getALLStock());
	}
}
