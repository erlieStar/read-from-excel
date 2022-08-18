package com.javashitang.blog.entity;

import java.time.LocalDateTime;

public class HddpCustomRelationRule {
    private Long id;

    private String mainGoodSecondCategory;

    private Integer mainGoodType;

    private String mainCode;

    private String mainDesc;

    private String relationGoodSecondCategory;

    private String relationGoodSecondCategoryCode;

    private Integer relationGoodType;

    private String relationCode;

    private String relationDesc;

    private Double dispatchCount;

    private String costSource;

    private String createUser;

    private LocalDateTime createTime;

    private String lastModifyUser;

    private LocalDateTime lastModifyTime;

    private Integer isDel;

    public HddpCustomRelationRule(Long id, String mainGoodSecondCategory, Integer mainGoodType, String mainCode, String mainDesc, String relationGoodSecondCategory, String relationGoodSecondCategoryCode, Integer relationGoodType, String relationCode, String relationDesc, Double dispatchCount, String costSource, String createUser, LocalDateTime createTime, String lastModifyUser, LocalDateTime lastModifyTime, Integer isDel) {
        this.id = id;
        this.mainGoodSecondCategory = mainGoodSecondCategory;
        this.mainGoodType = mainGoodType;
        this.mainCode = mainCode;
        this.mainDesc = mainDesc;
        this.relationGoodSecondCategory = relationGoodSecondCategory;
        this.relationGoodSecondCategoryCode = relationGoodSecondCategoryCode;
        this.relationGoodType = relationGoodType;
        this.relationCode = relationCode;
        this.relationDesc = relationDesc;
        this.dispatchCount = dispatchCount;
        this.costSource = costSource;
        this.createUser = createUser;
        this.createTime = createTime;
        this.lastModifyUser = lastModifyUser;
        this.lastModifyTime = lastModifyTime;
        this.isDel = isDel;
    }

    public HddpCustomRelationRule() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMainGoodSecondCategory() {
        return mainGoodSecondCategory;
    }

    public void setMainGoodSecondCategory(String mainGoodSecondCategory) {
        this.mainGoodSecondCategory = mainGoodSecondCategory == null ? null : mainGoodSecondCategory.trim();
    }

    public Integer getMainGoodType() {
        return mainGoodType;
    }

    public void setMainGoodType(Integer mainGoodType) {
        this.mainGoodType = mainGoodType;
    }

    public String getMainCode() {
        return mainCode;
    }

    public void setMainCode(String mainCode) {
        this.mainCode = mainCode == null ? null : mainCode.trim();
    }

    public String getMainDesc() {
        return mainDesc;
    }

    public void setMainDesc(String mainDesc) {
        this.mainDesc = mainDesc == null ? null : mainDesc.trim();
    }

    public String getRelationGoodSecondCategory() {
        return relationGoodSecondCategory;
    }

    public void setRelationGoodSecondCategory(String relationGoodSecondCategory) {
        this.relationGoodSecondCategory = relationGoodSecondCategory == null ? null : relationGoodSecondCategory.trim();
    }

    public String getRelationGoodSecondCategoryCode() {
        return relationGoodSecondCategoryCode;
    }

    public void setRelationGoodSecondCategoryCode(String relationGoodSecondCategoryCode) {
        this.relationGoodSecondCategoryCode = relationGoodSecondCategoryCode == null ? null : relationGoodSecondCategoryCode.trim();
    }

    public Integer getRelationGoodType() {
        return relationGoodType;
    }

    public void setRelationGoodType(Integer relationGoodType) {
        this.relationGoodType = relationGoodType;
    }

    public String getRelationCode() {
        return relationCode;
    }

    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode == null ? null : relationCode.trim();
    }

    public String getRelationDesc() {
        return relationDesc;
    }

    public void setRelationDesc(String relationDesc) {
        this.relationDesc = relationDesc == null ? null : relationDesc.trim();
    }

    public Double getDispatchCount() {
        return dispatchCount;
    }

    public void setDispatchCount(Double dispatchCount) {
        this.dispatchCount = dispatchCount;
    }

    public String getCostSource() {
        return costSource;
    }

    public void setCostSource(String costSource) {
        this.costSource = costSource == null ? null : costSource.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyUser() {
        return lastModifyUser;
    }

    public void setLastModifyUser(String lastModifyUser) {
        this.lastModifyUser = lastModifyUser == null ? null : lastModifyUser.trim();
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