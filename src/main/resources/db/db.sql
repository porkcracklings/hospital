-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.6.27-log - MySQL Community Server (GPL)
-- ОС Сервера:                   Win64
-- HeidiSQL Версия:              9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Дамп структуры базы данных clinic
CREATE DATABASE IF NOT EXISTS `clinic` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `clinic`;


-- Дамп структуры для таблица clinic.address
CREATE TABLE IF NOT EXISTS `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(45) NOT NULL,
  `street` varchar(45) NOT NULL,
  `house` varchar(45) NOT NULL,
  `apartment` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы clinic.address: ~4 rows (приблизительно)
DELETE FROM `address`;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`id`, `city`, `street`, `house`, `apartment`) VALUES
	(1, 'test', 'test', 'test', 'test'),
	(2, 'adrs1', 'adrs1', 'adrs1', 'adrs1'),
	(3, 'adrs', 'adrs', 'adrs', 'adrs'),
	(4, 'adrs', 'adrs', 'adrs', 'adrs');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;


-- Дамп структуры для таблица clinic.analizes
CREATE TABLE IF NOT EXISTS `analizes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `patientID` int(11) NOT NULL,
  `urineID` int(11) NOT NULL,
  `bloodID` int(11) NOT NULL,
  `biochemistryID` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_analizes_urine1_idx` (`urineID`),
  KEY `fk_analizes_blood1_idx` (`bloodID`),
  KEY `fk_analizes_biochemistry1_idx` (`biochemistryID`),
  KEY `id_idx` (`patientID`),
  CONSTRAINT `fk_analizes_biochemistry1` FOREIGN KEY (`biochemistryID`) REFERENCES `biochemistry` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_analizes_blood1` FOREIGN KEY (`bloodID`) REFERENCES `blood` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_analizes_urine1` FOREIGN KEY (`urineID`) REFERENCES `urine` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id1` FOREIGN KEY (`patientID`) REFERENCES `patient` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы clinic.analizes: ~0 rows (приблизительно)
DELETE FROM `analizes`;
/*!40000 ALTER TABLE `analizes` DISABLE KEYS */;
/*!40000 ALTER TABLE `analizes` ENABLE KEYS */;


-- Дамп структуры для таблица clinic.biochemistry
CREATE TABLE IF NOT EXISTS `biochemistry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `glucose` double NOT NULL,
  `urea` double NOT NULL,
  `cholesterol` double NOT NULL,
  `data` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы clinic.biochemistry: ~0 rows (приблизительно)
DELETE FROM `biochemistry`;
/*!40000 ALTER TABLE `biochemistry` DISABLE KEYS */;
/*!40000 ALTER TABLE `biochemistry` ENABLE KEYS */;


-- Дамп структуры для таблица clinic.blood
CREATE TABLE IF NOT EXISTS `blood` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hemoglobin` int(11) NOT NULL,
  `erythrocytes` double NOT NULL,
  `leukocytes` int(11) NOT NULL,
  `soa` int(11) NOT NULL,
  `data` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы clinic.blood: ~0 rows (приблизительно)
DELETE FROM `blood`;
/*!40000 ALTER TABLE `blood` DISABLE KEYS */;
/*!40000 ALTER TABLE `blood` ENABLE KEYS */;


-- Дамп структуры для таблица clinic.patient
CREATE TABLE IF NOT EXISTS `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(45) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `middleName` varchar(45) NOT NULL,
  `passport` varchar(45) NOT NULL,
  `phoneNumber` int(11) DEFAULT NULL,
  `birthday` date NOT NULL,
  `allergy` varchar(45) DEFAULT NULL,
  `addressID` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `addressID_idx` (`addressID`),
  CONSTRAINT `addressID` FOREIGN KEY (`addressID`) REFERENCES `address` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы clinic.patient: ~4 rows (приблизительно)
DELETE FROM `patient`;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` (`id`, `lastName`, `firstName`, `middleName`, `passport`, `phoneNumber`, `birthday`, `allergy`, `addressID`) VALUES
	(3, 'testPat', 'testPat', 'testPat', 'testPat', 777777, '1990-10-10', 'tetsPat', 1),
	(4, 'new2', 'new2', 'new2', 'new2', 56897848, '1995-01-01', 'new2', 3),
	(5, 'qwe', 'qwe', 'qwe', 'qwe', 7896541, '1970-04-03', 'tea', 2),
	(6, 'qwe', 'new2', 'test', 'testPat', 2265894, '2000-10-10', NULL, 2);
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;


-- Дамп структуры для таблица clinic.personal
CREATE TABLE IF NOT EXISTS `personal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(45) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `middleName` varchar(45) NOT NULL,
  `specializationId` int(11) NOT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `id_idx` (`specializationId`),
  CONSTRAINT `id` FOREIGN KEY (`specializationId`) REFERENCES `specialization` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы clinic.personal: ~2 rows (приблизительно)
DELETE FROM `personal`;
/*!40000 ALTER TABLE `personal` DISABLE KEYS */;
INSERT INTO `personal` (`id`, `lastName`, `firstName`, `middleName`, `specializationId`, `login`, `password`) VALUES
	(1, 'test', 'test1', 'test', 6, 'test', 'test'),
	(2, 'new', 'new', 'new', 8, 'new', 'new');
/*!40000 ALTER TABLE `personal` ENABLE KEYS */;


-- Дамп структуры для таблица clinic.recourse
CREATE TABLE IF NOT EXISTS `recourse` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `patientID` int(11) NOT NULL,
  `personalID` int(11) NOT NULL,
  `complaint` varchar(90) NOT NULL,
  `recoursecol` varchar(90) NOT NULL,
  `state` varchar(90) NOT NULL,
  `appointment` varchar(90) NOT NULL,
  `diagnosis` varchar(45) NOT NULL,
  `data` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `id3_idx` (`patientID`),
  KEY `id4_idx` (`personalID`),
  CONSTRAINT `id3` FOREIGN KEY (`patientID`) REFERENCES `patient` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id4` FOREIGN KEY (`personalID`) REFERENCES `personal` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы clinic.recourse: ~0 rows (приблизительно)
DELETE FROM `recourse`;
/*!40000 ALTER TABLE `recourse` DISABLE KEYS */;
/*!40000 ALTER TABLE `recourse` ENABLE KEYS */;


-- Дамп структуры для таблица clinic.specialization
CREATE TABLE IF NOT EXISTS `specialization` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `specializationName` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы clinic.specialization: ~8 rows (приблизительно)
DELETE FROM `specialization`;
/*!40000 ALTER TABLE `specialization` DISABLE KEYS */;
INSERT INTO `specialization` (`id`, `specializationName`) VALUES
	(1, 'receptionist'),
	(2, 'personalManager'),
	(3, 'mainDoctor'),
	(4, 'laboratoryAsistant'),
	(5, 'otolaryngologist'),
	(6, 'surgeon'),
	(7, 'ophthalmologist'),
	(8, 'neurologist');
/*!40000 ALTER TABLE `specialization` ENABLE KEYS */;


-- Дамп структуры для таблица clinic.urine
CREATE TABLE IF NOT EXISTS `urine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `specWeight` int(10) NOT NULL,
  `reaction` int(10) NOT NULL,
  `protein` int(1) NOT NULL,
  `glucose` int(1) NOT NULL,
  `data` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы clinic.urine: ~0 rows (приблизительно)
DELETE FROM `urine`;
/*!40000 ALTER TABLE `urine` DISABLE KEYS */;
/*!40000 ALTER TABLE `urine` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
