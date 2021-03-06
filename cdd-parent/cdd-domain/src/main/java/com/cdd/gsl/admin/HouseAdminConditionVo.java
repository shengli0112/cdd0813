package com.cdd.gsl.admin;

public class HouseAdminConditionVo {

    private String city;

    private String county;

    private String town;

    //房源类型 1 厂房 2 仓库 3 土地
    private Integer houseType;

    //房源使用类型 1 求租 2 求购 3 出租 4 出售
    private Integer houseUseType;

    //楼层 1 一层 2 二层 3 三层及以上 4 独栋 5 独院
    private Integer floor;

    //面积 开始 类似 100
    private Integer areaFrom;

    //面积 结束 类似 10000
    private Integer areaTo;

    //面积排序 1 默认排序 2 面积从小到大 3 面积从大到小
    private Integer areaOrder;

    //价格 开始 类似 100
    private Integer priceFrom;

    //价格 结束 类似 10000
    private Integer priceTo;

    //价格顺序 0 默认顺序 1 价格从小到大 2 价格从大到小
    private Integer priceOrder;

    //第几页
    private Integer page=1;

    //每页多少条记录
    private Integer limit = 10;

    private Integer from;

    private Long userId;

    private String keyword;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public Integer getHouseUseType() {
        return houseUseType;
    }

    public void setHouseUseType(Integer houseUseType) {
        this.houseUseType = houseUseType;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }



    public Integer getAreaOrder() {
        return areaOrder;
    }

    public void setAreaOrder(Integer areaOrder) {
        this.areaOrder = areaOrder;
    }

    public Integer getAreaFrom() {
        return areaFrom;
    }

    public void setAreaFrom(Integer areaFrom) {
        this.areaFrom = areaFrom;
    }

    public Integer getAreaTo() {
        return areaTo;
    }

    public void setAreaTo(Integer areaTo) {
        this.areaTo = areaTo;
    }



    public Integer getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(Integer priceOrder) {
        this.priceOrder = priceOrder;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getFrom() {
        return (page-1) * limit;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(Integer priceFrom) {
        this.priceFrom = priceFrom;
    }

    public Integer getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(Integer priceTo) {
        this.priceTo = priceTo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
