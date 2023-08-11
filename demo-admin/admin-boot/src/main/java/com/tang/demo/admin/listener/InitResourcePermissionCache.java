package com.tang.demo.admin.listener;

import com.tang.demo.admin.service.ISysPermissionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @description: 启动监听器，初始化角色权限
 * @author: tzq
 * @time: 2023/6/9 16:13
 */
@Component
@AllArgsConstructor
@Slf4j
public class InitResourcePermissionCache implements CommandLineRunner {

    @Autowired
    private ISysPermissionService iSysPermissionService;

    @Override
    public void run(String... args) {
        iSysPermissionService.refreshPermRolesRules();
    }
}