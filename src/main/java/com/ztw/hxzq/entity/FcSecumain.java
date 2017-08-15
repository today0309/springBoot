package com.ztw.hxzq.entity;

import java.io.Serializable;

/**
 * 财汇证券主要信息
 * 
 * @author zhongtongwei
 * @date 2017年7月21日
 * @time 下午2:34:32
 */
public class FcSecumain implements Serializable {

	private static final long serialVersionUID = 2127788501870914535L;

	// 证券代码
	private String secuCode;

	// 证券市场
	private String secuMarket;

	// 证券类别
	private String secuCategory;

	// 证券简称
	private String secuAbbr;

	public String getSecuCode() {
		return secuCode;
	}

	public void setSecuCode(String secuCode) {
		this.secuCode = secuCode;
	}

	public String getSecuMarket() {
		return secuMarket;
	}

	public void setSecuMarket(String secuMarket) {
		this.secuMarket = secuMarket;
	}

	public String getSecuCategory() {
		return secuCategory;
	}

	public void setSecuCategory(String secuCategory) {
		this.secuCategory = secuCategory;
	}

	public String getSecuAbbr() {
		return secuAbbr;
	}

	public void setSecuAbbr(String secuAbbr) {
		this.secuAbbr = secuAbbr;
	}

	@Override
	public String toString() {
		return "FcSecumain [secuCode=" + secuCode + ", secuMarket=" + secuMarket + ", secuCategory=" + secuCategory
				+ ", secuAbbr=" + secuAbbr + "]";
	}

}
