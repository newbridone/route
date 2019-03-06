package com.ylx.route.entity;

import java.util.Date;



/**
 * 线路产品基本信息实体
 * 
 * @author lucheng
 */
public class RouteBase extends BaseBO {

	//全局唯一标识
	private static final long serialVersionUID = 1555804413854915685L;

	//产品ID(主键)
	private String goodsRouteId;
	
	//产品编号
	private String productNumber;
	
	//线路分类
	private String goodsType;
	
    private String goodsTypeName;
	
	//一级目的地分组id 
	private Integer firstDestGroupId;
	
	//一级目的地分组name
	private String firstDestGroupName;
	
	//二级目的地分组id
	private Integer destGroupId;
	
	//二级目的地分组name
	private String destGroupName;
	
	//目的地大类id
	private Integer productNewLineTypeId;
	
	//目的地大类id
	private String productNewLineTypeName;
	
	//目的地分类id
	private Integer productNewLineDestId;
	
	//目的地分类name
	private String productNewLineDestName;
	
	//一级品类id
	private Integer firstClassBrandId;
	
	//一级品类name
	private String firstClassBrandName;
	
	//重要信息，成团地点
	private String beginPlaceDesc;
	
	//二级品类id
	private Integer classBrandId;
	
	//二级品类name
	private String classBrandName;
	
	//最低利润率 为0表示没有值
	private Double minProfitRate;
	
	//最高利润率 为0表示没有值
	private Double maxProfitRate;
	
	//平均利润率 为0表示没有值
	private Double avgProfitRate;
	
	//品牌id
	private Integer brandId;
	
	//品牌名称
	private String brandName;
	
	//目的地洲
	private String desContinentName;
	
	//目的地国家
	private String desCountryName;
	
	//目的地省份
	private String desProvinceName;
	
	//目的地城市
	private String desCityName;
	
	//目的地区县
	private String desCountyName;
	
	//线路票种ID
	private String routeId;
	
	//产品名称
	private String goodsName;
	
	//产品状态（0：业务员待提交审核 1：运营部审核中  5：上架 9：下架）
    private String stateFlg;

    //审核阶段（0：默认，1：驳回）
    private String examinStage;

    //提交人
    private String submitUser;
    
    //提交时间
    private Date submitTime;
    
    //驳回人
    private String rejectUser;
    
    //驳回时间
    private Date rejectTime;
    
    //上架人
    private String shelvesUser;
    
    //上架时间
    private Date shelvesTime;
    
    //下架人
    private String offShelvesUser;
    
    //下架时间
    private Date offShelvesTime;
    
    //下架原因说明
    private String offShelvesExplain;
	
	//节日的名字(0:请选择 1:元旦 2:元宵 3:清明 4:五一 5:端午 6:中秋 7: 国庆 8:圣诞) code_type_id:2100
	private String festaName;
	
	//存放节日的名字所对应的codeValue值
	private String festaNameExplain;
	
	//资源名称
	private String mainName;
	
	//资源名称后缀
	private String lastName;
	
	//采购方式
	private String procurementMethods;
	
	//目的地
	private String destination;
	
	//供应商OP
	private String supplierOp;
	
	//供应商ID
	private String supplierId;
	
	//自定义标签
	private String definedLabel;
	
	//特色词1
	private String otherCharacter1;
	
	//特色词2
	private String otherCharacter2;
	
	//特色词3
	private String otherCharacter3;
	
	//特色词4
	private String otherCharacter4;
	
	//特色词5
	private String otherCharacter5;
	
	//特色词6
	private String otherCharacter6;
	
	//产品经理推荐
	private String recommentProducts;
	
	//目的地景点
	private String destinationScenic;
	
	//首选图片
	private String firstPicture;
	
	//产品价格
	private String routePrice;
	
	//是否多行程（0：不是，1：是）
	private Integer isSupportMultipleJourney;
	
	//去时交通
	private String trafficGo;
	
	//返时交通
	private String trafficBack;
	
	//行程天数
	private String daytimeCount;
	
	//行程夜数
	private String lightCount;
	
	//图片地址
	private String imgUrl;
	
	//笛风分销价
	private Integer dfPrice;
	
	//成人同行价
	private Integer adultPeerPrice;
	
	//出发城市编码
	private Integer startCityCode;
	
	//出发城市
	private String startCity;
	
	//起价更新时间，用来判断产品是否过期
    private Date date;
	
	//笛风对接新加字段
	//0：非笛风产品 1：笛风产品，且有效
  	private String isIfs;
  	
  	//价格排序(0:低到高  1:高到低)
  	private String sortFlg;
  	
  	//费用包含
  	private String feeContain;
  	
  	//费用不包含
  	private String feeContainNo;
  	

  	private Date createTimeStart;
  	
  	private Date createTimeEnd;
  	
  	//后台管理中传来的开始和结束筛选时间字符串
  	private String quertTimeStart;
  	private String quertTimeEnd;

  	// 销量
  	private Integer sales;
  	
  	//返佣模式(1:比例；2:金额)
    private String rebateFlg;
    
    //儿童返佣值
    private Integer rebateNumberChild;
    
    //返佣值
    private Integer rebateNumber;
    
    //是否返佣（0：不返佣，1：返佣）
    private String isRebate;
  	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public String getSortFlg() {
		return sortFlg;
	}

	public void setSortFlg(String sortFlg) {
		this.sortFlg = sortFlg;
	}

	public String getGoodsRouteId() {
		return goodsRouteId;
	}

	public void setGoodsRouteId(String goodsRouteId) {
		this.goodsRouteId = goodsRouteId;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}

	public Integer getFirstDestGroupId() {
		return firstDestGroupId;
	}

	public String getFirstDestGroupName() {
		return firstDestGroupName;
	}

	public Integer getDestGroupId() {
		return destGroupId;
	}

	public String getDestGroupName() {
		return destGroupName;
	}

	public Integer getProductNewLineDestId() {
		return productNewLineDestId;
	}

	public String getProductNewLineDestName() {
		return productNewLineDestName;
	}

	public Integer getClassBrandId() {
		return classBrandId;
	}

	public String getClassBrandName() {
		return classBrandName;
	}

	public void setFirstDestGroupId(Integer firstDestGroupId) {
		this.firstDestGroupId = firstDestGroupId;
	}

	public void setFirstDestGroupName(String firstDestGroupName) {
		this.firstDestGroupName = firstDestGroupName;
	}

	public void setDestGroupId(Integer destGroupId) {
		this.destGroupId = destGroupId;
	}

	public void setDestGroupName(String destGroupName) {
		this.destGroupName = destGroupName;
	}

	public Integer getProductNewLineTypeId() {
		return productNewLineTypeId;
	}

	public String getProductNewLineTypeName() {
		return productNewLineTypeName;
	}

	public void setProductNewLineTypeId(Integer productNewLineTypeId) {
		this.productNewLineTypeId = productNewLineTypeId;
	}

	public void setProductNewLineTypeName(String productNewLineTypeName) {
		this.productNewLineTypeName = productNewLineTypeName;
	}

	public void setProductNewLineDestId(Integer productNewLineDestId) {
		this.productNewLineDestId = productNewLineDestId;
	}

	public void setProductNewLineDestName(String productNewLineDestName) {
		this.productNewLineDestName = productNewLineDestName;
	}

	public Integer getFirstClassBrandId() {
		return firstClassBrandId;
	}

	public String getFirstClassBrandName() {
		return firstClassBrandName;
	}

	public void setFirstClassBrandId(Integer firstClassBrandId) {
		this.firstClassBrandId = firstClassBrandId;
	}

	public void setFirstClassBrandName(String firstClassBrandName) {
		this.firstClassBrandName = firstClassBrandName;
	}

	public String getBeginPlaceDesc() {
		return beginPlaceDesc;
	}

	public void setBeginPlaceDesc(String beginPlaceDesc) {
		this.beginPlaceDesc = beginPlaceDesc;
	}

	public void setClassBrandId(Integer classBrandId) {
		this.classBrandId = classBrandId;
	}

	public void setClassBrandName(String classBrandName) {
		this.classBrandName = classBrandName;
	}

	public Double getMinProfitRate() {
		return minProfitRate;
	}

	public void setMinProfitRate(Double minProfitRate) {
		this.minProfitRate = minProfitRate;
	}

	public Double getMaxProfitRate() {
		return maxProfitRate;
	}

	public void setMaxProfitRate(Double maxProfitRate) {
		this.maxProfitRate = maxProfitRate;
	}

	public Double getAvgProfitRate() {
		return avgProfitRate;
	}

	public void setAvgProfitRate(Double avgProfitRate) {
		this.avgProfitRate = avgProfitRate;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getDesContinentName() {
		return desContinentName;
	}

	public void setDesContinentName(String desContinentName) {
		this.desContinentName = desContinentName;
	}

	public String getDesCountryName() {
		return desCountryName;
	}

	public void setDesCountryName(String desCountryName) {
		this.desCountryName = desCountryName;
	}

	public String getDesProvinceName() {
		return desProvinceName;
	}

	public void setDesProvinceName(String desProvinceName) {
		this.desProvinceName = desProvinceName;
	}

	public String getDesCityName() {
		return desCityName;
	}

	public void setDesCityName(String desCityName) {
		this.desCityName = desCityName;
	}

	public String getDesCountyName() {
		return desCountyName;
	}

	public void setDesCountyName(String desCountyName) {
		this.desCountyName = desCountyName;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getStateFlg() {
		return stateFlg;
	}

	public void setStateFlg(String stateFlg) {
		this.stateFlg = stateFlg;
	}

	public String getExaminStage() {
		return examinStage;
	}

	public void setExaminStage(String examinStage) {
		this.examinStage = examinStage;
	}

	public String getSubmitUser() {
		return submitUser;
	}

	public void setSubmitUser(String submitUser) {
		this.submitUser = submitUser;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public String getRejectUser() {
		return rejectUser;
	}

	public void setRejectUser(String rejectUser) {
		this.rejectUser = rejectUser;
	}

	public Date getRejectTime() {
		return rejectTime;
	}

	public void setRejectTime(Date rejectTime) {
		this.rejectTime = rejectTime;
	}

	public String getShelvesUser() {
		return shelvesUser;
	}

	public void setShelvesUser(String shelvesUser) {
		this.shelvesUser = shelvesUser;
	}

	public Date getShelvesTime() {
		return shelvesTime;
	}

	public void setShelvesTime(Date shelvesTime) {
		this.shelvesTime = shelvesTime;
	}

	public String getOffShelvesUser() {
		return offShelvesUser;
	}

	public void setOffShelvesUser(String offShelvesUser) {
		this.offShelvesUser = offShelvesUser;
	}

	public Date getOffShelvesTime() {
		return offShelvesTime;
	}

	public void setOffShelvesTime(Date offShelvesTime) {
		this.offShelvesTime = offShelvesTime;
	}

	public String getFestaName() {
		return festaName;
	}

	public void setFestaName(String festaName) {
		this.festaName = festaName;
	}

	public String getFestaNameExplain() {
		return festaNameExplain;
	}

	public void setFestaNameExplain(String festaNameExplain) {
		this.festaNameExplain = festaNameExplain;
	}

	public String getMainName() {
		return mainName;
	}

	public void setMainName(String mainName) {
		this.mainName = mainName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProcurementMethods() {
		return procurementMethods;
	}

	public void setProcurementMethods(String procurementMethods) {
		this.procurementMethods = procurementMethods;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
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

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Integer getAdultPeerPrice() {
		return adultPeerPrice;
	}

	public void setAdultPeerPrice(Integer adultPeerPrice) {
		this.adultPeerPrice = adultPeerPrice;
	}

	public Integer getStartCityCode() {
		return startCityCode;
	}

	public void setStartCityCode(Integer startCityCode) {
		this.startCityCode = startCityCode;
	}

	public String getStartCity() {
		return startCity;
	}

	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}

	public String getSupplierOp() {
		return supplierOp;
	}

	public void setSupplierOp(String supplierOp) {
		this.supplierOp = supplierOp;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getDefinedLabel() {
		return definedLabel;
	}

	public void setDefinedLabel(String definedLabel) {
		this.definedLabel = definedLabel;
	}

	public String getOtherCharacter1() {
		return otherCharacter1;
	}

	public void setOtherCharacter1(String otherCharacter1) {
		this.otherCharacter1 = otherCharacter1;
	}

	public String getOtherCharacter2() {
		return otherCharacter2;
	}

	public void setOtherCharacter2(String otherCharacter2) {
		this.otherCharacter2 = otherCharacter2;
	}

	public String getOtherCharacter3() {
		return otherCharacter3;
	}

	public void setOtherCharacter3(String otherCharacter3) {
		this.otherCharacter3 = otherCharacter3;
	}

	public String getOtherCharacter4() {
		return otherCharacter4;
	}

	public void setOtherCharacter4(String otherCharacter4) {
		this.otherCharacter4 = otherCharacter4;
	}

	public String getOtherCharacter5() {
		return otherCharacter5;
	}

	public void setOtherCharacter5(String otherCharacter5) {
		this.otherCharacter5 = otherCharacter5;
	}

	public String getOtherCharacter6() {
		return otherCharacter6;
	}

	public void setOtherCharacter6(String otherCharacter6) {
		this.otherCharacter6 = otherCharacter6;
	}

	public String getRecommentProducts() {
		return recommentProducts;
	}

	public void setRecommentProducts(String recommentProducts) {
		this.recommentProducts = recommentProducts;
	}

	public String getDestinationScenic() {
		return destinationScenic;
	}

	public void setDestinationScenic(String destinationScenic) {
		this.destinationScenic = destinationScenic;
	}

	public String getFirstPicture() {
		return firstPicture;
	}

	public void setFirstPicture(String firstPicture) {
		this.firstPicture = firstPicture;
	}

	public String getRoutePrice() {
		return routePrice;
	}

	public Integer getDfPrice() {
		return dfPrice;
	}

	public void setDfPrice(Integer dfPrice) {
		this.dfPrice = dfPrice;
	}

	public void setRoutePrice(String routePrice) {
		this.routePrice = routePrice;
	}

	public String getIsIfs() {
		return isIfs;
	}

	public void setIsIfs(String isIfs) {
		this.isIfs = isIfs;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeStart(Date createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}


	public String getQuertTimeStart() {
		return quertTimeStart;
	}

	public void setQuertTimeStart(String quertTimeStart) {
		this.quertTimeStart = quertTimeStart;
	}

	public String getQuertTimeEnd() {
		return quertTimeEnd;
	}

	public void setQuertTimeEnd(String quertTimeEnd) {
		this.quertTimeEnd = quertTimeEnd;
	}

	public String getOffShelvesExplain() {
		return offShelvesExplain;
	}

	public void setOffShelvesExplain(String offShelvesExplain) {
		this.offShelvesExplain = offShelvesExplain;
	}

	public String getRebateFlg() {
		return rebateFlg;
	}

	public void setRebateFlg(String rebateFlg) {
		this.rebateFlg = rebateFlg;
	}

	public Integer getRebateNumber() {
		return rebateNumber;
	}

	public void setRebateNumber(Integer rebateNumber) {
		this.rebateNumber = rebateNumber;
	}
	
	public String getIsRebate() {
		return isRebate;
	}

	public void setIsRebate(String isRebate) {
		this.isRebate = isRebate;
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

	public Integer getRebateNumberChild() {
		return rebateNumberChild;
	}

	public void setRebateNumberChild(Integer rebateNumberChild) {
		this.rebateNumberChild = rebateNumberChild;
	}


	
}
