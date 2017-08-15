package com.ztw.hxzq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ztw.hxzq.service.SecuMainService;

@RestController
public class UserController {
	
	@Autowired
	private SecuMainService secuMainService;
	
	@RequestMapping(value = "/api/stockList", method = RequestMethod.GET)
	public String stockList(){
		List<String> list = secuMainService.getALLStock();
		String str = JSON.toJSONString(list, SerializerFeature.WriteMapNullValue);
		return str;
	}

	
	@RequestMapping(value = "/api/userInfo/{userName}", method = RequestMethod.GET)
	public String findOneCity(@PathVariable("userName") String userName) {
		return "欢迎：" + userName;
	}

}
