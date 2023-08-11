package com.tang.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tang.domain.Order;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/30 17:21
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {


}
