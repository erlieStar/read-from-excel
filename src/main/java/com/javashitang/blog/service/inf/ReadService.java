package com.javashitang.blog.service.inf;

import com.javashitang.blog.common.ServerResponse;

/**
 * @Author: lilimin
 * @Date: 2019/4/9 16:00
 */
public interface ReadService {

    ServerResponse mapping();

    ServerResponse category();

    ServerResponse supplier();

    ServerResponse order();

    ServerResponse saveData();
}
