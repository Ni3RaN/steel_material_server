package com.nie.steel_material_server.mapper;

import com.nie.steel_material_server.entity.rolled_steel_test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//指定这是一个操作数据库的mapper
public interface rolled_steel_test_mapper {
    List<rolled_steel_test> findByPage(int startPage,int pageSize);
    int getPage();
    void deleteById(Long id);
    void addData(rolled_steel_test rolled_steel_test);
    List<rolled_steel_test> findAll();
}
