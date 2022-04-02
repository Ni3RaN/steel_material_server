# 钢材综合成材率预测系统

<a href="https://github.com/spring-projects/spring-boot">
    <img src="https://img.shields.io/badge/spring--boot-2.6.6-brightgreen.svg" alt="vue">
</a>
<a href="https://github.com/alibaba/druid">
    <img src="https://img.shields.io/badge/druid-1.2.8-brightgreen.svg" alt="vue">
</a>
<a href="https://github.com/mybatis/mybatis-3">
    <img src="https://img.shields.io/badge/mybatis-3.5.2-brightgreen.svg" alt="license">
</a>
<a href="https://github.com/Ni3RaN/steel_material_server/blob/master/LICENSE">
    <img src="https://img.shields.io/github/license/mashape/apistatus.svg" alt="license">
</a>

使用Spring Boot的管理系统项目。[体验地址](http://81.70.243.180)

[前端项目地址](https://github.com/Ni3RaN/steel_material_client)

## 前言

该项目是钢材综合成材率预测系统的后端（使用 Spring Boot和Mybatis），数据库是Mysql8.0.28，数据库连接池是druid）。

## 接口

- [x] 数据表盘
- [x] 成锭率预测
- [x] 成锭率数据管理
- [x] 成材率预测
- [x] 成材率数据管理

## 安装步骤

```
// 把项目下载到本地
git clone https://github.com/Ni3RaN/steel_material_server.git
// 进入模板目录
cd steel_material_server
// 配置数据库
// 开启服务器，端口是8081
// 构建，在target文件夹下生成
// 打包方式是jar，所以直接在服务器上运行
java -jar steel_material_server-0.0.1-SNAPSHOT.jar
```
