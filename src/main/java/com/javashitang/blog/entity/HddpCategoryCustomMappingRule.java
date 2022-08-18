package com.javashitang.blog.entity;

import java.time.LocalDateTime;

public class HddpCategoryCustomMappingRule {
    private Long id;

    private Integer categoryLevel;

    private String categoryTypeCode;

    private String categoryType;

    private Integer customTypeCode;

    private String customType;

    private String createUser;

    private LocalDateTime createTime;

    private String lastModifyUser;

    private LocalDateTime lastModifyTime;

    private Integer isDel;

    public HddpCategoryCustomMappingRule(Long id, Integer categoryLevel, String categoryTypeCode, String categoryType, Integer customTypeCode, String customType, String createUser, LocalDateTime createTime, String lastModifyUser, LocalDateTime lastModifyTime, Integer isDel) {
        this.id = id;
        this.categoryLevel = categoryLevel;
        this.categoryTypeCode = categoryTypeCode;
        this.categoryType = categoryType;
        this.customTypeCode = customTypeCode;
        this.customType = customType;
        this.createUser = createUser;
        this.createTime = createTime;
        this.lastModifyUser = lastModifyUser;
        this.lastModifyTime = lastModifyTime;
        this.isDel = isDel;
    }

    public HddpCategoryCustomMappingRule() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public String getCategoryTypeCode() {
        return categoryTypeCode;
    }

    public void setCategoryTypeCode(String categoryTypeCode) {
        this.categoryTypeCode = categoryTypeCode == null ? null : categoryTypeCode.trim();
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType == null ? null : categoryType.trim();
    }

    public Integer getCustomTypeCode() {
        return customTypeCode;
    }

    public void setCustomTypeCode(Integer customTypeCode) {
        this.customTypeCode = customTypeCode;
    }

    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
        this.customType = customType == null ? null : customType.trim();
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