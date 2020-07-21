package com.lu5je0.order;

import com.lu5je0.storage.service.StorageService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderApplicationTests {

    @DubboReference
    private StorageService storageService;

    @Test
    void contextLoads() {
        System.out.println(storageService.func());
    }

}
