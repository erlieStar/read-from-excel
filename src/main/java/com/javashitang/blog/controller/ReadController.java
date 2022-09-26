package com.javashitang.blog.controller;

import com.javashitang.blog.common.ServerResponse;
import com.javashitang.blog.service.inf.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author li
 */
@RestController
@RequestMapping("read")
public class ReadController {

    @Autowired
    private ReadService readService;

    @GetMapping("mapping")
    public ServerResponse mapping() {
        return readService.mapping();
    }

    @GetMapping("category")
    public ServerResponse category() {
        return readService.category();
    }

    @GetMapping("supplier")
    public ServerResponse supplier() {
        return readService.supplier();
    }
}
