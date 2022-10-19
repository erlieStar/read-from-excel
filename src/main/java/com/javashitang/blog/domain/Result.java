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
public class Result<T> {

    private String code;

    private T data;
}