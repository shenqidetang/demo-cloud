package com.tang.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.stream.IntStream;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/30 17:11
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("demo_order")
public class Order implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Integer count;
    private Integer money;
    private Long productId;
    private Long userId;
    private Integer status;


}
