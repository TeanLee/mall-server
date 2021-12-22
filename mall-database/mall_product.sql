-- MySQL dump 10.13  Distrib 8.0.27, for macos11 (x86_64)
--
-- Host: 127.0.0.1    Database: mall
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `productId` int NOT NULL,
  `banner` varchar(1000) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `oldPrice` double DEFAULT NULL,
  `categoryId` int DEFAULT NULL,
  `unit` varchar(45) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  `subTitle` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (0,'https://img.alicdn.com/imgextra/i1/6000000002256/O1CN01SxJ6mn1SXI9zLW32K_!!6000000002256-0-at.jpg_430x430q90.jpg',222,333,2,'袋','国联水产翡翠生虾仁小号156-198只净重1000g冷冻生鲜海鲜火锅食材','鲜爽甜饱满'),(1,'https://img.alicdn.com/imgextra/i3/725677994/O1CN01Q7loND28vIrUasNgw_!!725677994.jpg_430x430q90.jpg',99.8,126.8,3,'件','顶诺生鲜安格斯牛肉饼5份早餐汉堡半成品冷冻鲜速食家庭牛肉馅饼','汉堡牛肉饼'),(2,'https://img.alicdn.com/imgextra/i4/725677994/O1CN01G7gsYW28vIqK7cjW4_!!725677994.jpg_430x430q90.jpg',48.8,88.3,0,'件','【新产季】佳农山东烟台苹果一级果10斤单果重约160-170g生鲜水果\n','皮薄肉厚，脆甜多汁，果香浓郁\n\n'),(3,'https://img.alicdn.com/imgextra/i4/6000000002217/O1CN01IBNwiJ1SFQj7fQW3J_!!6000000002217-0-at.jpg_430x430q90.jpg',15.9,18,4,'瓶','鲁花生鲜蚝油518克 冷海生蚝蚝香浓郁 调味品蘸碟烧烤凉拌\n','点蘸烹炒拌腌烧烤 提鲜增香 一勺蚝油三颗蚝\n\n'),(4,'https://img.alicdn.com/imgextra/i4/725677994/O1CN01MMJrtw28vInFciiIa_!!725677994.jpg_430x430q90.jpg',407,522.6,4,'件','METZ/玫斯无谷物生鲜全价幼年期通用型猫咪主粮6.8kg英短美短猫粮\n','英短美短猫粮'),(5,'https://img.alicdn.com/imgextra/i2/2210243152616/O1CN0130ExWd1VCAmAgAXtG_!!2210243152616.jpg_430x430q90.jpg',269,429,7,'件','MAAC10美国原装进口反式白藜芦醇AMPK NAD+ 胶囊氧化抗衰老\n','GMP和NSF认证 天然 高效吸收 AMPK 99%纯度\n\n'),(6,'https://img.alicdn.com/imgextra/i3/2211940963524/O1CN01lfHe231bu2QDagNJb_!!2211940963524.jpg_430x430q90.jpg',148,168,7,'件','新西兰麦卢卡蜂蜜养胃软糖罗伊氏乳杆菌双岐大人儿童调理肠胃食品\n','本店活动 新品上架 满119元减20元\n\n'),(7,'https://img.alicdn.com/imgextra/i2/3707815181/O1CN01fxp8Z11o8wjX93KeD_!!3707815181.jpg_430x430q90.jpg',88,99.9,0,'件','丹东草莓新鲜水果3斤当季东港九九大奶油99牛奶草莓礼盒顺丰包邮\n','奶油香味 个大饱满 顺丰空运48小时直达\n\n'),(8,'https://img.alicdn.com/imgextra/i3/3707815181/O1CN01pcMBzS1o8we3gUh8D_!!3707815181.jpg_430x430q90.jpg',24.8,55.6,0,'件','四川爱媛38号果冻橙10斤橙子新鲜水果当季柑橘大蜜桔子一整箱包邮\n','果冻般口感 超过瘾\n\n'),(9,'https://img.alicdn.com/imgextra/i1/4218357985/O1CN01qBPkrB28rBJIOt47O_!!4218357985.jpg_430x430q90.jpg',34.9,54.6,0,'件','绿行者透心红番茄小西红柿新鲜自然熟孕妇水果沙瓤西红柿生吃5斤\n','熊蜂授粉自然熟！酸甜多汁\n\n'),(10,'https://img.alicdn.com/imgextra/i1/3883979521/O1CN01K498kc2KCfe8fsep9_!!3883979521.png_430x430q90.jpg',109.8,189.7,0,'件','泰国金枕榴莲新鲜水果巴掌2-10斤批发整果带壳特产可顺丰\n','整果带壳特产可顺丰'),(12,'https://img.alicdn.com/imgextra/https://img.alicdn.com/imgextra/i3/4270388526/O1CN01kX8uME2CqxYdeEASV_!!4270388526.jpg_430x430q90.jpg',21.28,52.8,1,'件','云南金银水果玉米10斤新鲜生吃甜玉米棒子粘苞谷米现摘糯包邮蔬菜\n','金银水果甜玉米 甜脆爆浆 不玩含箱套路\n\n'),(13,'https://img.alicdn.com/imgextra/i3/2208694873981/O1CN01KdaKBe1fHLPsbHFRY_!!2208694873981.jpg_430x430q90.jpg',12.8,22.8,1,'件','恩施小土豆现挖湖北新鲜黄心土豆10斤当季蔬菜整箱迷你马铃薯洋芋\n','迷你马铃薯洋芋'),(14,'https://img.alicdn.com/imgextra/i4/3469735555/O1CN01XMb8JH1quEr4uh9MP_!!3469735555.jpg_430x430q90.jpg',14.8,32.8,1,'件','沙瓤西红柿新鲜带箱10斤番茄自然熟普罗旺斯生吃的小番茄当季蔬菜\n','酸甜可口，适合生吃！\n\n'),(15,'https://img.alicdn.com/imgextra/i2/2211154603868/O1CN01ANdLI61eRaeWIwz3x_!!2211154603868.jpg_430x430q90.jpg',8.1,21.9,1,'件','球生菜20斤 新鲜西生菜圆生菜汉堡火锅用蔬菜 西餐沙拉轻食食材\n','新鲜采摘 农场直供 顺丰发货\n\n'),(16,'https://img.alicdn.com/imgextra/https://img.alicdn.com/imgextra/i2/3015214310/O1CN01df47561hi1lo8vPI7_!!3015214310.jpg_430x430q90.jpg',38.8,76.8,1,'件','贝贝南瓜板栗味小南瓜10斤新鲜蔬菜正宗惠和一号南瓜婴儿辅食包邮\n','收藏下单 拍下12.8元起 香甜软糯 老少皆宜\n\n'),(17,'https://img.alicdn.com/imgextra/i3/2207399797915/O1CN01wlMRzB28L7TSA58g2_!!2207399797915.jpg_430x430q90.jpg',29.9,69,1,'件','枝纯水果胡萝卜即食手指萝卜 0脂低热量新鲜蔬菜儿童营养76g*6袋\n','新鲜萝卜 坏了包赔\n\n'),(18,'https://img.alicdn.com/imgextra/i3/2200744857275/O1CN01uXuNuT23bzu1mXGsI_!!2200744857275.jpg_430x430q90.jpg',30,58,1,'件','速冻新西兰进口甜青豆小甜豆新鲜冷冻豌豆粒美式杂菜沙拉蔬菜商用\n','新西兰进口 甜脆爆汁 豆香浓郁\n\n'),(19,'https://img.alicdn.com/imgextra/i3/2205199567753/O1CN01O52yIb278vNgSQCmZ_!!2205199567753.png_430x430q90.jpg',128.9,228,2,'件','乳山生蚝鲜活生蚝10斤贝司令牡蛎活鲜海蛎子整箱新鲜海鲜水产批发\n','拍10斤净重9斤，分两箱发货，蚝刀加赠1份\n\n'),(20,'https://img.alicdn.com/imgextra/https://img.alicdn.com/imgextra/i1/3342260125/O1CN01XObOMU1CnI7Qhbg5c_!!3342260125.jpg_430x430q90.jpg',134.8,319,2,'件','新鲜大虾鲜活海鲜水产青虾白基围虾对青岛超大海捕虾类速冻冷整箱\n','鲜活海捕 高品质盐冻虾 只只分离 整盒装\n\n'),(21,'https://img.alicdn.com/imgextra/i1/3993714050/O1CN015alA3M1fmwdW3Hk3Y_!!3993714050.jpg_430x430q90.jpg',288,600,2,'件','舟山带鱼新鲜冷冻特级大整条整箱10斤小眼东海深海海鲜油带鱼刀鱼\n','新货刚到，带箱10斤，净重9斤，约10-12条\n\n'),(22,'https://img.alicdn.com/imgextra/i2/3993714050/O1CN01ADrD5l1fmwj6r31qd_!!3993714050.jpg_430x430q90.jpg',88,200,2,'件','八爪鱼鲜活新鲜冷冻章鱼爆头海鲜即食麻辣火锅迷你小章鱼批发商用\n','已去内脏，一份3包，1包约8-12个。\n\n'),(23,'https://img.alicdn.com/imgextra/i4/2098479464/TB2GmJEfndYBeNkSmLyXXXfnVXa_!!2098479464.jpg_430x430q90.jpg',40.9,88.6,3,'件','兰皇可生食の鲜鸡蛋30枚 无菌溏心温泉寿喜锅烧日料顺丰包邮\n','日本70年专业经验|让孩子放心食用的鸡蛋\n\n'),(24,'https://img.alicdn.com/imgextra/https://img.alicdn.com/imgextra/i4/2360209412/O1CN010P67lq2JOkTCjr6BK_!!2360209412.jpg_430x430q90.jpg',300,320.3,5,'件','【圣诞礼物】兰蔻菁纯唇膏 小蛮腰哑光口红 秋冬显白196朱砂橘\n','此商品活动中，请尽快购买！'),(25,'https://img.alicdn.com/imgextra/i1/2379187467/O1CN01Tnlk4G251w8LNJytf_!!0-item_pic.jpg_430x430q90.jpg',258,476,6,'件','新生婴儿秋冬纯棉衣服初生满月百天宝宝礼盒礼物套装母婴用品大全\n','A类纯棉 安全 洋气 送礼大气有品位\n\n'),(26,'https://img.alicdn.com/imgextra/i3/1801754147/O1CN01gnUcJf1gVNCSvODZx_!!1801754147.jpg_430x430q90.jpg',799,1299,8,'件','【爆款推荐】52度五粮液250ml 浓香型高度白酒水送礼名酒礼盒装\n','100%保真 15天保价 破损包赔\n\n'),(27,'https://img.alicdn.com/imgextra/i3/3949239623/O1CN01ul6wy62KxO3w9QVo9_!!3949239623.jpg_430x430q90.jpg',300,320,9,'件','【礼遇狂欢】NARS腮红修容经典愉悦红粉Orgasm泰姬陵 焦糖橘\n','经典腮红 人气orgasm\n\n');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-22 10:39:22
