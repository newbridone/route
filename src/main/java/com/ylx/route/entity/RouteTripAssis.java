package com.ylx.route.entity;

import java.util.List;



/**
 * 线路行程副表基本信息实体
 * 
 * @author lucheng
 */
public class RouteTripAssis extends BaseBO {

	//全局唯一标识
	private static final long serialVersionUID = -8066629155447424211L;

	//对应行程ID
	private Integer journeyId;
		
	//线路行程编号(主键)
	private String tripId;
	
	//线路产品ID
	private String goodsRouteId;
	
	//第几天行程
	private int tripOfDay;
	
	//该天的行程安排
	private String tripPlan;
	
	//行程描述
	private String tripDescribe;
	
	//早餐
	private String breakfast;
	
	//中餐
	private String lunch;
	
	//晚餐
	private String dinner;
	
	//住宿
	private String accommodation;
	
	//存放每一天中各行程段的内容
	private String oneTripString;

	//存放数据库中每一天的全部内容
	private List<RouteOneTrip> routeOneTripList;
	
	//资源模块
	private String moduleList;
	
		
	public Integer getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(Integer journeyId) {
		this.journeyId = journeyId;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getGoodsRouteId() {
		return goodsRouteId;
	}

	public void setGoodsRouteId(String goodsRouteId) {
		this.goodsRouteId = goodsRouteId;
	}

	public int getTripOfDay() {
		return tripOfDay;
	}

	public void setTripOfDay(int tripOfDay) {
		this.tripOfDay = tripOfDay;
	}

	public String getTripPlan() {
		return tripPlan;
	}

	public void setTripPlan(String tripPlan) {
		this.tripPlan = tripPlan;
	}

	public String getTripDescribe() {
		return tripDescribe;
	}

	public void setTripDescribe(String tripDescribe) {
		this.tripDescribe = tripDescribe;
	}

	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	public String getAccommodation() {
		return accommodation;
	}

	public void setAccommodation(String accommodation) {
		this.accommodation = accommodation;
	}

	public String getOneTripString() {
		return oneTripString;
	}

	public void setOneTripString(String oneTripString) {
		this.oneTripString = oneTripString;
	}

	public List<RouteOneTrip> getRouteOneTripList() {
		return routeOneTripList;
	}

	public void setRouteOneTripList(List<RouteOneTrip> routeOneTripList) {
		this.routeOneTripList = routeOneTripList;
	}

	public String getModuleList() {
		return moduleList;
	}

	public void setModuleList(String moduleList) {
		this.moduleList = moduleList;
	}

}
