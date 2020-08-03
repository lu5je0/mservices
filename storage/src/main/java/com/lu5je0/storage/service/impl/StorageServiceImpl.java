package com.lu5je0.storage.service.impl;

import com.lu5je0.storage.mapper.StorageDOMapper;
import com.lu5je0.storage.service.StorageService;
import io.seata.rm.tcc.api.BusinessActionContext;
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
    public void reduceStorage(BusinessActionContext businessActionContext, int count) {
        // storageDOMapper.reduce(1, count);
        System.out.println(String.format("xid:%s branchId:%s prepare", businessActionContext.getXid(), businessActionContext.getBranchId()));
    }

    @Override
    public boolean commit(BusinessActionContext businessActionContext) {
        System.out.println(String.format("xid:%s branchId:%s commit", businessActionContext.getXid(), businessActionContext.getBranchId()));
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext businessActionContext) {
        System.out.println(String.format("xid:%s branchId:%s rollback", businessActionContext.getXid(), businessActionContext.getBranchId()));
        return true;
    }
}
