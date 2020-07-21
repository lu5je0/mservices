package com.lu5je0.storage.mapper;

import com.lu5je0.storage.bean.StorageDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface StorageDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StorageDO record);

    int insertSelective(StorageDO record);

    StorageDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StorageDO record);

    int updateByPrimaryKey(StorageDO record);

    @Update("update storage set `count` = `count` - #{count} where id = #{id}")
    int reduce(@Param("id") int id, @Param("count") int count);
}