package com.ylx.route.entity;



/**
 * 线路行程图片
 * 
 * @author lucheng
 */
public class RouteTripPic extends BaseBO {

	//全局唯一标识
	private static final long serialVersionUID = -2479769654903436669L;

	//图片ID(主键)
	private String imgId;
	
	//某段线路行程编号
	private String oneTripId;
	
	//线路行程图片路径
	private String imgUrl;
	
	//图片描述
	private String imgDescribe;

	public String getImgId() {
		return imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public String getOneTripId() {
		return oneTripId;
	}

	public void setOneTripId(String oneTripId) {
		this.oneTripId = oneTripId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getImgDescribe() {
		return imgDescribe;
	}

	public void setImgDescribe(String imgDescribe) {
		this.imgDescribe = imgDescribe;
	}
	

}
