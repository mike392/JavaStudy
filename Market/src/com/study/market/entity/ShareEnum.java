package com.study.market.entity;

public enum ShareEnum {
	APPLE(new Share("APPLE", 15.0)),
	GOOGLE(new Share("GOOGLE", 20.0)),
	IBM(new Share("IBM", 17.0)),
	ORACLE(new Share("ORACLE", 14.0));
	
	private Share share;
	
	private ShareEnum(Share share){
		setShare(share);
	}
	
	public Share getShare(){
		return share;
	}
	
	public void setShare(Share share){
		this.share = share;
	}
}
