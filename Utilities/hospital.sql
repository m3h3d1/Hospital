-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 08, 2021 at 07:29 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `admission`
--

DROP TABLE IF EXISTS `admission`;
CREATE TABLE IF NOT EXISTS `admission` (
  `AdmissionID` int(11) NOT NULL COMMENT 'Admission ID',
  `PatientID` int(11) NOT NULL,
  `RoomNo` int(11) NOT NULL,
  `Duration` int(11) NOT NULL,
  PRIMARY KEY (`AdmissionID`),
  KEY `Admission_RoomNo` (`RoomNo`),
  KEY `admission_PatientID` (`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admission`
--

INSERT INTO `admission` (`AdmissionID`, `PatientID`, `RoomNo`, `Duration`) VALUES
(1, 343, 101, 4),
(2, 9, 103, 2),
(3, 9, 103, 3);

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `DeptID` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL COMMENT 'Department Name',
  `Head` varchar(30) NOT NULL COMMENT 'Department Head',
  `Contact` varchar(11) NOT NULL COMMENT 'Contact Number',
  PRIMARY KEY (`DeptID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`DeptID`, `Name`, `Head`, `Contact`) VALUES
(1, 'Psychology', 'MR. Karim', '1922764836'),
(2, 'Dental', 'Abdul Mutaleb Hossain', '01937467896'),
(3, 'Physiology', 'Dr. Md. Zabbar', '01987657897'),
(5, 'Cardiology', 'Dr. Md. Rafiq', '0189776543');

-- --------------------------------------------------------

--
-- Table structure for table `doctor_info`
--

DROP TABLE IF EXISTS `doctor_info`;
CREATE TABLE IF NOT EXISTS `doctor_info` (
  `DoctorID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL COMMENT 'Doctor Name',
  `DeptID` int(11) NOT NULL COMMENT 'Department ID',
  `Designation` varchar(20) NOT NULL,
  `Salary` int(11) NOT NULL,
  `WorkingHour` double NOT NULL,
  `VisitingFee` int(11) NOT NULL,
  PRIMARY KEY (`DoctorID`),
  KEY `Schedule_DeptID` (`DeptID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor_info`
--

INSERT INTO `doctor_info` (`DoctorID`, `Name`, `DeptID`, `Designation`, `Salary`, `WorkingHour`, `VisitingFee`) VALUES
(3, 'Dr. Kamal', 1, 'Dentist', 30000, 3, 200),
(5, 'Dr. Rafique', 1, 'Dentist', 40000, 4, 100),
(7, 'Dr. Salam', 1, 'Dentist', 50000, 5, 300),
(9, 'Dr. Sabbir', 5, 'Cardiologist', 55000, 3, 200),
(43, 'dfg', 1, 'dfg', 434, 234, 234);

-- --------------------------------------------------------

--
-- Table structure for table `patient_history`
--

DROP TABLE IF EXISTS `patient_history`;
CREATE TABLE IF NOT EXISTS `patient_history` (
  `PatientID` int(11) NOT NULL,
  `DoctorID` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Diagnosis` varchar(20) NOT NULL,
  `Medicine` varchar(40) NOT NULL,
  PRIMARY KEY (`Date`),
  KEY `PatientInfo_DoctorID` (`DoctorID`),
  KEY `PatientInfo_PatientID` (`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient_history`
--

INSERT INTO `patient_history` (`PatientID`, `DoctorID`, `Date`, `Diagnosis`, `Medicine`) VALUES
(9, 9, '2021-03-06', 'Xray', 'Ace'),
(343, 43, '2021-03-08', 'XRay', 'Napa');

-- --------------------------------------------------------

--
-- Table structure for table `patient_info`
--

DROP TABLE IF EXISTS `patient_info`;
CREATE TABLE IF NOT EXISTS `patient_info` (
  `PatientID` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `DoB` date NOT NULL COMMENT 'Date of Birth (dd-mm-yyyy)',
  `BloodGroup` varchar(10) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `ContactNo` varchar(11) NOT NULL,
  `EmContact` varchar(11) NOT NULL COMMENT 'Emergency Contact Number',
  `Email` varchar(20) NOT NULL,
  PRIMARY KEY (`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient_info`
--

INSERT INTO `patient_info` (`PatientID`, `Name`, `DoB`, `BloodGroup`, `Address`, `ContactNo`, `EmContact`, `Email`) VALUES
(1, 'Abdur Rahim', '2005-03-16', 'A+', 'Motijheel, Dhaka', '01945767876', '01973578765', 'rahim@gmail.com'),
(2, 'Abdur Karim', '2005-03-16', 'B+', 'Motijheel, Dhaka', '01945767878', '01973578763', 'karim@gmail.com'),
(4, 'Sajib', '2015-03-18', 'A+', 'Kamalapur', '01867898765', '01678987654', 'sajib@gmail.com'),
(5, 'Malek', '2004-03-11', 'B+', 'Shahjahanpur, Dhaka', '01893898765', '01837655457', 'malek@gmail.com'),
(6, 'Rishan', '2007-03-08', 'B+', 'Jamalpur', '01987678987', '01978766544', 'rishan@gmail.com'),
(7, 'Sabuj', '2015-03-05', 'A+', 'Narail', '01987655689', '08766554467', 'sabuj@gmail.com'),
(8, 'Shafiq', '2012-03-14', 'O+', 'Barishal', '01849789765', '01898767654', 'shafiq@yahoo.com'),
(9, 'Jishan', '2005-03-15', 'A+', 'Sylhet', '01786567876', '01897656785', 'jishan@gmail.com'),
(343, 'sedrg', '2021-03-03', 'drgs', 'sdr', 'gdrgf', 'dfg', 'sdrf');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `PaymentID` int(11) NOT NULL,
  `Date` varchar(10) NOT NULL,
  `AdmissionID` int(11) NOT NULL,
  `PatientID` int(11) NOT NULL,
  `Total` int(11) NOT NULL COMMENT 'Total Amount',
  `Paid` int(11) NOT NULL COMMENT 'Amount Paid',
  `Due` int(11) NOT NULL COMMENT 'Balance Due',
  PRIMARY KEY (`PaymentID`),
  KEY `Payment_AdmissionID` (`AdmissionID`),
  KEY `Payment_PatientID` (`PatientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`PaymentID`, `Date`, `AdmissionID`, `PatientID`, `Total`, `Paid`, `Due`) VALUES
(1, '2021-03-08', 1, 343, 1000, 700, 300),
(3, '2021-03-09', 1, 1, 900, 900, 0),
(8, '2021-03-09', 1, 1, 900, 800, 100);

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
CREATE TABLE IF NOT EXISTS `room` (
  `RoomNo` int(11) NOT NULL,
  `Type` varchar(10) NOT NULL COMMENT 'RoomType',
  `Cost` int(11) NOT NULL COMMENT 'Cost Per Day',
  `Date` date NOT NULL,
  `Availability` varchar(5) NOT NULL,
  PRIMARY KEY (`RoomNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`RoomNo`, `Type`, `Cost`, `Date`, `Availability`) VALUES
(101, 'General', 300, '2021-03-08', 'YES'),
(102, 'Emergency', 3000, '2021-03-09', 'YES'),
(103, 'General', 300, '2021-03-09', 'YES');

-- --------------------------------------------------------

--
-- Table structure for table `schedule_info`
--

DROP TABLE IF EXISTS `schedule_info`;
CREATE TABLE IF NOT EXISTS `schedule_info` (
  `DoctorID` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Availability` varchar(5) NOT NULL,
  KEY `Schedule_DoctorID` (`DoctorID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schedule_info`
--

INSERT INTO `schedule_info` (`DoctorID`, `Date`, `Availability`) VALUES
(43, '2021-03-08', 'YES'),
(3, '2021-03-11', 'YES'),
(9, '2021-03-10', 'YES');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admission`
--
ALTER TABLE `admission`
  ADD CONSTRAINT `Admission_RoomNo` FOREIGN KEY (`RoomNo`) REFERENCES `room` (`RoomNo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `admission_PatientID` FOREIGN KEY (`PatientID`) REFERENCES `patient_info` (`PatientID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `doctor_info`
--
ALTER TABLE `doctor_info`
  ADD CONSTRAINT `Schedule_DeptID` FOREIGN KEY (`DeptID`) REFERENCES `department` (`DeptID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `patient_history`
--
ALTER TABLE `patient_history`
  ADD CONSTRAINT `PatientInfo_DoctorID` FOREIGN KEY (`DoctorID`) REFERENCES `doctor_info` (`DoctorID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `PatientInfo_PatientID` FOREIGN KEY (`PatientID`) REFERENCES `patient_info` (`PatientID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `Payment_AdmissionID` FOREIGN KEY (`AdmissionID`) REFERENCES `admission` (`AdmissionID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Payment_PatientID` FOREIGN KEY (`PatientID`) REFERENCES `patient_info` (`PatientID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `schedule_info`
--
ALTER TABLE `schedule_info`
  ADD CONSTRAINT `Schedule_DoctorID` FOREIGN KEY (`DoctorID`) REFERENCES `doctor_info` (`DoctorID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
