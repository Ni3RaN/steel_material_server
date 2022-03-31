package com.nie.steel_material_server.controller;

import com.nie.steel_material_server.entity.rolled_steel_train;
import com.nie.steel_material_server.service.rolled_steel_trainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get_rolled_steel_train")
@CrossOrigin
public class Rolled_steel_trainController {
    @Autowired
    private rolled_steel_trainService rolled_steel_trainService;

    @RequestMapping("/getPage")
    public int getPage(){
        return rolled_steel_trainService.getPage();
    }

    @RequestMapping("/findByPage")
    public List<rolled_steel_train> findByPage(int currentPage, int pageSize){
        int startPage = (currentPage - 1) * pageSize;
        return rolled_steel_trainService.findByPage(startPage,pageSize);
    }

    @RequestMapping("deleteById")
    public void deleteById(Long id){
        rolled_steel_trainService.deleteById(id);
    }

    @RequestMapping("addData")
    public void addData(@RequestBody rolled_steel_train rolled_steel_train){
        rolled_steel_trainService.addData(rolled_steel_train);
    }

    @RequestMapping("findAll")
    public List<rolled_steel_train> findAll() {
        return rolled_steel_trainService.findAll();
    }
}
