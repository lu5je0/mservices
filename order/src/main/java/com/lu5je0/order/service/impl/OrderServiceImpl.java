package com.lu5je0.order.service.impl;

import com.lu5je0.order.bean.OrderDO;
import com.lu5je0.order.mapper.OrderDOMapper;
import com.lu5je0.order.service.OrderService;
import com.lu5je0.storage.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lijunjie
 * @since 2020/7/21
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDOMapper orderDOMapper;

    @DubboReference
    private StorageService storageService;

    @GlobalTransactional
    @Override
    public void createOrder(String comment) throws InterruptedException {
        OrderDO record = new OrderDO();
        record.setComment(comment);

        storageService.reduceStorage(null, 1);
        orderDOMapper.insert(record);
        throw new RuntimeException("fdafa");
    }

}
