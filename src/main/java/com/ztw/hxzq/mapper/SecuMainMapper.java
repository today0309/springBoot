package com.ztw.hxzq.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;


public interface SecuMainMapper {

	List<Map<String, Object>> getSecuCodes(@Param("secuMarket") String secuMarket, @Param("secuCategory") String secuCategory);

}
