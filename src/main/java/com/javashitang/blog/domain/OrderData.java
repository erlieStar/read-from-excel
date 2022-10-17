package com.javashitang.blog.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Author lilimin
 * @Date 2022/10/16
 */
@Data
public class OrderData {

    @ExcelProperty(index = 2)
    private String orderCode;

    @ExcelProperty(index = 4)
    private Integer orderType;

    @ExcelProperty(index = 5)
    private Integer orderState;

    @ExcelProperty(index = 10)
    private String orderZe;

    @ExcelProperty(index = 11)
    private String orderZeCode;

    @ExcelProperty(index = 27)
    private String ratingAddress;
}
