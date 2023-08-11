package com.tang.demo.admin.api;

import com.tang.common.base.result.R;
import com.tang.demo.admin.dto.UserAuthDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description: 根据用户名获取用户信息的feign
 * @author: tzq
 * @time: 2023/6/9 16:08
 */
@FeignClient(name = "demo-admin", contextId = "user-client")
public interface UserFeignClient {

    @GetMapping("/api/v1/users/username/{username}")
    R<UserAuthDTO> getUserByUsername(@PathVariable String username);
}

