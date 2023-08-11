package com.tang.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tang.domain.Account;
import com.tang.mapper.AccountMapper;
import com.tang.service.AccountService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/30 17:32
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper,Account> implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public boolean decrease(Long userId, Integer money) {
        return accountMapper.decrease(userId, money);
    }
}
