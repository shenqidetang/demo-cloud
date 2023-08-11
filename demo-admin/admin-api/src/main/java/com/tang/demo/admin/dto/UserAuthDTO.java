package com.tang.demo.admin.dto;

import lombok.Data;

import java.util.List;

/**
 * @description:用户信息dto
 * @author: tzq
 * @time: 2023/6/9 16:06
 */
@Data
public class UserAuthDTO {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态：1-有效；0-禁用
     */
    private Integer status;

    /**
     * 用户角色编码集合 ["ROOT","ADMIN"]
     */

    private List<String> roles;
}
