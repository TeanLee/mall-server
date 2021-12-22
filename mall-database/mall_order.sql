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
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `orderId` int NOT NULL AUTO_INCREMENT,
  `orderItem` json DEFAULT NULL,
  `orderTime` varchar(45) DEFAULT NULL,
  `uid` int DEFAULT NULL,
  `status` int DEFAULT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (25,'[{\"count\": 4, \"productId\": 0}, {\"count\": 1, \"productId\": 1}, {\"count\": 1, \"productId\": 2}]','1639979768183',0,1),(26,'[{\"count\": 1, \"productId\": 10}]','1639989240244',0,1),(27,'[{\"count\": 1, \"productId\": 2}]','1639990925044',0,1),(28,'[{\"count\": 1, \"productId\": 4}]','1639990962048',0,1),(29,'[{\"count\": 1, \"productId\": 7}]','1639991319227',0,1),(30,'[{\"count\": 1, \"productId\": 3}]','1639991431341',0,0),(31,'[{\"count\": 1, \"productId\": 10}, {\"count\": 1, \"productId\": 0}]','1640053997238',0,0),(32,'[{\"count\": 1, \"productId\": 3}]','1640086746553',0,0),(34,'[{\"count\": 1, \"productId\": 4}]','1640095695750',0,0),(37,'[{\"count\": 1, \"productId\": 6}]','1640095970572',0,0),(38,'[{\"count\": 1, \"productId\": 23}]','1640096033794',0,0),(39,'[{\"count\": 1, \"productId\": 15}]','1640096080237',0,0),(40,'[{\"count\": 1, \"productId\": 22}]','1640096095919',0,0),(41,'[{\"count\": 1, \"productId\": 13}]','1640096126864',0,0),(42,'[{\"count\": 1, \"productId\": 12}, {\"count\": 1, \"productId\": 7}]','1640133890693',0,0);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-22 10:39:21
