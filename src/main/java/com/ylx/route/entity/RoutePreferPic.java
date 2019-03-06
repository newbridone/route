package com.ylx.route.entity;



/**
 * 线路产品基本信息实体
 * 
 * @author lucheng
 */
public class RoutePreferPic extends BaseBO {

	//全局唯一标识
	private static final long serialVersionUID = -3069014116359835452L;

	//首选图片ID(主键)
	private String preferImgId;
	
	//线路产品ID
	private String goodsRouteId;
	
	//是否笛风产品
	private String isIfs;
	
	//图片地址
	private String imgUrl;

	//图片名
	private String imgName;
	
	//是否主图(0非主图，1为主图)
	private String isMain;

	public String getPreferImgId() {
		return preferImgId;
	}

	public void setPreferImgId(String preferImgId) {
		this.preferImgId = preferImgId;
	}

	public String getGoodsRouteId() {
		return goodsRouteId;
	}

	public void setGoodsRouteId(String goodsRouteId) {
		this.goodsRouteId = goodsRouteId;
	}

	public String getIsIfs() {
		return isIfs;
	}

	public void setIsIfs(String isIfs) {
		this.isIfs = isIfs;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getIsMain() {
		return isMain;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}
	
}
