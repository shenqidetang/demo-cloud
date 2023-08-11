package com.tang.controller;

import com.tang.common.base.result.R;
import com.tang.service.AccountService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/30 16:35
 */
@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
@Api(tags = "邮件/消息管理")
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/decrease")
    public R decrease(@RequestParam("userId") Long userId, @RequestParam("money") Integer money) {
        accountService.decrease(userId, money);
        return R.ok("余额扣减成功");
    }
}
