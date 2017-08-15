package com.ztw.hxzq.mapper.finchina;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SecuMainMapper {

	List<Map<String, Object>> getSecuCodes(@Param("secuMarket") String secuMarket, @Param("secuCategory") String secuCategory);

}
