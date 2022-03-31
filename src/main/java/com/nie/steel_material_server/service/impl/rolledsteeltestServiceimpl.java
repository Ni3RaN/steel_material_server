package com.nie.steel_material_server.service.impl;

import com.nie.steel_material_server.entity.rolled_steel_test;
import com.nie.steel_material_server.mapper.rolled_steel_test_mapper;
import com.nie.steel_material_server.service.rolled_steel_testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("rolled_steel_testService")
public class rolledsteeltestServiceimpl implements rolled_steel_testService {

    @Autowired
    private rolled_steel_test_mapper rolled_steel_test_mapper;

    @Override
    public List<rolled_steel_test> findByPage(int startPage,int pageSize) {
        return rolled_steel_test_mapper.findByPage(startPage,pageSize);
    }

    @Override
    public int getPage() {
        return rolled_steel_test_mapper.getPage();
    }

    @Override
    public void deleteById(Long id) {
        rolled_steel_test_mapper.deleteById(id);
    }

    @Override
    public void addData(rolled_steel_test rolled_steel_test) {
        rolled_steel_test_mapper.addData(rolled_steel_test);
    }

    @Override
    public List<rolled_steel_test> findAll(){
        return rolled_steel_test_mapper.findAll();
    };
}
