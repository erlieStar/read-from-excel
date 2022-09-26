package com.javashitang.blog.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Author lilimin
 * @Date 2022/9/21
 */
@Data
public class SupplierData {

    @ExcelProperty(index = 0)
    private String goodsCode;

    @ExcelProperty(index = 1)
    private String goodsName;

    @ExcelProperty(index = 4)
    private String supplierId;

}
