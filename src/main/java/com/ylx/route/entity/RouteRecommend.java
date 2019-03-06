package com.ylx.route.entity;

/**
 * 产品推荐表基本信息实体
 * 
 * @author lucheng
 */
public class RouteRecommend extends BaseBO {

	//全局唯一标识
	private static final long serialVersionUID = 7560958638285936739L;
	
	//对应行程ID
	private Integer journeyId;
	
	//线路产品ID
	private String goodsRouteId;
	
	//特别优惠
	private String specialDiscount;
	
	//重要提示
	private String importantNotice;
	
	//交通信息
	private String trafficInformation;
	
	//吃
	private String eatFeature;
	
	//住
	private String liveFeature;
	
	//行
	private String goFeature;
	
	//游
	private String travelFeature;
	
	//购
	private String buyFeature;
	
	//娱
	private String playFeature;
	
	//赠
	private String donateFeature;
	
	//产品特色表信息临时存放
	private String featureString;
	
	//概述
	private String summarizeFeature;
	
	//详情
	private String particularsFeature;
	
	//其他信息
	private String otherInformation;
	
	

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

	public String getSpecialDiscount() {
		return specialDiscount;
	}

	public void setSpecialDiscount(String specialDiscount) {
		this.specialDiscount = specialDiscount;
	}

	public String getImportantNotice() {
		return importantNotice;
	}

	public void setImportantNotice(String importantNotice) {
		this.importantNotice = importantNotice;
	}

	public String getTrafficInformation() {
		return trafficInformation;
	}

	public void setTrafficInformation(String trafficInformation) {
		this.trafficInformation = trafficInformation;
	}

	public String getEatFeature() {
		return eatFeature;
	}

	public void setEatFeature(String eatFeature) {
		this.eatFeature = eatFeature;
	}

	public String getLiveFeature() {
		return liveFeature;
	}

	public void setLiveFeature(String liveFeature) {
		this.liveFeature = liveFeature;
	}

	public String getGoFeature() {
		return goFeature;
	}

	public void setGoFeature(String goFeature) {
		this.goFeature = goFeature;
	}

	public String getTravelFeature() {
		return travelFeature;
	}

	public void setTravelFeature(String travelFeature) {
		this.travelFeature = travelFeature;
	}

	public String getBuyFeature() {
		return buyFeature;
	}

	public void setBuyFeature(String buyFeature) {
		this.buyFeature = buyFeature;
	}

	public String getPlayFeature() {
		return playFeature;
	}

	public void setPlayFeature(String playFeature) {
		this.playFeature = playFeature;
	}

	public String getDonateFeature() {
		return donateFeature;
	}

	public void setDonateFeature(String donateFeature) {
		this.donateFeature = donateFeature;
	}

	public String getFeatureString() {
		return featureString;
	}

	public void setFeatureString(String featureString) {
		this.featureString = featureString;
	}

	public String getSummarizeFeature() {
		return summarizeFeature;
	}

	public void setSummarizeFeature(String summarizeFeature) {
		this.summarizeFeature = summarizeFeature;
	}

	public String getParticularsFeature() {
		return particularsFeature;
	}

	public void setParticularsFeature(String particularsFeature) {
		this.particularsFeature = particularsFeature;
	}

	public String getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}
	
}
