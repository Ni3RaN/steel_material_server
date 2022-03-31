package com.nie.steel_material_server.service.impl;

import com.nie.steel_material_server.entity.steel_slab_test;
import com.nie.steel_material_server.entity.steel_slab_train;
import com.nie.steel_material_server.mapper.steel_slab_train_mapper;
import com.nie.steel_material_server.service.steel_slab_trainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("steel_slab_trainService")
public class steelslabtrainServiceimpl implements steel_slab_trainService {

    @Autowired
    private steel_slab_train_mapper steel_slab_train_mapper;

    @Override
    public List<steel_slab_train> findByPage(int startPage, int pageSize) {
        return steel_slab_train_mapper.findByPage(startPage,pageSize);
    }

    @Override
    public int getPage() {
        return steel_slab_train_mapper.getPage();
    }

    @Override
    public void deleteById(Long id) {
        steel_slab_train_mapper.deleteById(id);
    }

    @Override
    public void addData(steel_slab_train steel_slab_train) {
        steel_slab_train_mapper.addData(steel_slab_train);
    }

    @Override
    public List<steel_slab_train> findAll() {
        return steel_slab_train_mapper.findAll();
    }
}
