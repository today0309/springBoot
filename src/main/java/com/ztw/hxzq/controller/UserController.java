package com.ztw.hxzq.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	/*
	 * @PathVariable获取参数
	 */
	@RequestMapping(value = "/api/userInfo/{userName}", method = RequestMethod.GET)
	public String findOneCity(@PathVariable("userName") String userName) {
		return "欢迎：" + userName;
	}

}
