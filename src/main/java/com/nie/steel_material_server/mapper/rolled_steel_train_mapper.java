package com.nie.steel_material_server.mapper;

import com.nie.steel_material_server.entity.rolled_steel_train;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//指定这是一个操作数据库的mapper
public interface rolled_steel_train_mapper {
    List<rolled_steel_train> findByPage(int startPage, int pageSize);
    int getPage();
    void deleteById(Long id);
    void addData(rolled_steel_train rolled_steel_train);
    List<rolled_steel_train> findAll();
}
