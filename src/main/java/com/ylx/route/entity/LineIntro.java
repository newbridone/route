package com.ylx.route.entity;

public class LineIntro {
	private String channelType;

	private String content;

	private int orderNum;

	private String title;

	public void setChannelType(String channelType){
	this.channelType = channelType;
	}
	public String getChannelType(){
	return this.channelType;
	}
	public void setContent(String content){
	this.content = content;
	}
	public String getContent(){
	return this.content;
	}
	public void setOrderNum(int orderNum){
	this.orderNum = orderNum;
	}
	public int getOrderNum(){
	return this.orderNum;
	}
	public void setTitle(String title){
	this.title = title;
	}
	public String getTitle(){
	return this.title;
	}
}
