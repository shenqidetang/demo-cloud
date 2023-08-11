package com.tang.demo.auth.controller;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.tang.common.base.result.R;
import com.tang.demo.admin.api.OAuthClientFeignClient;
import com.tang.demo.admin.api.UserFeignClient;
import feign.Param;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;


import java.security.KeyPair;
import java.security.Principal;

import java.security.interfaces.RSAPublicKey;
import java.util.Map;

/**
 * @description: 获取token 入口
 * @author: tzq
 * @time: 2023/6/8 23:20
 */
@RestController
@RequestMapping("/oauth")
@AllArgsConstructor
@Slf4j
@EnableFeignClients(basePackageClasses = {UserFeignClient.class, OAuthClientFeignClient.class})
public class AuthController {
    private final KeyPair keyPair;
    private final TokenEndpoint tokenEndpoint;

    @PostMapping("/token")
    public Object postAccessToken(
            Principal principal,
            @RequestParam Map<String, String> parameters
    ) throws HttpRequestMethodNotSupportedException {
        log.info("pic:{},parameters:{}",principal,parameters);
        Authentication client = (Authentication)principal;
        OAuth2AccessToken accessToken = tokenEndpoint.postAccessToken(principal, parameters).getBody();
        return R.ok(accessToken);
    }

    @GetMapping("/public-key")
    public Map<String,Object> getPublicKey(){
        RSAPublicKey publicKey= (RSAPublicKey) keyPair.getPublic();
        RSAKey key=new com.nimbusds.jose.jwk.RSAKey.Builder(publicKey).build();
        return new JWKSet(key).toJSONObject();
    }

    @GetMapping("/login")
    public void login(){
        System.out.println("login");
    }
}
