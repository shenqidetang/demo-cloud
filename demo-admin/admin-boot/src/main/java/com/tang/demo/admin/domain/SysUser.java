package com.tang.demo.admin.domain;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.List;

/**
 * @description: 用户
 * @author: tzq
 * @time: 2023/6/11 19:30
 */

public class SysUser {

    private Integer id;

    /**
     * 用户名
     */

    private String username;
    /**
     * 身份
     */
    private String nickname;
    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态：1-有效；0-禁用
     */
    private Integer status;


}
