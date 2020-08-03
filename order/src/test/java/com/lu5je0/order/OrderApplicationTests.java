package com.lu5je0.order;

import com.lu5je0.order.mapper.OrderDOMapper;
import com.lu5je0.order.service.OrderService;
import com.lu5je0.storage.service.StorageService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class OrderApplicationTests {

    @DubboReference
    private StorageService storageService;

    @Resource
    private OrderDOMapper orderDOMapper;

    @Resource
    private OrderService orderService;

    @Test
    void contextLoads() {
        System.out.println(storageService.func());
    }

    @Test
    void createOrder() throws InterruptedException {
        orderService.createOrder("ghfdanfa");
        Thread.sleep(10000);
    }

}
