package com.javashitang.blog.dao;

import com.javashitang.blog.entity.OoZcasaGoodsSupplier;

public interface OoZcasaGoodsSupplierMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OoZcasaGoodsSupplier record);

    int insertSelective(OoZcasaGoodsSupplier record);

    OoZcasaGoodsSupplier selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OoZcasaGoodsSupplier record);

    int updateByPrimaryKey(OoZcasaGoodsSupplier record);
}