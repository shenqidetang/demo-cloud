package com.tang.controller;

import com.tang.common.base.result.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tang.service.OrderService;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/30 16:59
 */
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @RequestMapping("/createOrder")
    public R createOrder() {
        orderService.createOrder();
        return R.ok("订单创建成功");
    }
}
