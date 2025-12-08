CREATE DATABASE  IF NOT EXISTS `bankmanagmentsystem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bankmanagmentsystem`;
-- MySQL dump 10.13  Distrib 8.0.44, for Win64 (x86_64)
--
-- Host: localhost    Database: bankmanagmentsystem
-- ------------------------------------------------------
-- Server version	8.0.44

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
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `form_no` varchar(20) NOT NULL,
  `full_name` varchar(150) NOT NULL,
  `father_name` varchar(150) DEFAULT NULL,
  `date_of_birth` date NOT NULL,
  `gender` enum('Male','Female') NOT NULL,
  `email` varchar(150) NOT NULL,
  `marital_status` enum('Married','Unmarried','Other') NOT NULL,
  `pin_code` varchar(4) NOT NULL,
  `governorate` varchar(50) NOT NULL,
  `religion` enum('Muslim','Christian','Sikh','Others') DEFAULT 'Others',
  `income` enum('No Income','Less than 5,000','5,000 - 10,000','10,001 - 20,000','More than 20,000') DEFAULT 'No Income',
  `education` enum('Non-Graduate','Graduate','Doctorate','Post-Graduate','Others') DEFAULT 'Others',
  `occupation` enum('Student','Salaried','Self-Employed','Business','Retired','Others') DEFAULT 'Others',
  `national_id` varchar(20) DEFAULT NULL,
  `account_type` varchar(50) NOT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `form_no` (`form_no`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `national_id` (`national_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (1,'APP1001','John Smith','Robert Smith','1995-05-15','Male','john.smith@test.com','Unmarried','1151','Cairo','Christian','10,001 - 20,000','Non-Graduate','Others','ID-123456789','Saving Account','2025-12-08 20:45:47'),(2,'APP1002','Sarah Johnson','David Johnson','1998-08-20','Female','sarah.johnson@test.com','Unmarried','2151','Alexandria','Christian','Less than 5,000','Graduate','Others','ID-987654321','Saving Account','2025-12-08 20:45:47');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `requested_services`
--

DROP TABLE IF EXISTS `requested_services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `requested_services` (
  `id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int DEFAULT NULL,
  `service_name` enum('ATM CARD','Cheque Book','EMAIL Alerts','Internet Banking','Mobile Banking','E_Statement') NOT NULL,
  `is_selected` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `requested_services_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requested_services`
--

LOCK TABLES `requested_services` WRITE;
/*!40000 ALTER TABLE `requested_services` DISABLE KEYS */;
INSERT INTO `requested_services` VALUES (1,1,'ATM CARD',1),(2,1,'Internet Banking',1),(3,1,'Mobile Banking',1),(4,1,'E_Statement',1),(5,2,'ATM CARD',1),(6,2,'Cheque Book',0),(7,2,'EMAIL Alerts',1),(8,2,'Internet Banking',1),(9,2,'Mobile Banking',0),(10,2,'E_Statement',1);
/*!40000 ALTER TABLE `requested_services` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction_history`
--

DROP TABLE IF EXISTS `transaction_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transaction_history` (
  `id` int NOT NULL AUTO_INCREMENT,
  `card_no` varchar(20) NOT NULL,
  `transaction_type` enum('Withdraw','Deposit','Quick Withdraw','Transfer') NOT NULL,
  `amount` double NOT NULL,
  `transaction_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `card_no` (`card_no`),
  CONSTRAINT `transaction_history_ibfk_1` FOREIGN KEY (`card_no`) REFERENCES `users` (`card`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction_history`
--

LOCK TABLES `transaction_history` WRITE;
/*!40000 ALTER TABLE `transaction_history` DISABLE KEYS */;
INSERT INTO `transaction_history` VALUES (1,'5664-1370-6686-5','Withdraw',500,'2025-12-08 20:45:47'),(2,'5664-1370-6686-5','Deposit',300,'2025-12-08 20:45:47'),(3,'XXXX-XXXX-XXXX-4581','Deposit',1000,'2025-12-08 20:45:47');
/*!40000 ALTER TABLE `transaction_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int DEFAULT NULL,
  `card` varchar(20) NOT NULL,
  `pin` varchar(4) NOT NULL,
  `balance` double DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `card` (`card`),
  UNIQUE KEY `customer_id` (`customer_id`),
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,1,'5664-1370-6686-5','1212',5000),(2,2,'XXXX-XXXX-XXXX-4581','1234',3000);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-12-08 23:06:11
