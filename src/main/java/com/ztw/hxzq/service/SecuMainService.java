package com.ztw.hxzq.service;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.ztw.hxzq.mapper.finchina.SecuMainMapper;

@Service
public class SecuMainService {
	
	@Autowired
	private SecuMainMapper secuMainMapper;

	public List<String> getALLStock(){
		List<Map<String, Object>> list = secuMainMapper.getSecuCodes("SH", "EQA");
		if(CollectionUtils.isEmpty(list))
			return null;
		Set<String> set = new HashSet<String>(list.size());
		list.forEach(map -> {
			set.add((String)map.get("Symbol"));
		});
		return Lists.newArrayList(set);
	}
}
