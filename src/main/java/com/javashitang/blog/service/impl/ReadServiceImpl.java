package com.javashitang.blog.service.impl;

import com.alibaba.excel.EasyExcel;
import com.javashitang.blog.common.ServerResponse;
import com.javashitang.blog.domain.MappingData;
import com.javashitang.blog.service.MappingListener;
import com.javashitang.blog.service.inf.ReadService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: lilimin
 * @Date: 2019/4/9 21:47
 */
@Slf4j
@Service
public class ReadServiceImpl implements ReadService {

    private static final String fileName = "/Users/li/材料-安装费对应关系表.xlsx";

    @Override
    public ServerResponse mapping() {
        log.info("mapping");
        EasyExcel.read(fileName, MappingData.class, new MappingListener()).sheet("对应关系").headRowNumber(2).doRead();
        return ServerResponse.success();
    }
}
