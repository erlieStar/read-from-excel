package com.javashitang.blog.service.impl;

import com.alibaba.excel.EasyExcel;
import com.javashitang.blog.common.ServerResponse;
import com.javashitang.blog.domain.CategoryData;
import com.javashitang.blog.domain.MappingData;
import com.javashitang.blog.domain.SupplierData;
import com.javashitang.blog.service.listener.CategoryListener;
import com.javashitang.blog.service.listener.MappingListener;
import com.javashitang.blog.service.inf.ReadService;
import com.javashitang.blog.service.listener.SupplierListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: lilimin
 * @Date: 2019/4/9 21:47
 */
@Slf4j
@Service
public class ReadServiceImpl implements ReadService {

    private static final String fileName = "/Users/li/材料-安装费对应关系表.xlsx";

    private static final String category_fileName = "/Users/li/安装费-材料对应关系项目.xlsx";

    private static final String supplier_fileName = "/Users/li/安装费-材料对应关系项目.xlsx";


    @Override
    public ServerResponse mapping() {
        log.info("mapping");
        EasyExcel.read(fileName, MappingData.class, new MappingListener()).sheet("对应关系").headRowNumber(2).doRead();
        return ServerResponse.success();
    }

    @Override
    public ServerResponse category() {
        log.info("category");
        EasyExcel.read(category_fileName, CategoryData.class, new CategoryListener()).sheet("系统维护数据").doRead();
        return ServerResponse.success();
    }

    @Override
    public ServerResponse supplier() {
        log.info("supplier");
        EasyExcel.read(supplier_fileName, SupplierData.class, new SupplierListener()).sheet("工作表1").doRead();
        return ServerResponse.success();
    }
}
