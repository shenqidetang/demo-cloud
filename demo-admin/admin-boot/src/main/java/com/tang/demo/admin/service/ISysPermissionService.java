package com.tang.demo.admin.service;

import com.tang.demo.admin.domain.SysPermission;

import java.util.List;

public interface ISysPermissionService {
    boolean   refreshPermRolesRules();
    List<SysPermission> listPermRoles();

}
