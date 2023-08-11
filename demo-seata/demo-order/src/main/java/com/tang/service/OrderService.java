package com.tang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tang.common.base.result.R;
import com.tang.domain.Order;

public interface OrderService extends IService<Order> {
    R createOrder();
}
