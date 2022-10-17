-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: bankmanagement
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accountdetails`
--

DROP TABLE IF EXISTS `accountdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accountdetails` (
  `AccountNumber` varchar(10) NOT NULL,
  `FirstName` text,
  `LastName` text,
  `Username` varchar(30) DEFAULT NULL,
  `Email` text,
  `Gender` text,
  `Phone` varchar(10) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `AdharNumber` text,
  `PanNumber` text,
  `Deposit` double DEFAULT NULL,
  `Password` text,
  PRIMARY KEY (`AccountNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accountdetails`
--

LOCK TABLES `accountdetails` WRITE;
/*!40000 ALTER TABLE `accountdetails` DISABLE KEYS */;
INSERT INTO `accountdetails` VALUES ('123','Sachin','Kumar','sachin_','sachin9@gmail.com','Male','9576358344','2003-03-17','3454545','45465657',566,'1234'),('1234','sanjeev','saingh','sanjeev123','sksingh@gmail.com','Male','7482912775','2001-03-30','846009893505','MGR854JKL',7177,'1234'),('12345','Hjdsfhkh','Hjksdhfj','djsf','hjdshfj','Male','7453992452','2022-04-12','5435353','6554645645',5777,'1234'),('123456','Fsdfds','Fdsafds','dfsasfds','afsdafs','','342423423','2022-04-12','Aadhaar Number','Pan Number',324,'1234'),('1234567','Sachin','Kumar','sachin','sachin900555@gmail.com','Male','8340527773','2003-03-17','12243453564','sadfw43453',5666,'123'),('123456721','Saurav','Bauddh','bauddhsg','bauddhsaurav@gmail.com','Male','9399911514','2003-11-06','6232081312','145671680',145000,'9827204286'),('123456789','Aditya','Thakur','aditya123','sgajfh@gmail.com','Male','6267644543','2022-04-03','123467476474','2y35yu345y',99000,'12345'),('123456790','Sanjeev','Kumar','sanjeev00','sk@gmail.com','Male','7482912775','2001-03-30','2344444222222222','2222222222',9477,'1234'),('1237','Sds','Dsfs','asd','sachin@gmail.com','Male','3435345353','2022-04-01','343535454565','4343rved54',5,'123'),('145530438','Sanjeev','Singh','sanjeev1','sksingh@gmail.com','Male','2232323232','2022-06-03','232323232322','2323232323',32232,'123456'),('2423434434','Shivam','Kumar','shivam@123','kumarshi605@gmail.com','Male','7453992452','2022-04-13','434343434367','4343434343',44343457,'123'),('3242','shivam','kumar','shivam','kumark','Male','865','2022-04-06','211213','342435',4234325,'1234'),('324342424','Jh','Jh','shivam1234','@gmail.com','Male','3435435435','2022-04-04','787878778878','7877878787',3435353535,'1234'),('576832006','Xcj','Zxzc','abhi','sadasafa@gmail.com','Male','3424234233','2022-09-07','342342342342','4324234234',4323223,'123456'),('708560316','Sanjeev','Singh','sks','sks@gmail.com','Male','8989898989','2022-10-30','123456789098','0987654334',90000,'12345678'),('7483748738','Shivam','Kumar','shivam123','kumarshi605@gmail.com','Male','7453992452','2002-03-13','696756576767','fgf655767t',678568567575,'1234'),('773104351','Sanjeev','Kumar','sanjeev007','sksingj@gmail.com','Male','7482912775','2001-03-30','878717271317','76676776B7',61901,'123456');
/*!40000 ALTER TABLE `accountdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `new`
--

DROP TABLE IF EXISTS `new`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `new` (
  `col1` int NOT NULL,
  `col2` int NOT NULL,
  PRIMARY KEY (`col1`,`col2`),
  UNIQUE KEY `col1` (`col1`,`col2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `new`
--

LOCK TABLES `new` WRITE;
/*!40000 ALTER TABLE `new` DISABLE KEYS */;
INSERT INTO `new` VALUES (12,36),(12,44);
/*!40000 ALTER TABLE `new` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactions`
--

DROP TABLE IF EXISTS `transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transactions` (
  `Date` date DEFAULT NULL,
  `AccountNumber` varchar(10) DEFAULT NULL,
  `Amount` double DEFAULT NULL,
  `CorD` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactions`
--

LOCK TABLES `transactions` WRITE;
/*!40000 ALTER TABLE `transactions` DISABLE KEYS */;
INSERT INTO `transactions` VALUES ('2022-04-12','9632',852,'Debited'),('2022-04-12','9632',100,'Credited'),('2022-04-12','7453992452',5000,'Debited'),('2022-04-12','7453992452',5000,'Credited'),('2022-04-12','7410',452,'Debited'),('2022-04-12','7410',60,'Debited'),('2022-04-12','7410',8520,'Credited'),('2022-04-12','7410',45,'Debited'),('2022-04-12','7410',1215,'Debited'),('2022-04-12','7410',7410,'Credited'),('2022-04-12','123',10,'Debited'),('2022-04-12','123',5000,'Credited'),('2022-04-20','1234567',67878,'Debited'),('2022-04-20','1234567',654645,'Credited'),('2022-04-22','123456790',90,'Debited'),('2022-04-22','123456790',5000,'Credited'),('2022-04-23','123456721',5000,'Debited'),('2022-04-23','123456721',50000,'Credited'),('2022-04-27','455454121',5464645,'Debited'),('2022-04-27','1234',45,'Debited'),('2022-04-28','455454121',3247937489,'Credited'),('2022-04-28','455454121',5044654,'Debited'),('2022-04-28','455454121',879878978,'Debited'),('2022-04-28','455454121',65858,'Credited'),('2022-04-28','2423434434',23,'Credited'),('2022-04-29','123456789',1000,'Debited'),('2022-05-25','773104351',6667,'Debited'),('2022-05-25','773104351',678,'Credited');
/*!40000 ALTER TABLE `transactions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-18  0:43:14
