package com.tang.demo.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tang.demo.admin.domain.SysOauthClient;
import com.tang.demo.admin.mapper.SysOauthClientMapper;
import com.tang.demo.admin.mapper.SysPermissionMapper;
import com.tang.demo.admin.service.ISysOauthClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/11 20:31
 */
@Service
@RequiredArgsConstructor
public class SysOauthClientServiceImpl extends ServiceImpl<SysOauthClientMapper,SysOauthClient> implements ISysOauthClientService {

    @Autowired
    private   SysOauthClientMapper sysOauthClientMapper;

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public SysOauthClient getById(String clientId) {
        SysOauthClient sysOauthClient = sysOauthClientMapper.getById(clientId);
        return  sysOauthClient;
    }
}
