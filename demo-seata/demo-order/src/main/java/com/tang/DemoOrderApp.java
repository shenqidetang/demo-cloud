package com.tang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/30 17:04
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DemoOrderApp {
    public static void main(String[] args) {
        SpringApplication.run(DemoOrderApp.class,args);
    }
}
