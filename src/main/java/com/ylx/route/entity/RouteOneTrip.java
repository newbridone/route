package com.ylx.route.entity;

import java.util.List;



/**
 * 某一天的行程基本信息实体
 * 
 * @author lucheng
 */
public class RouteOneTrip extends BaseBO {

	//全局唯一标识
	private static final long serialVersionUID = 4586004927591656835L;

	//某段线路行程编号(主键)
	private String oneTripId;
	
	//线路行程编号
	private String tripId;
	
	//线路行程编号
	private int whichTrip;
		
	//行程时间
	private String touristTime;
	
	//行程内容
	private String touristContent;
	
	//小标题
	private String smallTitle;
	
	//小标题正文
	private String smallTitleText;
	
	//存放每段行程中的所有图片及图片文字
	private String tripPicString;

	//存放数据库中每一天的全部内容
	private List<RouteTripPic> routeTripPicList;
	
	public String getOneTripId() {
		return oneTripId;
	}

	public void setOneTripId(String oneTripId) {
		this.oneTripId = oneTripId;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public int getWhichTrip() {
		return whichTrip;
	}

	public void setWhichTrip(int whichTrip) {
		this.whichTrip = whichTrip;
	}

	public String getTouristTime() {
		return touristTime;
	}

	public void setTouristTime(String touristTime) {
		this.touristTime = touristTime;
	}

	public String getTouristContent() {
		return touristContent;
	}

	public void setTouristContent(String touristContent) {
		this.touristContent = touristContent;
	}

	public String getSmallTitle() {
		return smallTitle;
	}

	public void setSmallTitle(String smallTitle) {
		this.smallTitle = smallTitle;
	}

	public String getSmallTitleText() {
		return smallTitleText;
	}

	public void setSmallTitleText(String smallTitleText) {
		this.smallTitleText = smallTitleText;
	}

	public String getTripPicString() {
		return tripPicString;
	}

	public void setTripPicString(String tripPicString) {
		this.tripPicString = tripPicString;
	}

	public List<RouteTripPic> getRouteTripPicList() {
		return routeTripPicList;
	}

	public void setRouteTripPicList(List<RouteTripPic> routeTripPicList) {
		this.routeTripPicList = routeTripPicList;
	}

}
