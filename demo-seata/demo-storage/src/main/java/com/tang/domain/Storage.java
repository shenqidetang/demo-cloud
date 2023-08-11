package com.tang.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description:
 * @author: tzq
 * @time: 2023/7/3 17:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("demo_storage")
public class Storage implements Serializable {
    private Integer productId;
    private Integer count;
}
