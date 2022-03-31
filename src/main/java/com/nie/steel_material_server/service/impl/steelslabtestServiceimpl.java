package com.nie.steel_material_server.service.impl;

import com.nie.steel_material_server.entity.steel_slab_test;
import com.nie.steel_material_server.mapper.steel_slab_test_mapper;
import com.nie.steel_material_server.service.steel_slab_testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("steel_slab_testService")
public class steelslabtestServiceimpl implements steel_slab_testService {

    @Autowired
    private steel_slab_test_mapper steel_slab_test_mapper;

    @Override
    public List<steel_slab_test> findByPage(int startPage,int pageSize) {
        return steel_slab_test_mapper.findByPage(startPage,pageSize);
    }

    @Override
    public int getPage() {
        return steel_slab_test_mapper.getPage();
    }

    @Override
    public void deleteById(Long id) {
        steel_slab_test_mapper.deleteById(id);
    }

    @Override
    public void addData(steel_slab_test steel_slab_test) {
        steel_slab_test_mapper.addData(steel_slab_test);
    }

    @Override
    public List<steel_slab_test> findAll() {
        return steel_slab_test_mapper.findAll();
    }
}
