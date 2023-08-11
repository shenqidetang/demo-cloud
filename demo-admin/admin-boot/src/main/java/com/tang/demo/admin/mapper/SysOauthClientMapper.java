package com.tang.demo.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tang.demo.admin.domain.SysOauthClient;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysOauthClientMapper extends BaseMapper<SysOauthClient> {
    SysOauthClient getById(String clientId);
}
