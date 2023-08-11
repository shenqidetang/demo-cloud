package com.tang.demo.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tang.demo.admin.domain.SysPermission;
import com.tang.demo.admin.domain.SysUser;
import com.tang.demo.admin.dto.UserAuthDTO;
import com.tang.demo.admin.mapper.SysPermissionMapper;
import com.tang.demo.admin.mapper.SysUserMapper;
import com.tang.demo.admin.service.ISysUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/11 20:32
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public UserAuthDTO getByUsername(String username) {
        UserAuthDTO byUsername = sysUserMapper.getByUsername(username);
        List<String> codes = sysPermissionMapper.listUserCodes(byUsername.getUserId());
        byUsername.setRoles(codes);
        return byUsername;
    }
}
