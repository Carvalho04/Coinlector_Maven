-- MySQL dump 10.13  Distrib 8.0.32, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: Coinlector
-- ------------------------------------------------------
-- Server version	8.0.32-0ubuntu0.22.10.2

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
-- Table structure for table `Moeda`
--

DROP TABLE IF EXISTS `Moeda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Moeda` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_Borda` int NOT NULL,
  `id_Composicao` int NOT NULL,
  `id_Forma` int NOT NULL,
  `id_Distribuicao` int NOT NULL,
  `id_Pais` int NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cunhagem` varchar(50) DEFAULT NULL,
  `ano_Lancamento` int DEFAULT NULL,
  `ano_Final` int DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `diametro` float DEFAULT NULL,
  `espessura` float DEFAULT NULL,
  `falor_Face` float DEFAULT NULL,
  `situacao` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_Pais` (`id_Pais`),
  KEY `id_Borda` (`id_Borda`),
  KEY `id_Composicao` (`id_Composicao`),
  KEY `id_Forma` (`id_Forma`),
  KEY `id_Distribuicao` (`id_Distribuicao`),
  CONSTRAINT `Moeda_ibfk_1` FOREIGN KEY (`id_Pais`) REFERENCES `Pais` (`id`),
  CONSTRAINT `Moeda_ibfk_2` FOREIGN KEY (`id_Borda`) REFERENCES `Borda` (`id`),
  CONSTRAINT `Moeda_ibfk_3` FOREIGN KEY (`id_Composicao`) REFERENCES `Composicao` (`id`),
  CONSTRAINT `Moeda_ibfk_4` FOREIGN KEY (`id_Forma`) REFERENCES `Forma` (`id`),
  CONSTRAINT `Moeda_ibfk_5` FOREIGN KEY (`id_Distribuicao`) REFERENCES `Distribuicao` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Moeda`
--

LOCK TABLES `Moeda` WRITE;
/*!40000 ALTER TABLE `Moeda` DISABLE KEYS */;
/*!40000 ALTER TABLE `Moeda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-04 16:14:17
