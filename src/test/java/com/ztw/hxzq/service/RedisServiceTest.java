package com.ztw.hxzq.service;

import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.ztw.hxzq.BaseTest;

public class RedisServiceTest extends BaseTest{
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private SecuMainService secuMainService;

	@Test
	public void test(){
		Map<String, String> map = secuMainService.getMap();
		stringRedisTemplate.opsForHash().putAll("stock", map);
	}
}
