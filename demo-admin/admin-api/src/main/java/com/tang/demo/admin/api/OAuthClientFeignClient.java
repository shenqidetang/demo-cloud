package com.tang.demo.admin.api;

import com.tang.common.base.result.R;
import com.tang.demo.admin.dto.OAuth2ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: 获取客户端信息的feign
 * @author: tzq
 * @time: 2023/6/9 16:07
 */
@FeignClient(name = "demo-admin", contextId = "oauth-client")
public interface OAuthClientFeignClient {

    @GetMapping("/api/oauth-clients/getOAuth2ClientById")
    R<OAuth2ClientDTO> getOAuth2ClientById(@RequestParam String clientId);
}
