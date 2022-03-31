package com.nie.steel_material_server.controller;

import com.nie.steel_material_server.entity.steel_slab_train;
import com.nie.steel_material_server.service.steel_slab_trainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get_slab_steel_train")
@CrossOrigin
public class Steel_slab_trainController {
    @Autowired
    private steel_slab_trainService steel_slab_trainService;

    @RequestMapping("/getPage")
    public int getPage(){
        return steel_slab_trainService.getPage();
    }

    @RequestMapping("/findByPage")
    public List<steel_slab_train> findByPage(int currentPage, int pageSize){
        int startPage = (currentPage - 1) * pageSize;
        return steel_slab_trainService.findByPage(startPage,pageSize);
    }

    @RequestMapping("deleteById")
    public void deleteById(Long id){
        steel_slab_trainService.deleteById(id);
    }

    @RequestMapping("addData")
    public void addData(@RequestBody steel_slab_train steel_slab_train){
        steel_slab_trainService.addData(steel_slab_train);
    }

    @RequestMapping("findAll")
    public List<steel_slab_train> findAll() {
        return steel_slab_trainService.findAll();
    }
}
