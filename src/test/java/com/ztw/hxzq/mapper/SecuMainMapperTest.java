package com.ztw.hxzq.mapper;

import java.util.List;

import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ztw.hxzq.BaseTest;
import com.ztw.hxzq.entity.FcSecumain;
import com.ztw.hxzq.mapper.dzh.StockInfoMapper;
import com.ztw.hxzq.mapper.finchina.SecuMainMapper;

public class SecuMainMapperTest extends BaseTest {

	@Autowired
	private SecuMainMapper secuMainMapper;
	
	@Autowired
	private StockInfoMapper stockInfoMapper;

	@Test
	public void test() {
		try {
			List<Map<String, Object>> list = secuMainMapper.getSecuCodes("SH", "EQA");
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void test01(){
		try {
			List<FcSecumain> list = stockInfoMapper.getAllSecuCodeInfo("SH", "stk");
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
