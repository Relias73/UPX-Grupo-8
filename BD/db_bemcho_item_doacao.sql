CREATE DATABASE  IF NOT EXISTS `db_bemcho` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_bemcho`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_bemcho
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `item_doacao`
--

DROP TABLE IF EXISTS `item_doacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_doacao` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `categoria_id` int DEFAULT NULL,
  `quantidade_item` int NOT NULL,
  `entidade_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_categoria_item_doacao_idx` (`categoria_id`),
  KEY `fk_entidadeReceptora_item_idx` (`entidade_id`),
  CONSTRAINT `fk_categoria_item_doacao` FOREIGN KEY (`categoria_id`) REFERENCES `categoria_item` (`id`) ON DELETE SET NULL,
  CONSTRAINT `fk_entidadeReceptora_item` FOREIGN KEY (`entidade_id`) REFERENCES `entidade` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_doacao`
--

LOCK TABLES `item_doacao` WRITE;
/*!40000 ALTER TABLE `item_doacao` DISABLE KEYS */;
INSERT INTO `item_doacao` VALUES (2,'camiseta',NULL,5,NULL),(3,'camiseta',NULL,5,NULL),(6,'calça',NULL,4,NULL),(7,'par de meias',1,12,1),(8,'camisa manga longa',1,6,2),(9,'camiseta regata',1,25,2),(10,'bermuda',1,4,1),(11,'bermuda',1,4,1),(12,'sapato',2,1,1);
/*!40000 ALTER TABLE `item_doacao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-01  3:03:07
