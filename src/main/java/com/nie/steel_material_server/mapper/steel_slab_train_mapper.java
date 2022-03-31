package com.nie.steel_material_server.mapper;

import com.nie.steel_material_server.entity.steel_slab_train;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//指定这是一个操作数据库的mapper
public interface steel_slab_train_mapper {
    List<steel_slab_train> findByPage(int startPage, int pageSize);
    int getPage();
    void deleteById(Long id);
    void addData(steel_slab_train steel_slab_train);
    List<steel_slab_train> findAll();
}
