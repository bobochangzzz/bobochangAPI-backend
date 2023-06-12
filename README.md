<p align="center">
  <a href="https://interface.bobochang.work/">
    <img src="https://bobocahng-1309945187.cos.ap-guangzhou.myqcloud.com/20230522/IMG_0508.JPG" 
         alt="啵啵肠API开放平台" width="70" height="70" style="border-radius: 50%;">
  </a>
</p>


<p align="center">
   基于Springboot + Ant Design Pro + react开发的前后端分离系统
</p>

<p align="center">
   <a target="_blank" href="https://github.com/bobochangzzz/bobochangAPI-backend">
      <img src="https://img.shields.io/badge/JDK-8-green"/>
      <img src="https://img.shields.io/badge/springboot-2.7.0-green"/>
      <img src="https://img.shields.io/badge/react-green"/>
      <img src="https://img.shields.io/badge/mysql-8-green"/>
      <img src="https://img.shields.io/badge/mybatis--plus-3.5.2-green"/>
      <img src="https://img.shields.io/badge/redis-6.2.6-green"/>
      <img src="https://img.shields.io/badge/nacos-2.2.2-green"/>
   </a>
</p>

## 在线地址

**项目链接：** [啵啵肠 API 开放平台](https://interface.bobochang.work)

**测试账号：** `test`，**密码：** `test123456`

**Github 地址：** [https://github.com/bobochangzzz/bobochangAPI-backend/](https://github.com/bobochangzzz/bobochangAPI-backend/)

## 本地运行

1. MySQL版本为`5.7`，node版本为`v16.19.1`
2. SQL 文件位于后端根目录下的`db.sql`，将其中的数据导入到自己本地数据库中
3. 修改后端配置文件中的数据库等连接信息，项目中使用到的关于腾讯云功能需要自行开通
4. 项目启动后，使用`test`管理员账号登录，密码为`test123456`

## 项目特点

- 根据业务流程，将整个项目后端划分为 Web 系统，接口服务，公共模块，客户端 SDK，API 网关五个子项目，使用
  Maven 聚合项目，进行多模块依赖管理和打包。

- 后端使用 Swagger + Knife4j 自动生成 OpenAPI 规范的接口文档，前端在此基础上使用插件自动生成接口请求代码，降
  低前后端协作成本

- 为防止接口被恶意调用，设计 API 签名认证算法，为用户分配唯一 ak / sk 以鉴权，保障调用的安全性、可溯源性（指便
  于统计接口调用次数）。

- 为解决开发者调用成本过高的问题（须自己使用 HTTP + 封装签名去调用接口，平均 20 行左右代码），基于 Spring
  Boot Starter 开发了客户端 SDK ，一行代码 即可调用接口，提高开发体验。

- 为解决多个子系统内代码大量重复的问题，抽象模型层和业务层代码为公共模块，并使用 Dubbo RPC 框架实现子系统间
  的高性能接口调用，大幅减少重复代码。

- 选用 Spring Cloud Gateway 作为 API 网关，实现了路由转发、访问控制、流量染色，并集中处理签名校验、请求参数
  校验、接口调用统计等业务逻辑，提高安全性的同时、便于系统开发维护。

- 前端:参考 Swagger2+knif4j等 API 管理产品实现了 API 文档浏览及在线调用功能，提供 Json 编辑器与显示器来提升
  用户输入请求参数 json 的体验。

- 客户端 SDK 尽量用最少的依赖，基于 Spring Boot Starter 自主设计 SDK ，保证 SDK 的精简、避免依赖冲突。

## 技术介绍

**前端：** React + Ant Design pro  + OpenApi插件

**后端：** SpringBoot + Mysql + Redis + Nginx  + Nacos + Swagger2&knif4j + MyBatisPlus + Dubbo + gateway

## 运行环境

**服务器：** 腾讯云 2 核 2G CentOS7.6

**对象存储：** 腾讯云 COS

## 开发环境

| 开发工具              | 说明               |
| --------------------- | ------------------ |
| IDEA                  | Java 开发工具 IDE  |
| Webstorm              | 前端开发工具 IDE   |
| Navicat               | MySQL 远程连接工具 |
| Redis Desktop Manager | Redis 远程连接工具 |
| Xshell                | Linux 远程连接工具 |
| Xftp                  | Linux 文件上传工具 |

| 开发环境 | 版本  |
| -------- | ----- |
| OpenJDK  | 8     |
| MySQL    | 8     |
| Redis    | 6.2.6 |
| nacos    | 2.2.2 |

## 项目截图

![](/Users/bobochang/Documents/PROJECTS/bobochangAPI-backend/images/1.png)

![](/Users/bobochang/Documents/PROJECTS/bobochangAPI-backend/images/2.png)

![](/Users/bobochang/Documents/PROJECTS/bobochangAPI-backend/images/3.png)

![](/Users/bobochang/Documents/PROJECTS/bobochangAPI-backend/images/4.png)

## 后续计划

- 加入真正的开发者管理平台
- 分离出更好看的前端
- 加入真实计费扣费
- 考虑高并发
