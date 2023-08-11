package com.tang.demo.admin;

import com.tang.demo.admin.api.OAuthClientFeignClient;
import com.tang.demo.admin.api.UserFeignClient;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/11 19:23
 */
@SpringBootApplication
@EnableDiscoveryClient
@Reference
public class AdminApp {
    public static void main(String[] args) {
        SpringApplication.run(AdminApp.class, args);
    }
}
