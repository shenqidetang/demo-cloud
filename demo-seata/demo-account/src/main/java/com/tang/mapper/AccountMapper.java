package com.tang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tang.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
    @Update("update demo_account set money = money - #{money}  where userId = #{userId}")
    boolean decrease(Long userId, Integer money);
}
