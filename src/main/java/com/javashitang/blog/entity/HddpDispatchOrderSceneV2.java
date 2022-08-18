package com.javashitang.blog.entity;

import java.time.LocalDateTime;

public class HddpDispatchOrderSceneV2 {
    private Long id;

    private Long relationId;

    private Integer sceneType;

    private String cityCode;

    private Long ziroomVersionId;

    private String style;

    private String styleName;

    private Integer productType;

    private String productTypeName;

    private Integer orderType;

    private LocalDateTime createTime;

    private LocalDateTime lastModifyTime;

    private Integer isDel;

    public HddpDispatchOrderSceneV2(Long id, Long relationId, Integer sceneType, String cityCode, Long ziroomVersionId, String style, String styleName, Integer productType, String productTypeName, Integer orderType, LocalDateTime createTime, LocalDateTime lastModifyTime, Integer isDel) {
        this.id = id;
        this.relationId = relationId;
        this.sceneType = sceneType;
        this.cityCode = cityCode;
        this.ziroomVersionId = ziroomVersionId;
        this.style = style;
        this.styleName = styleName;
        this.productType = productType;
        this.productTypeName = productTypeName;
        this.orderType = orderType;
        this.createTime = createTime;
        this.lastModifyTime = lastModifyTime;
        this.isDel = isDel;
    }

    public HddpDispatchOrderSceneV2() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public Integer getSceneType() {
        return sceneType;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Long getZiroomVersionId() {
        return ziroomVersionId;
    }

    public void setZiroomVersionId(Long ziroomVersionId) {
        this.ziroomVersionId = ziroomVersionId;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName == null ? null : styleName.trim();
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName == null ? null : productTypeName.trim();
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}