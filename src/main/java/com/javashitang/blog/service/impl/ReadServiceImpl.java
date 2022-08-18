package com.javashitang.blog.service.impl;

import com.javashitang.blog.common.ServerResponse;
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

    @Override
    public ServerResponse mapping() {
        try {
            doMapping();
        } catch (Exception e) {
            log.info("doMapping error", e);
            return ServerResponse.error();
        }
        return ServerResponse.success();
    }

    public void doMapping() throws Exception {
        log.info("start doMapping");
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("/Users/li/材料-安装费对应关系表.xlsx"));
        XSSFSheet sheet = workbook.getSheet("对应关系");
        int lastRowIndex = sheet.getLastRowNum();
        log.info("lastRowIndex is: {}", lastRowIndex);
        for (int i = 1; i <= lastRowIndex; i++) {
            XSSFRow row = sheet.getRow(i);
            String content = row.getCell(0).getStringCellValue();
            log.info(content);
        }
        log.info("end");
    }
}
