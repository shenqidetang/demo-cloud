package com.tang.demo.admin.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/25 16:41
 */
@Service
@Slf4j
public class GoodService {
    @SentinelResource("good")
    public void good(){
        log.info("犯罪是good");
    }
}
