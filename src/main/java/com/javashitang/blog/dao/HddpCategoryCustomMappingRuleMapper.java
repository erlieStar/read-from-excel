package com.javashitang.blog.dao;

import com.javashitang.blog.entity.HddpCategoryCustomMappingRule;

public interface HddpCategoryCustomMappingRuleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HddpCategoryCustomMappingRule record);

    int insertSelective(HddpCategoryCustomMappingRule record);

    HddpCategoryCustomMappingRule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HddpCategoryCustomMappingRule record);

    int updateByPrimaryKey(HddpCategoryCustomMappingRule record);
}