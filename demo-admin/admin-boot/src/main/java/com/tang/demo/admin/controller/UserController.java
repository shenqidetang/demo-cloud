package com.tang.demo.admin.controller;

import com.tang.common.base.result.R;
import com.tang.demo.admin.dto.UserAuthDTO;
import com.tang.demo.admin.service.ISysUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: UserFeignClient的实现controller
 * @author: tzq
 * @time: 2023/6/11 19:40
 */
@RestController
@RequestMapping("/api/v1/users")
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final ISysUserService iSysUserService;

    /**
     * 获取用户信息
     */
    @GetMapping("/username/{username}")
    public R<UserAuthDTO> getUserByUsername(@PathVariable String username) {
        log.info("username:{}",username);
        UserAuthDTO user = iSysUserService.getByUsername(username);
        return R.ok(user);
    }
}
