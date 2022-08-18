package com.javashitang.blog.service.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.google.common.collect.ImmutableMap;
import com.javashitang.blog.dao.HddpCustomRelationRuleMapper;
import com.javashitang.blog.dao.HddpDispatchOrderSceneV2Mapper;
import com.javashitang.blog.domain.MappingData;
import com.javashitang.blog.entity.HddpCustomRelationRule;
import com.javashitang.blog.entity.HddpDispatchOrderSceneV2;
import com.javashitang.blog.util.SpringUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @Author lilimin
 * @Date 2022/8/18
 */
@Slf4j
public class MappingListener implements ReadListener<MappingData> {

    Map<String, Integer> orderTypeMap = ImmutableMap.of("新收订单", 11, "续约订单", 15);

    private HddpCustomRelationRuleMapper hddpCustomRelationRuleMapper = SpringUtil.getBean(HddpCustomRelationRuleMapper.class);

    private HddpDispatchOrderSceneV2Mapper hddpDispatchOrderSceneV2Mapper = SpringUtil.getBean(HddpDispatchOrderSceneV2Mapper.class);

    private Long rowNum = 0L;

    @Override
    public void invoke(MappingData mappingData, AnalysisContext analysisContext) {
        rowNum++;
        System.out.println(mappingData);
        HddpDispatchOrderSceneV2 hddpDispatchOrderSceneV2 = new HddpDispatchOrderSceneV2();
        hddpDispatchOrderSceneV2.setId(rowNum);
        hddpDispatchOrderSceneV2.setRelationId(rowNum);
        hddpDispatchOrderSceneV2.setCityCode("110000");
        hddpDispatchOrderSceneV2.setZiroomVersionId(mappingData.getVersionId());
        hddpDispatchOrderSceneV2.setOrderType(orderTypeMap.get(mappingData.getOrderType()));
        hddpDispatchOrderSceneV2.setSceneType(4);
        hddpDispatchOrderSceneV2Mapper.insertSelective(hddpDispatchOrderSceneV2);

        HddpCustomRelationRule hddpCustomRelationRule = new HddpCustomRelationRule();
        hddpCustomRelationRule.setId(rowNum);
        hddpCustomRelationRule.setMainGoodSecondCategory(mappingData.getMainGoodSecondCategory());
        hddpCustomRelationRule.setMainGoodType(5);
        hddpCustomRelationRule.setMainCode(mappingData.getGoodsCode());
        hddpCustomRelationRule.setMainDesc(mappingData.getGoodsName());

        hddpCustomRelationRule.setRelationGoodSecondCategory("安装");
        hddpCustomRelationRule.setRelationGoodSecondCategoryCode("DZ18");
        hddpCustomRelationRule.setRelationGoodType(5);
        hddpCustomRelationRule.setRelationCode(mappingData.getRelationCode());
        hddpCustomRelationRule.setRelationDesc(mappingData.getRelationDesc());
        hddpCustomRelationRule.setDispatchCount(mappingData.getDispatchCount());
        hddpCustomRelationRule.setCostSource(mappingData.getCost());
        hddpCustomRelationRule.setCreateUser("lilm2");
        hddpCustomRelationRuleMapper.insertSelective(hddpCustomRelationRule);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("doAfterAllAnalysed");
        System.out.println(rowNum);
    }
}
