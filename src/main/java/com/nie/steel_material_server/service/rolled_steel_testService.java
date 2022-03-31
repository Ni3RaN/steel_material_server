package com.nie.steel_material_server.service;

import com.nie.steel_material_server.entity.rolled_steel_test;

import java.util.List;

public interface rolled_steel_testService {
    List<rolled_steel_test> findByPage(int startPage,int pageSize);
    int getPage();
    void deleteById(Long id);
    void addData(rolled_steel_test rolled_steel_test);
    List<rolled_steel_test> findAll();
}
