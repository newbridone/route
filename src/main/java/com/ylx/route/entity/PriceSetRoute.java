package com.ylx.route.entity;



public class PriceSetRoute extends BaseBO{
	
	private static final long serialVersionUID = 3146576961225983732L;

	//报价id
	private String priceSetRouteId;
	
	//产品id
	private String goodsRouteId;
	//一级分类id(跟团游，自助游等)
    private String goodsTypeFirstId;

    private String goodsTypeFirstName;

    //二级分类id(常规跟团，半跟团等)
    private String goodsTypeSecondId;

    private String goodsTypeSecondName;
    
    //三级分类id(出境长线，出境短线等)
    private String goodsTypeThirdId;

    private String goodsTypeThirdName;

    //目的地大类id
    private String destGroupId;

    private String destGroupName;

    //1：固定，2，比例
    private String setMode;

    //成人利润（set_mode为1则为固定，2则为比例）
    private String adultAmount;
    
    //儿童利润（set_mode为1则为固定，2则为比例）
    private String childAmount;
    
    //提价级别（1：跟团游等大类，2：常规跟团，半自助等  3：国内长线，出境短线等  4:目的地大类）
    private String priceLevel; 
    
    //目的地分类名称
    private String secondDestGroupName;
    
	public String getPriceSetRouteId() {
		return priceSetRouteId;
	}

	public String getGoodsTypeFirstId() {
		return goodsTypeFirstId;
	}

	public String getGoodsRouteId() {
		return goodsRouteId;
	}

	public void setGoodsRouteId(String goodsRouteId) {
		this.goodsRouteId = goodsRouteId;
	}

	public String getGoodsTypeFirstName() {
		return goodsTypeFirstName;
	}

	public String getGoodsTypeSecondId() {
		return goodsTypeSecondId;
	}

	public String getGoodsTypeSecondName() {
		return goodsTypeSecondName;
	}

	public String getGoodsTypeThirdId() {
		return goodsTypeThirdId;
	}

	public void setGoodsTypeThirdId(String goodsTypeThirdId) {
		this.goodsTypeThirdId = goodsTypeThirdId;
	}

	public String getGoodsTypeThirdName() {
		return goodsTypeThirdName;
	}

	public void setGoodsTypeThirdName(String goodsTypeThirdName) {
		this.goodsTypeThirdName = goodsTypeThirdName;
	}

	public String getDestGroupId() {
		return destGroupId;
	}

	public String getDestGroupName() {
		return destGroupName;
	}

	public String getSetMode() {
		return setMode;
	}

	public String getAdultAmount() {
		return adultAmount;
	}

	public void setAdultAmount(String adultAmount) {
		this.adultAmount = adultAmount;
	}

	public String getChildAmount() {
		return childAmount;
	}

	public void setChildAmount(String childAmount) {
		this.childAmount = childAmount;
	}

	public String getPriceLevel() {
		return priceLevel;
	}

	public void setPriceLevel(String priceLevel) {
		this.priceLevel = priceLevel;
	}

	public String getSecondDestGroupName() {
		return secondDestGroupName;
	}

	public void setSecondDestGroupName(String secondDestGroupName) {
		this.secondDestGroupName = secondDestGroupName;
	}

	public void setPriceSetRouteId(String priceSetRouteId) {
		this.priceSetRouteId = priceSetRouteId;
	}

	public void setGoodsTypeFirstId(String goodsTypeFirstId) {
		this.goodsTypeFirstId = goodsTypeFirstId;
	}

	public void setGoodsTypeFirstName(String goodsTypeFirstName) {
		this.goodsTypeFirstName = goodsTypeFirstName;
	}

	public void setGoodsTypeSecondId(String goodsTypeSecondId) {
		this.goodsTypeSecondId = goodsTypeSecondId;
	}

	public void setGoodsTypeSecondName(String goodsTypeSecondName) {
		this.goodsTypeSecondName = goodsTypeSecondName;
	}

	public void setDestGroupId(String destGroupId) {
		this.destGroupId = destGroupId;
	}

	public void setDestGroupName(String destGroupName) {
		this.destGroupName = destGroupName;
	}

	public void setSetMode(String setMode) {
		this.setMode = setMode;
	}

}