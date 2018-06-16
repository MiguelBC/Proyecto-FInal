CREATE DATABASE  IF NOT EXISTS `practica2` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `practica2`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: practica2
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `salary` (
  `idsalary` int(11) NOT NULL AUTO_INCREMENT COMMENT '\n',
  `dni` int(8) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `sueldo` decimal(12,2) DEFAULT NULL,
  `uit` decimal(9,4) DEFAULT NULL,
  `total_impuesto` decimal(12,2) DEFAULT NULL,
  `total_bruto` decimal(12,2) DEFAULT NULL,
  `total_neta` decimal(12,2) DEFAULT NULL,
  `retencion_mensual` int(5) DEFAULT NULL,
  `maximo_5` decimal(12,2) DEFAULT NULL,
  `monto_afecto_5` decimal(12,2) DEFAULT NULL,
  `impuesto_5` decimal(12,2) DEFAULT NULL,
  `maximo_20` decimal(12,2) DEFAULT NULL,
  `monto_afecto_20` decimal(12,2) DEFAULT NULL,
  `impuesto_20` decimal(12,2) DEFAULT NULL,
  `maximo_35` decimal(12,2) DEFAULT NULL,
  `monto_afecto_35` decimal(12,2) DEFAULT NULL,
  `impuesto_35` decimal(12,2) DEFAULT NULL,
  `maximo_45` decimal(12,2) DEFAULT NULL,
  `monto_afecto_45` decimal(12,2) DEFAULT NULL,
  `impuesto_45` decimal(12,2) DEFAULT NULL,
  `maximo_46` varchar(100) DEFAULT NULL,
  `monto_afecto_46` decimal(12,2) DEFAULT NULL,
  `impuesto_46` decimal(12,2) DEFAULT NULL,
  `total_monto_afecto` decimal(12,2) DEFAULT NULL,
  `descontable_uit` decimal(12,2) DEFAULT NULL,
  `correo` varchar(60) DEFAULT NULL,
  `flagcorreo` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`idsalary`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (1,70234927,'luis moreno',4500.00,4500.0000,3060.00,63000.00,59940.00,255,22500.00,22500.00,1800.00,90000.00,9000.00,1260.00,157500.00,0.00,0.00,202500.00,0.00,0.00,'>202500.0',0.00,0.00,31500.00,NULL,NULL,NULL),(2,70234927,'luis moreno',4050.00,4050.0000,2754.00,56700.00,53946.00,230,20250.00,20250.00,1620.00,81000.00,8100.00,1134.00,141750.00,0.00,0.00,182250.00,0.00,0.00,'>182250.0',0.00,0.00,28350.00,NULL,NULL,NULL),(3,70234927,'Luis Enrique Moreno',4500.00,4050.0000,3636.00,63000.00,59364.00,303,20250.00,20250.00,1620.00,81000.00,14400.00,2016.00,141750.00,0.00,0.00,182250.00,0.00,0.00,'>182250.0',0.00,0.00,34650.00,NULL,'luis.moreno230896@gmail.com',NULL),(4,70234927,'luis moreno',4500.00,4050.0000,3636.00,63000.00,59364.00,303,20250.00,20250.00,1620.00,81000.00,14400.00,2016.00,141750.00,0.00,0.00,182250.00,0.00,0.00,'>182250.0',0.00,0.00,34650.00,NULL,'luis.moreno230896@gmail.com',NULL),(5,70234927,'Luis Enrique Moreno',4500.00,4050.0000,3636.00,63000.00,59364.00,303,20250.00,20250.00,1620.00,81000.00,14400.00,2016.00,141750.00,0.00,0.00,182250.00,0.00,0.00,'>182250.0',0.00,0.00,34650.00,NULL,'luis.moreno230896@gmail.com',NULL),(6,70234927,'chino',3500.00,4050.0000,1652.00,49000.00,47348.00,138,20250.00,20650.00,1652.00,81000.00,0.00,0.00,141750.00,0.00,0.00,182250.00,0.00,0.00,'>182250.0',0.00,0.00,20650.00,NULL,'luis.moreno230896@gmail.com',NULL),(7,75859808,'Miguel Alberto',4500.00,4050.0000,3636.00,63000.00,59364.00,303,20250.00,20250.00,1620.00,81000.00,14400.00,2016.00,141750.00,0.00,0.00,182250.00,0.00,0.00,'>182250.0',0.00,0.00,34650.00,NULL,'miguelbc97@gmail.com',NULL),(8,789456123,'fred',4500.00,4050.0000,3636.00,63000.00,59364.00,303,20250.00,20250.00,1620.00,81000.00,14400.00,2016.00,141750.00,0.00,0.00,182250.00,0.00,0.00,'>182250.0',0.00,0.00,34650.00,NULL,'luis.moreno230896@gmail.com',NULL),(9,36363636,'JOSE PAOLO ',7500.00,4050.0000,9516.00,105000.00,95484.00,793,20250.00,20250.00,1620.00,81000.00,56400.00,7896.00,141750.00,0.00,0.00,182250.00,0.00,0.00,'>182250.0',0.00,0.00,76650.00,NULL,'luis.moreno230896@gmail.com',NULL);
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viaje`
--

DROP TABLE IF EXISTS `viaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `viaje` (
  `idviaje` int(11) NOT NULL AUTO_INCREMENT,
  `viaje` varchar(100) DEFAULT NULL,
  `idpersona` int(11) DEFAULT NULL,
  `numtarjeta` varchar(45) DEFAULT NULL,
  `fechavencimiento` varchar(45) DEFAULT NULL,
  `codigocvc` varchar(45) DEFAULT NULL,
  `nombretarjeta` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idviaje`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viaje`
--

LOCK TABLES `viaje` WRITE;
/*!40000 ALTER TABLE `viaje` DISABLE KEYS */;
INSERT INTO `viaje` VALUES (1,'dsd',5,NULL,NULL,NULL,NULL),(2,'DSDSDS',4,NULL,NULL,NULL,NULL),(3,'CUSCO',4,NULL,NULL,NULL,NULL),(4,'RUSIA',4,NULL,NULL,NULL,NULL),(5,'BRASIL',5,NULL,NULL,NULL,NULL),(6,'CUSCO',6,NULL,NULL,NULL,NULL),(7,'',7,NULL,NULL,NULL,NULL),(8,'',7,NULL,NULL,NULL,NULL),(9,'',7,NULL,NULL,NULL,NULL),(10,'',7,NULL,NULL,NULL,NULL),(11,'',7,NULL,NULL,NULL,NULL),(12,NULL,7,NULL,NULL,NULL,NULL),(13,'Rusia',7,NULL,NULL,NULL,NULL),(14,'Rusia',7,NULL,NULL,NULL,NULL),(15,'Cusco',7,NULL,NULL,NULL,NULL),(16,'Brasil',7,NULL,NULL,NULL,NULL),(17,'Brasil',7,NULL,NULL,NULL,NULL),(18,'Brasil',7,NULL,NULL,NULL,NULL),(19,'Cusco',8,NULL,NULL,NULL,NULL),(20,'Brasil',9,NULL,NULL,NULL,NULL),(21,'Cusco',9,NULL,NULL,NULL,NULL),(22,'Brasil',9,NULL,NULL,NULL,NULL),(23,'Brasil',9,NULL,NULL,NULL,NULL),(24,'Brasil',9,NULL,NULL,NULL,NULL),(25,'Brasil',9,NULL,NULL,NULL,NULL),(26,'Brasil',9,NULL,NULL,NULL,NULL),(27,'Brasil',9,NULL,NULL,NULL,NULL),(28,'viaje1',9,'numeroTarjeta','fechaVencimiento','codigoCVC','nombreTarjeta'),(29,'Tarma',9,'sffs','sfsf','fsf','fsf'),(30,'Tarma',9,'sdsd','dsd','dsd','dsd'),(31,'Tarma',9,'2844','18/20','225','luis enrique moreno');
/*!40000 ALTER TABLE `viaje` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-16  1:24:38
