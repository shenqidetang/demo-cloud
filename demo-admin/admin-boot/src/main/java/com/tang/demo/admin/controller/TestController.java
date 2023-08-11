package com.tang.demo.admin.controller;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import com.tang.demo.admin.service.impl.GoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/25 11:26
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    GoodService goodService;
    @RequestMapping("/login")
    public void login() {
        log.info("登录");
    }

    @RequestMapping("/zuolao")
    public void zuolao(){
        log.info("坐牢");
        goodService.good();
    }

    @RequestMapping("/dajie")
    public void dajie(){
        log.info("打劫");
        goodService.good();
    }

    @RequestMapping("/xingqi")
    public void xingqi(int year){
        log.info("刑期为:{}年",year);
    }
}
