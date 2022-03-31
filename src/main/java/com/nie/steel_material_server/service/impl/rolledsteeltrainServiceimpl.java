package com.nie.steel_material_server.service.impl;

import com.nie.steel_material_server.entity.rolled_steel_train;
import com.nie.steel_material_server.service.rolled_steel_trainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("rolled_steel_trainService")
public class rolledsteeltrainServiceimpl implements rolled_steel_trainService {

    @Autowired
    private com.nie.steel_material_server.mapper.rolled_steel_train_mapper rolled_steel_train_mapper;

    @Override
    public List<rolled_steel_train> findByPage(int startPage,int pageSize) {
        return rolled_steel_train_mapper.findByPage(startPage,pageSize);
    }

    @Override
    public int getPage() {
        return rolled_steel_train_mapper.getPage();
    }

    @Override
    public void deleteById(Long id) {
        rolled_steel_train_mapper.deleteById(id);
    }

    @Override
    public void addData(rolled_steel_train rolled_steel_train) {
        rolled_steel_train_mapper.addData(rolled_steel_train);
    }

    @Override
    public List<rolled_steel_train> findAll() {
        return rolled_steel_train_mapper.findAll();
    }
}
