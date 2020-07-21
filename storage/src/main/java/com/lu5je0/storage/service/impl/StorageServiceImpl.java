package com.lu5je0.storage.service.impl;

import com.lu5je0.storage.mapper.StorageDOMapper;
import com.lu5je0.storage.service.StorageService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author lijunjie
 * @since 2020/7/21
 */
@DubboService
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDOMapper storageDOMapper;

    @Override
    public String func() {
        return "hello world";
    }

    @Override
    public void reduceStorage(int count) {
        storageDOMapper.reduce(1, count);
    }
}
