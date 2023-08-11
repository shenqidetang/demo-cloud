package com.tang.demo.admin.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

/**
 * @description: 客户端用户
 * @author: tzq
 * @time: 2023/6/11 19:25
 */
@Data
public class SysOauthClient {

        @TableField("client_id")
        private String clientId;

        @TableField("resource_ids")
        private String resourceIds;

        /**
         * 客户端密钥
         */
        @TableField("client_secret")
        private String clientSecret;

        /**
         * 授权范围
         */
        private String scope;

        /**
         * 授权方式
         */
        @TableField("authorized_grant_types")
        private String authorizedGrantTypes;

        /**
         * 回调地址
         */
        @TableField("web_server_redirect_uri")
        private String webServerRedirectUri;

        /**
         * 权限列表
         */
        private String authorities;

        /**
         * 认证令牌时效
         */
        @TableField("access_token_validity")
        private Integer accessTokenValidity;

        /**
         * 刷新令牌时效
         */
        @TableField("refresh_token_validity")
        private Integer refreshTokenValidity;

        /**
         * 扩展信息
         */
        @TableField("additional_information")
        private String additionalInformation;

        /**
         * 是否自动放行
         */
        private String autoapprove;

}
