package com.ztw.hxzq.mapper;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ztw.hxzq.BaseTest;

public class SecuMainMapperTest extends BaseTest {

	@Autowired
	private SecuMainMapper secuMainMapper;

	@Test
	public void test() {
		try {
			List<Map<String, Object>> list = secuMainMapper.getSecuCodes("SH", "EQA");
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
