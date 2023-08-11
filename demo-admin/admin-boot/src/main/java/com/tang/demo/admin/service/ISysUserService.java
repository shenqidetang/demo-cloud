package com.tang.demo.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tang.demo.admin.domain.SysUser;
import com.tang.demo.admin.dto.UserAuthDTO;

public interface ISysUserService extends IService<SysUser> {
    UserAuthDTO getByUsername(String username);

}
