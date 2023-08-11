package com.tang.demo.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tang.demo.admin.domain.SysOauthClient;

public interface ISysOauthClientService extends IService<SysOauthClient> {
    SysOauthClient getById(String clientId);
}
