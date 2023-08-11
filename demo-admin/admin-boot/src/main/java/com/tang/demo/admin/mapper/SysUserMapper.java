package com.tang.demo.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tang.demo.admin.domain.SysUser;
import com.tang.demo.admin.dto.UserAuthDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    UserAuthDTO getByUsername(String userName);




}
