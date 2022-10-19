package com.javashitang.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lilimin
 * @Date 2022/10/19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo {

    private String orderCode;

    private String targetType;

    private String forecastCompleteDate;
}
