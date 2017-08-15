package com.ztw.hxzq.mapper.dzh;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ztw.hxzq.entity.FcSecumain;

public interface StockInfoMapper {

	List<FcSecumain> getAllSecuCodeInfo(@Param("secuMarket") String secuMarket, @Param("secuCategory") String secuCategory);
	
}
