package com.tang.service;

import com.tang.common.base.result.R;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "demo-account")
@RequestMapping("/account")
public interface AccountFeignService {

    @RequestMapping("/decrease")
    public R decrease(@RequestParam("userId") Long userId, @RequestParam("money") Integer money);
}