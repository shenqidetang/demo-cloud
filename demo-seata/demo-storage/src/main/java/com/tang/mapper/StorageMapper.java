package com.tang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tang.domain.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StorageMapper extends BaseMapper<Storage> {
    @Update("update demo_storage set count = count - #{count}  where productId = #{productId}")
    boolean decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
