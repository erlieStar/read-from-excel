package com.javashitang.blog.service.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.javashitang.blog.dao.OoZcasaGoodsSupplierMapper;
import com.javashitang.blog.dao.OrderSearchInfoMapper;
import com.javashitang.blog.domain.OrderData;
import com.javashitang.blog.domain.SupplierData;
import com.javashitang.blog.entity.OoZcasaGoodsSupplier;
import com.javashitang.blog.entity.OrderSearchInfo;
import com.javashitang.blog.util.SpringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author lilimin
 * @Date 2022/9/21
 */
@Slf4j
public class OrderListener implements ReadListener<OrderData> {

    private OrderSearchInfoMapper orderSearchInfoMapper = SpringUtil.getBean(OrderSearchInfoMapper.class);

    private Long index = 3000030L;

    @Override
    public void invoke(OrderData orderData, AnalysisContext analysisContext) {
        OrderSearchInfo orderSearchInfo = new OrderSearchInfo();
        BeanUtils.copyProperties(orderData, orderSearchInfo);
        orderSearchInfo.setOrderCreateTime(LocalDateTime.now());
        orderSearchInfo.setLastModifyTime(LocalDateTime.now());
        orderSearchInfo.setCreateTime(LocalDateTime.now());
        orderSearchInfo.setUpdateTime(LocalDateTime.now());
        orderSearchInfo.setIsDel(0);
        orderSearchInfo.setId(index);
        orderSearchInfoMapper.insertSelective(orderSearchInfo);
        index++;
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("end");
    }
}
