package com.ylx.route.entity;



/**
 * 线路行程主表信息实体
 * 
 * @author lucheng
 */
public class RouteTripMaster extends BaseBO {

	//全局唯一标识
	private static final long serialVersionUID = -4210666990488175012L;
	
	//对应行程ID
	private Integer journeyId;
	
	//线路产品ID
	private String goodsRouteId;
	
	//是否多行程
	private Integer isSupportMultipleJourney;
	
	//往时交通(0:往-- 1:飞机 2:火车软卧 3:火车硬卧 4:火车软座 5:火车硬座 6:汽车 7:邮轮 8:火车 9:动车组 10:游船 11:高铁商务座 12:高铁一等座 13:高铁二等座 14:自行安排)
	private String trafficGo;
	
	//返时交通(0:返-- 1:飞机 2:火车软卧 3:火车硬卧 4:火车软座 5:火车硬座 6:汽车 7:邮轮 8:火车 9:动车组 10:游船 11:高铁商务座 12:高铁一等座 13:高铁二等座 14:自行安排)
	private String trafficBack;
	
	//团期
	private String dateTime;
	
	//行程天数
	private String daytimeCount;
	
	//行程夜数
	private String lightCount;
	
	//去程抵达城市
	private String leaveCity;
	
	//返程出发城市
	private String destinationCity;
	
	//行程备注
	private String travelNotes;
	
	//临时存放routeTripAssis框的内容
	private String tripAssisString;
	
	//是否笛风产品
	private String isIfs;
  	
  	//费用包含
  	private String feeContain;
  	
  	//费用不包含
  	private String feeContainNo;
	

	public Integer getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(Integer journeyId) {
		this.journeyId = journeyId;
	}

	public String getGoodsRouteId() {
		return goodsRouteId;
	}

	public void setGoodsRouteId(String goodsRouteId) {
		this.goodsRouteId = goodsRouteId;
	}

	public Integer getIsSupportMultipleJourney() {
		return isSupportMultipleJourney;
	}

	public void setIsSupportMultipleJourney(Integer isSupportMultipleJourney) {
		this.isSupportMultipleJourney = isSupportMultipleJourney;
	}

	public String getTrafficGo() {
		return trafficGo;
	}

	public void setTrafficGo(String trafficGo) {
		this.trafficGo = trafficGo;
	}

	public String getTrafficBack() {
		return trafficBack;
	}

	public void setTrafficBack(String trafficBack) {
		this.trafficBack = trafficBack;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getDaytimeCount() {
		return daytimeCount;
	}

	public void setDaytimeCount(String daytimeCount) {
		this.daytimeCount = daytimeCount;
	}

	public String getLightCount() {
		return lightCount;
	}

	public void setLightCount(String lightCount) {
		this.lightCount = lightCount;
	}

	public String getLeaveCity() {
		return leaveCity;
	}

	public void setLeaveCity(String leaveCity) {
		this.leaveCity = leaveCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getTravelNotes() {
		return travelNotes;
	}

	public void setTravelNotes(String travelNotes) {
		this.travelNotes = travelNotes;
	}

	public String getTripAssisString() {
		return tripAssisString;
	}

	public void setTripAssisString(String tripAssisString) {
		this.tripAssisString = tripAssisString;
	}

	public String getIsIfs() {
		return isIfs;
	}

	public void setIsIfs(String isIfs) {
		this.isIfs = isIfs;
	}

	public String getFeeContain() {
		return feeContain;
	}

	public void setFeeContain(String feeContain) {
		this.feeContain = feeContain;
	}

	public String getFeeContainNo() {
		return feeContainNo;
	}

	public void setFeeContainNo(String feeContainNo) {
		this.feeContainNo = feeContainNo;
	}
	

}
