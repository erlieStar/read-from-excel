package com.javashitang.blog.service.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.google.common.collect.ImmutableMap;
import com.javashitang.blog.dao.HddpCategoryCustomMappingRuleMapper;
import com.javashitang.blog.domain.CategoryData;
import com.javashitang.blog.entity.HddpCategoryCustomMappingRule;
import com.javashitang.blog.util.SpringUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @Author lilimin
 * @Date 2022/8/18
 */
@Slf4j
public class CategoryListener implements ReadListener<CategoryData> {

    Map<String, Integer> levelMap = ImmutableMap.of("三级", 3, "四级", 4);

    private HddpCategoryCustomMappingRuleMapper hddpCategoryCustomMappingRuleMapper = SpringUtil.getBean(HddpCategoryCustomMappingRuleMapper.class);

    private Long rowNum = 0L;

    @Override
    public void invoke(CategoryData categoryData, AnalysisContext analysisContext) {
        rowNum++;
        System.out.println(categoryData);
        HddpCategoryCustomMappingRule hddpCategoryCustomMappingRule = new HddpCategoryCustomMappingRule();
        hddpCategoryCustomMappingRule.setCategoryLevel(levelMap.get(categoryData.getCategoryLevel()));
        hddpCategoryCustomMappingRule.setCategoryTypeCode(categoryData.getCategoryTypeCode());
        hddpCategoryCustomMappingRule.setCategoryType(categoryData.getCategoryType());
        hddpCategoryCustomMappingRule.setCustomTypeCode(categoryData.getCustomTypeCode());
        hddpCategoryCustomMappingRule.setCustomType(categoryData.getCustomType());
        hddpCategoryCustomMappingRule.setCreateUser("lilm2");
        hddpCategoryCustomMappingRuleMapper.insertSelective(hddpCategoryCustomMappingRule);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("doAfterAllAnalysed");
        System.out.println(rowNum);
    }
}
