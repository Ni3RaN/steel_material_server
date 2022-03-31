package com.nie.steel_material_server.controller;

import com.nie.steel_material_server.entity.steel_slab_test;
import com.nie.steel_material_server.service.steel_slab_testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get_slab_steel_test")
@CrossOrigin
public class Steel_slab_testController {

    @Autowired
    private steel_slab_testService steel_slab_testService;

    @RequestMapping("/getPage")
    public int getPage(){
        return steel_slab_testService.getPage();
    }

    @RequestMapping("/findByPage")
    public List<steel_slab_test> findByPage(int currentPage, int pageSize){
        int startPage = (currentPage - 1) * pageSize;
        return steel_slab_testService.findByPage(startPage,pageSize);
    }

    @RequestMapping("deleteById")
    public void deleteById(Long id){
        steel_slab_testService.deleteById(id);
    }

    @RequestMapping("addData")
    public void addData(@RequestBody steel_slab_test steel_slab_test){
        steel_slab_testService.addData(steel_slab_test);
    }

    @RequestMapping("findAll")
    public List<steel_slab_test> findAll(){
        return steel_slab_testService.findAll();
    }
}