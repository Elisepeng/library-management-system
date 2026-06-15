Library Management System

项目简介

基于 Spring Boot + MyBatis + MySQL 开发的图书管理系统。

实现了图书管理和管理员登录等功能，支持：

* 图书查询
* 图书新增
* 图书修改
* 图书删除
* 图书借阅
* 图书归还
* 管理员登录
* Swagger 接口文档

⸻

技术栈

* Java 21
* Spring Boot 3
* MyBatis
* MySQL
* Maven
* Swagger(OpenAPI)
* HTML
* JavaScript

⸻

功能展示

管理员登录

管理员输入账号密码后进入系统。

图书管理

支持：

* 查询图书
* 新增图书
* 修改图书
* 删除图书
* 借书
* 还书

⸻

项目结构

src
├── controller
├── service
├── mapper
├── entity
├── resources
│ ├── static
│ └── application.properties

⸻

运行方式

1. 创建 MySQL 数据库
2. 配置 application.properties
3. 启动 Spring Boot 项目
4. 访问：

http://localhost:8080/login.html

Swagger：

http://localhost:8080/swagger-ui/index.html

⸻

作者

Elisepeng