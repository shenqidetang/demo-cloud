package com.tang.wx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: tzq
 * @time: 2023/7/21 16:36
 */
@RestController
@RequestMapping("/wechat")
@Slf4j
public class WeChatController {


    @GetMapping(value = "/portal/{appId}")
    public void  authPortal(@PathVariable String appid){
        log.info("appId:{}",appid);
    }
}
