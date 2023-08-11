package com.tang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tang.common.base.result.R;
import com.tang.domain.Order;
import com.tang.mapper.OrderMapper;
import com.tang.service.AccountFeignService;
import com.tang.service.OrderService;
import com.tang.service.StorageFeignService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/30 17:00
 */
@Service
@RequiredArgsConstructor
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {


    private  final AccountFeignService accountFeignService;

    private  final StorageFeignService storageFeignService;

    @Override
    @GlobalTransactional(name = "demo-create-order",rollbackFor = Exception.class)
    public R createOrder() {
        Order order = Order.builder()
                .count(10)
                .money(100)
                .productId(1L)
                .status(0)
                .userId(1L)
                .build();
        // 创建订单
        save(order);
        // 扣除库存
        storageFeignService.decrease(order.getProductId(), order.getCount());
        // 扣余额
        accountFeignService.decrease(order.getUserId(), order.getMoney());
        //更新订单状态
        order.setStatus(1);
        updateById(order);
        return R.ok();
    }

}