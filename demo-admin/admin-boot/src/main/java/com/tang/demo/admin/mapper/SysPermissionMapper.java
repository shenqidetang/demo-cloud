package com.tang.demo.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tang.demo.admin.domain.SysPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/11 18:51
 */
@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

   List<SysPermission> listPermRoles();

   List<String> listUserCodes(Long userId);
}
