package com.lu5je0.storage;

import com.lu5je0.storage.mapper.StorageDOMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

@SpringBootTest
class StorageApplicationTests {

    @Resource
    private StorageDOMapper storageDOMapper;

    @Test
    void contextLoads() {
        System.out.println(storageDOMapper.selectByPrimaryKey(1));
        storageDOMapper.reduce(1, 1);
        System.out.println(storageDOMapper.selectByPrimaryKey(1));
    }

}
