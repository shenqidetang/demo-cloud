package com.tang.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tang.domain.Storage;
import com.tang.mapper.StorageMapper;
import com.tang.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: tzq
 * @time: 2023/6/30 17:33
 */
@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public boolean decrease(Long productId, Integer count) {
        return storageMapper.decrease(productId,count);
    }
}
