package com.nie.steel_material_server.service;

import com.nie.steel_material_server.entity.rolled_steel_train;

import java.util.List;

public interface rolled_steel_trainService {
    List<rolled_steel_train> findByPage(int startPage, int pageSize);
    int getPage();
    void deleteById(Long id);
    void addData(rolled_steel_train rolled_steel_train);
    List<rolled_steel_train> findAll();
}
