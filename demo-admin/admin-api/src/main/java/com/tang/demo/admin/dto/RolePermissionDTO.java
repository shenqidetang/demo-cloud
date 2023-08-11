package com.tang.demo.admin.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @description:角色权限dto
 * @author: tzq
 * @time: 2023/6/9 16:05
 */
@Data
@Accessors(chain = true)
public class RolePermissionDTO {
    private Long roleId;
    private List<Long> permissionIds;
    private Long menuId;
}
