Library Management System

基于 Spring Boot + MyBatis + MariaDB 开发的图书管理系统。

功能

* 图书查询
* 图书详情查询
* 图书新增
* 图书删除
* 图书修改
* 图书借阅（库存减少）
* 管理员登录

技术栈

* Java 21
* Spring Boot 3
* MyBatis
* MariaDB
* Maven
* Git
* GitHub

数据库

数据库名称：

library

图书表：

CREATE TABLE book (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    author VARCHAR(100) NOT NULL,
    stock INT DEFAULT 0
);

启动项目

mvn spring-boot:run

接口示例

查询全部图书：

GET /books

根据ID查询：

GET /book/1

新增图书：

GET /book/add?name=Java&author=Tom&stock=10

借阅图书：

GET /book/borrow?id=1
