package com.javashitang.blog.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Author lilimin
 * @Date 2022/8/18
 */
@Data
public class MappingData {

    @ExcelProperty(index = 0)
    private String city;

    @ExcelProperty(index = 1)
    private String version;

    @ExcelProperty(index = 2)
    private Long versionId;

    @ExcelProperty(index = 5)
    private String orderType;

    @ExcelProperty(index = 6)
    private String mainGoodSecondCategory;

    @ExcelProperty(index = 8)
    private String goodsCode;

    @ExcelProperty(index = 9)
    private String goodsName;

    @ExcelProperty(index = 11)
    private String relationCode;

    @ExcelProperty(index = 12)
    private String relationDesc;

    @ExcelProperty(index = 13)
    private Double dispatchCount;

    @ExcelProperty(index = 14)
    private String cost;
}
