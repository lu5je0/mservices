package com.lu5je0.storage.controller;

import com.lu5je0.storage.mapper.StorageDOMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lijunjie
 * @since 2020/8/3
 */
@RestController
public class StorageServiceController {

    @Resource
    private StorageDOMapper storageDOMapper;

    @RequestMapping("/reduce")
    public int reduce() {
        int reduce = storageDOMapper.reduce(1, 1);
        System.out.println("扣减成功");
        return reduce;
    }

}
