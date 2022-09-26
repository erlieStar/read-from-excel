package com.javashitang.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OoZcasaGoodsSupplier {
    private Long id;

    private String goodsCode;

    private String goodsName;

    private String supplierIds;

    private List<String> supplierIdList;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer isDel;

    public OoZcasaGoodsSupplier(String goodsCode, String goodsName, List<String> supplierIdList) {
        this.goodsCode = goodsCode;
        this.goodsName = goodsName;
        this.supplierIdList = supplierIdList;
    }
}