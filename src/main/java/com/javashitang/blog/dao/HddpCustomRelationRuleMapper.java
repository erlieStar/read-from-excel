package com.javashitang.blog.dao;

import com.javashitang.blog.entity.HddpCustomRelationRule;

public interface HddpCustomRelationRuleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HddpCustomRelationRule record);

    int insertSelective(HddpCustomRelationRule record);

    HddpCustomRelationRule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HddpCustomRelationRule record);

    int updateByPrimaryKey(HddpCustomRelationRule record);
}