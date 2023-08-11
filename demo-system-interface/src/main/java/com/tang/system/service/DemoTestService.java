package com.tang.system.service;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("demo")
public interface DemoTestService {

    @RequestMapping("test")
    public void test();
}
