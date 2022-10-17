package com.javashitang.blog.dao;

import com.javashitang.blog.entity.OrderSearchInfo;

public interface OrderSearchInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderSearchInfo record);

    int insertSelective(OrderSearchInfo record);

    OrderSearchInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderSearchInfo record);

    int updateByPrimaryKey(OrderSearchInfo record);
}