package com.nie.steel_material_server.service;

import com.nie.steel_material_server.entity.steel_slab_train;

import java.util.List;

public interface steel_slab_trainService {
    List<steel_slab_train> findByPage(int startPage, int pageSize);
    int getPage();
    void deleteById(Long id);
    void addData(steel_slab_train steel_slab_train);
    List<steel_slab_train> findAll();
}
