package com.javashitang.blog.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Author lilimin
 * @Date 2022/8/18
 */
@Data
public class CategoryData {

    @ExcelProperty(index = 0)
    private String categoryLevel;

    @ExcelProperty(index = 1)
    private String categoryType;

    @ExcelProperty(index = 2)
    private String categoryTypeCode;

    @ExcelProperty(index = 3)
    private String customType;

    @ExcelProperty(index = 4)
    private Integer customTypeCode;
}
