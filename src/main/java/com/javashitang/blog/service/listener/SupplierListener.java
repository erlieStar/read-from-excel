package com.javashitang.blog.service.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.javashitang.blog.dao.OoZcasaGoodsSupplierMapper;
import com.javashitang.blog.domain.SupplierData;
import com.javashitang.blog.entity.OoZcasaGoodsSupplier;
import com.javashitang.blog.util.SpringUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

/**
 * @Author lilimin
 * @Date 2022/9/21
 */
@Slf4j
public class SupplierListener implements ReadListener<SupplierData> {

    private OoZcasaGoodsSupplierMapper ooZcasaGoodsSupplierMapper = SpringUtil.getBean(OoZcasaGoodsSupplierMapper.class);

    private Long rowNum = 0L;

    Map<String, OoZcasaGoodsSupplier> supplierMap = Maps.newHashMap();

    @Override
    public void invoke(SupplierData supplierData, AnalysisContext analysisContext) {
        rowNum++;
        System.out.println(supplierData);
        OoZcasaGoodsSupplier supplier = supplierMap.get(supplierData.getGoodsCode());
        if (supplier != null) {
            List<String> supplierIdList = supplier.getSupplierIdList();
            supplierIdList.add(supplierData.getSupplierId());
        } else {
            OoZcasaGoodsSupplier goodsSupplier = new OoZcasaGoodsSupplier();
            goodsSupplier.setGoodsCode(supplierData.getGoodsCode());
            goodsSupplier.setGoodsName(supplierData.getGoodsName());
            goodsSupplier.setSupplierIdList(Lists.newArrayList(supplierData.getSupplierId()));
            supplierMap.put(supplierData.getGoodsCode(), goodsSupplier);
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("doAfterAllAnalysed");
        System.out.println(rowNum);
        System.out.println(supplierMap.size());
        for (Map.Entry<String, OoZcasaGoodsSupplier> entry : supplierMap.entrySet()) {
            OoZcasaGoodsSupplier supplier = entry.getValue();
            supplier.setSupplierIds(String.join(",", supplier.getSupplierIdList()));
            ooZcasaGoodsSupplierMapper.insertSelective(supplier);
        }
    }
}
