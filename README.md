# mall-server

## 项目简介
该项目实现了商城类微信小程序的后端。

微信小程序前端仓库链接[：商城类微信小程序（仿盒马鲜生app）](https://github.com/TeanLee/hema)

实现的功能点：
- 商品
    - [ ] 首页商品分类展示
    - [ ] 首页商品滚动展示
    - [ ] 分类页商品按不同分类展示
    - [ ] 商品详情页（简要展示）
- 购物车
    - [ ] 将商品加入购物车
    - [ ] 购物车商品数量的修改
    - [ ] 删除购物车的商品
- 订单（我的 -> 所有订单）
    - [ ] 购物车页面下单（简易版本的实现，用户在购物车界面下单后，可在“待支付”中查看）
    - [ ] 用户订单查询

## 开发环境
-   **JDK 1.8 +**
-   **Maven 3.5 +**
-   **IntelliJ IDEA ULTIMATE 2018.2 +**  (*注意：务必使用 IDEA 开发，同时保证安装 `lombok` 插件*)
-   **Mysql 5.7 +**  (*尽量保证使用 5.7 版本以上，因为 5.7 版本加了一些新特性，同时不向下兼容。本 demo 里会尽量避免这种不兼容的地方，但还是建议尽量保证 5.7 版本以上*)

## 运行方式
1. `git clone https://github.com/TeanLee/mall-server.git`
2. 使用 IDEA 打开 clone 下来的项目
3. 在 IDEA 中 Maven Projects 的面板导入项目根目录下 的 `pom.xml` 文件
4. Maven Projects 找不到的同学，可以勾上 IDEA 顶部工具栏的 View -> Tool Buttons ，然后 Maven Projects 的面板就会出现在 IDEA 的右侧
5. 执行 mall-server 的数据库文件，创建数据库
6. 修改 application.yaml 中的数据库 url、username、password（改为自己的数据库地址、用户名和密码）

### 技术选型

**后端技术**

| 技术 | 说明 | 官网 |
|  ----  | ----  | ----  |
| SpringBoot | 容器+MVC框架 | <https://spring.io/projects/spring-boot> |
| MyBatis | ORM框架 | <http://www.mybatis.org/mybatis-3/zh/index.html> |
| MySql | 关系型数据库 | https://www.mysql.com/ |
| Docker | 容器 | [https://www.docker.com](https://www.docker.com/) |
| Lombok | 简化对象封装工具 | https://github.com/rzwitserloot/lombok |
| Swagger-UI | 文档生成工具 | <https://github.com/swagger-api/swagger-ui> |

**前端技术**
| 技术 | 说明 | 官网 |
|  ----  | ----  | ----  |
| 微信小程序框架 | 小程序框架 | https://developers.weixin.qq.com/miniprogram/dev/framework/ |
| Axios | 前端HTTP框架 | <https://github.com/axios/axios> |
| WeUI | 微信原生视觉体验一致的基础样式库 | https://weui.io/ |
| Vant Weapp | UI 组件库 | https://youzan.github.io/vant-weapp/#/home |

## 数据库设计
用户表：

| uid  | username | address | phone  | receiver |
| ---- | -------- | ------- | ------ | -------- | 
| 用户id | 用户名      | 收货地址列表  | 联系电话   | 收件人      |
| int  | String   | String  | String | String   |

商品表：

| productId | banner | price  | oldPrice | categoryId | unit   | title  | subTitle |
| --------- | ------ | ------ | -------- | ---------- | ------ | ------ | -------- |
| 商品id      | 主图     | 价格     | 原价       | 分类         | 单位     | 商品名    | 次标题      |
| int       | String | Double | Double   | int        | String | String | String   |

商品分类表：

| categoryId | category |
| ---------- | -------- |
| 商品分类id     | 商品种类名    |
| int        | String   |

订单表：

| orderId | address        | order   | orderTime | uid       | status                  |
| ------- | -------------- | ------- | --------- | --------- | ----------------------- |
| 订单id    | 收货地址(可以在用户表中取) | 具体货物和数量 | 下单时间（时间戳） | 对应的userId | 订单状态（0:待付款；1:待配送；2:待评价） |
| int     | String         | List    | String    | int       | int                     |

商品-订单表：（用处：能记录商品被加购的次数，以及已经被出售的次数）

| id  | productId | orderId |
| --- | --------- | ------- |
| 主键  | 商品id      | 订单id    |
| Int | int       | int     |

购物车表：

| cartId | uid     | productId | count    | hasBought |
| ------ | ------- | --------- | -------- | --------- |
| 购物车id  | 所属用户的id | 用户加入商品的id | 加入某商品的数量 | 用户是否下单购买了 |   |   |   |
| int    | int     | int       | int      | boolean   |
