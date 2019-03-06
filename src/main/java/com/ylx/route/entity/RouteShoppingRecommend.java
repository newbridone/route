package com.ylx.route.entity;


/**
 * 购物推荐
 * 
 * @author lucheng
 */
public class RouteShoppingRecommend extends BaseBO {

	//全局唯一标识
	private static final long serialVersionUID = -5329785308999784990L;

	//推荐购物店编号(主键)
	private String shoppingNumber;
	
	//对应行程ID
	private Integer journeyId;
	
	//线路产品ID
	private String goodsRouteId;
	
	//推荐购物店名称
	private String shoppingName;
	
	//营业产品
	private String businessProduct;
	
	//说明
	private String shoppingRecommendExpanin;
	
	//线路行程编号
	private String tripId;
	
	//行程第几天
	private Integer shoppingDay;

	public String getShoppingNumber() {
		return shoppingNumber;
	}

	public void setShoppingNumber(String shoppingNumber) {
		this.shoppingNumber = shoppingNumber;
	}

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

	public String getShoppingName() {
		return shoppingName;
	}

	public void setShoppingName(String shoppingName) {
		this.shoppingName = shoppingName;
	}

	public String getBusinessProduct() {
		return businessProduct;
	}

	public void setBusinessProduct(String businessProduct) {
		this.businessProduct = businessProduct;
	}

	public String getShoppingRecommendExpanin() {
		return shoppingRecommendExpanin;
	}

	public void setShoppingRecommendExpanin(String shoppingRecommendExpanin) {
		this.shoppingRecommendExpanin = shoppingRecommendExpanin;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public Integer getShoppingDay() {
		return shoppingDay;
	}

	public void setShoppingDay(Integer shoppingDay) {
		this.shoppingDay = shoppingDay;
	}
}
