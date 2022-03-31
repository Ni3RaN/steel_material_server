package com.nie.steel_material_server.service;

import com.nie.steel_material_server.entity.steel_slab_test;

import java.util.List;

public interface steel_slab_testService {
    List<steel_slab_test> findByPage(int startPage,int pageSize);
    int getPage();
    void deleteById(Long id);
    void addData(steel_slab_test steel_slab_test);
    List<steel_slab_test> findAll();
}
