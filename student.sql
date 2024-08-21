-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 13, 2023 at 09:57 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `digital_examination`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(200) NOT NULL,
  `regno` varchar(255) NOT NULL,
  `name` varchar(100) NOT NULL,
  `fathername` varchar(100) NOT NULL,
  `mothername` varchar(100) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `contactno` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `gradetenschool` varchar(200) NOT NULL,
  `gradetenresult` varchar(20) NOT NULL,
  `gradetenpassouty` varchar(20) NOT NULL,
  `gradetwelveschool` varchar(200) NOT NULL,
  `gradetwelveresult` varchar(20) NOT NULL,
  `gradetwelvepassouty` varchar(20) NOT NULL,
  `graduatedfrom` varchar(200) NOT NULL,
  `cgpa` varchar(20) NOT NULL,
  `unipassoutyear` varchar(20) NOT NULL,
  `address` varchar(255) NOT NULL,
  `mark` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `regno`, `name`, `fathername`, `mothername`, `gender`, `contactno`, `email`, `gradetenschool`, `gradetenresult`, `gradetenpassouty`, `gradetwelveschool`, `gradetwelveresult`, `gradetwelvepassouty`, `graduatedfrom`, `cgpa`, `unipassoutyear`, `address`, `mark`) VALUES
(17, '1202344', 'Maritu', 'Legesse', 'Ayelech', 'Female', '0988765434', 'mar@gmail.com', 'Abay', '3.5', '2009', 'Tana', '467', '2011', 'BDU', '3.5', '2016', 'jjjjjjjjjjjj', 5),
(20, '1204634', 'ermiyas', 'dessalegn', 'noooo', 'Male', '0977024524', 'ermiyasdessalegn00@gmail.com', 'dgwj', '4', '2012', 'skd', '700', '5548', 'sfgj', '4', '54874', 't3566u7iop[]', 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
