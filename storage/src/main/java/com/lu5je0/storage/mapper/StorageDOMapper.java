package com.lu5je0.storage.mapper;

import com.lu5je0.storage.bean.StorageDO;

public interface StorageDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StorageDO record);

    int insertSelective(StorageDO record);

    StorageDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StorageDO record);

    int updateByPrimaryKey(StorageDO record);
}