package com.ylx.route.entity;

public class Line {
	private String Promotion;

	private String city;

	private String continent;

	private String country;

	private String firstLineImg;

	private String lineCode;

	private String lineName;

	private int numDay;

	private int numNight;

	private Team team;

	public void setPromotion(String Promotion){
	this.Promotion = Promotion;
	}
	public String getPromotion(){
	return this.Promotion;
	}
	public void setCity(String city){
	this.city = city;
	}
	public String getCity(){
	return this.city;
	}
	public void setContinent(String continent){
	this.continent = continent;
	}
	public String getContinent(){
	return this.continent;
	}
	public void setCountry(String country){
	this.country = country;
	}
	public String getCountry(){
	return this.country;
	}
	public void setFirstLineImg(String firstLineImg){
	this.firstLineImg = firstLineImg;
	}
	public String getFirstLineImg(){
	return this.firstLineImg;
	}
	public void setLineCode(String lineCode){
	this.lineCode = lineCode;
	}
	public String getLineCode(){
	return this.lineCode;
	}
	public void setLineName(String lineName){
	this.lineName = lineName;
	}
	public String getLineName(){
	return this.lineName;
	}
	public void setNumDay(int numDay){
	this.numDay = numDay;
	}
	public int getNumDay(){
	return this.numDay;
	}
	public void setNumNight(int numNight){
	this.numNight = numNight;
	}
	public int getNumNight(){
	return this.numNight;
	}
	public void setTeam(Team team){
	this.team = team;
	}
	public Team getTeam(){
	return this.team;
	}
}
