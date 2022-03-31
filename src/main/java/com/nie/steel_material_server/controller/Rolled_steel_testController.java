package com.nie.steel_material_server.controller;

import com.nie.steel_material_server.entity.rolled_steel_test;
import com.nie.steel_material_server.service.rolled_steel_testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get_rolled_steel_test")
@CrossOrigin
public class Rolled_steel_testController {

    @Autowired
    private rolled_steel_testService rolled_steel_testService;

    @RequestMapping("/getPage")
    public int getPage(){
        return rolled_steel_testService.getPage();
    }

    @RequestMapping("/findByPage")
    public List<rolled_steel_test> findByPage(int currentPage,int pageSize){
        int startPage = (currentPage - 1) * pageSize;
        return rolled_steel_testService.findByPage(startPage,pageSize);
    }

    @RequestMapping("deleteById")
    public void deleteById(Long id){
        rolled_steel_testService.deleteById(id);
    }

    @RequestMapping("addData")
    public void addData(@RequestBody rolled_steel_test rolled_steel_test){
        rolled_steel_testService.addData(rolled_steel_test);
    }

    @RequestMapping("findAll")
    public List<rolled_steel_test> findAll(){
        return rolled_steel_testService.findAll();
    }

}