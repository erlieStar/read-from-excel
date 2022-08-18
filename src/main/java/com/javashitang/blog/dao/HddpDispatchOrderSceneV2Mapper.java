package com.javashitang.blog.dao;

import com.javashitang.blog.entity.HddpDispatchOrderSceneV2;

public interface HddpDispatchOrderSceneV2Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(HddpDispatchOrderSceneV2 record);

    int insertSelective(HddpDispatchOrderSceneV2 record);

    HddpDispatchOrderSceneV2 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HddpDispatchOrderSceneV2 record);

    int updateByPrimaryKey(HddpDispatchOrderSceneV2 record);
}