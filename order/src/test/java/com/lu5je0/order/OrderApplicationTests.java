package com.lu5je0.order;

import com.lu5je0.order.bean.OrderDO;
import com.lu5je0.order.mapper.OrderDOMapper;
import com.lu5je0.storage.service.StorageService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@MapperScan("com.lu5je0.order")
class OrderApplicationTests {

    @DubboReference
    private StorageService storageService;

    @Resource
    private OrderDOMapper orderDOMapper;

    @Test
    void contextLoads() {
        System.out.println(storageService.func());
    }

    @Test
    void createOrder() {
        OrderDO record = new OrderDO();
        record.setComment("fdafa");

        orderDOMapper.insert(record);
        System.out.println(orderDOMapper.selectByPrimaryKey(1));
    }

}
