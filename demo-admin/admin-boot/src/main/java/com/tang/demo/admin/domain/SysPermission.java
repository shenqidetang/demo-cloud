package com.tang.demo.admin.domain;

import lombok.Data;

import java.util.List;

/**
 * @description: 权限
 * @author: tzq
 * @time: 2023/6/11 18:54
 */
@Data
public class SysPermission {
    private String urlPerm;  //接口路径
    private List<String>  roles;  //权限名

    @Override
    public String toString() {
        return "SysPermission{" +
                "urlPerm='" + urlPerm + '\'' +
                ", roles=" + roles +
                '}';
    }
}
