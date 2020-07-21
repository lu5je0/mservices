package com.lu5je0.storage.service.impl;

import com.lu5je0.storage.service.StorageService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author lijunjie
 * @since 2020/7/21
 */
@DubboService
public class StorageServiceImpl implements StorageService {
    @Override
    public String func() {
        return "hello world";
    }
}
