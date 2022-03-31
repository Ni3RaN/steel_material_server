package com.nie.steel_material_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nie.steel_material_server.mapper")//使用MapperScan批量扫描所有的Mapper接口；
public class SteelMaterialServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SteelMaterialServerApplication.class, args);
    }

}
