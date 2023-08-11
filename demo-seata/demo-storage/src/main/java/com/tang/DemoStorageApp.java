package com.tang;

import io.seata.config.springcloud.EnableSeataSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/30 16:44
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableSeataSpringConfig
public class DemoStorageApp {
    public static void main(String[] args) {
        SpringApplication.run(DemoStorageApp.class,args);
    }
}
