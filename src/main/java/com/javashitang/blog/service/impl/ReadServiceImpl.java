package com.javashitang.blog.service.impl;

import cn.hutool.http.HttpUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.javashitang.blog.common.ServerResponse;
import com.javashitang.blog.domain.*;
import com.javashitang.blog.service.listener.CategoryListener;
import com.javashitang.blog.service.listener.MappingListener;
import com.javashitang.blog.service.inf.ReadService;
import com.javashitang.blog.service.listener.OrderListener;
import com.javashitang.blog.service.listener.SupplierListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: lilimin
 * @Date: 2019/4/9 21:47
 */
@Slf4j
@Service
public class ReadServiceImpl implements ReadService {

    private static final String fileName = "/Users/li/Desktop/材料-安装费对应关系表.xlsx";

    private static final String category_fileName = "/Users/li/安装费-材料对应关系项目.xlsx";

    private static final String supplier_fileName = "/Users/li/Desktop/供应商名称.xlsx";

    private static final String order_fileName = "/Users/li/Desktop/order.xlsx";

    @Override
    public ServerResponse mapping() {
        log.info("mapping");
        EasyExcel.read(fileName, MappingData.class, new MappingListener()).sheet("对应关系1011").headRowNumber(2).doRead();
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

    @Override
    public ServerResponse order() {
        log.info("order");
        EasyExcel.read(order_fileName, OrderData.class, new OrderListener()).sheet("工作表1").doRead();
        return ServerResponse.success();
    }

    @Override
    public ServerResponse saveData() {
        log.info("saveData");
        Map<String, Object> param = Maps.newHashMap();
        param.put("queryId", "012a48d9-c986-4594-82b2-cc5026e43ffa");
        param.put("executionTime", "2022-10-18");
        param.put("targetTypeExist", "1");
        param.put("orderTypeExist", "1");
        param.put("orderCodeExist", "1");
        param.put("forecastCompleteDateExist", "1");
        String result = HttpUtil.post("http://dataservice.kq.ziroom.com/dataApi/query", JSON.toJSONString(param));
        Result<List<OrderInfo>> rpcResp = JSON.parseObject(result, new TypeReference<Result<List<OrderInfo>>>() {});
        List<OrderInfo> orderInfos = rpcResp.getData();
        System.out.println(orderInfos.size());

        return ServerResponse.success();
    }
}
