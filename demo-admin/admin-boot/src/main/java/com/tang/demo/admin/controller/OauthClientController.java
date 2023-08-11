package com.tang.demo.admin.controller;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.tang.common.base.result.R;
import com.tang.demo.admin.domain.SysOauthClient;
import com.tang.demo.admin.dto.OAuth2ClientDTO;
import com.tang.demo.admin.service.ISysOauthClientService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: OAuthClientFeignClient定义接口
 * @author: tzq
 * @time: 2023/6/11 19:21
 */
@RequestMapping("/api/oauth-clients")
@Slf4j
@AllArgsConstructor
@RestController
public class OauthClientController {

    private final ISysOauthClientService iSysOauthClientService;

    @GetMapping("/getOAuth2ClientById")
    public R<OAuth2ClientDTO> getOAuth2ClientById(@RequestParam String clientId) {
        SysOauthClient client = iSysOauthClientService.getById(clientId);
        Assert.notNull(client, "OAuth2 客户端不存在");
        OAuth2ClientDTO oAuth2ClientDTO = new OAuth2ClientDTO();
        BeanUtil.copyProperties(client, oAuth2ClientDTO);
        log.info("oauth:{}",oAuth2ClientDTO);
        return R.ok(oAuth2ClientDTO);
    }
}
