package com.tang.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/19 16:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateWayApp {
    public static void main(String[] args) {

        SpringApplication.run(GateWayApp.class);
    }
}
