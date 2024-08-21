-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 13, 2023 at 09:56 PM
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
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `ids` int(255) NOT NULL,
  `ID` varchar(500) NOT NULL,
  `questions` varchar(500) NOT NULL,
  `Option1` varchar(500) NOT NULL,
  `Option2` varchar(500) NOT NULL,
  `Option3` varchar(500) NOT NULL,
  `Option4` varchar(500) NOT NULL,
  `answer` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`ids`, `ID`, `questions`, `Option1`, `Option2`, `Option3`, `Option4`, `answer`) VALUES
(3, '1', 'All Key Words in C Are?', 'LowerCase', 'UpperCase', 'CamelCase', 'None of The Above', 'LowerCase'),
(8, '2', 'Constructors in Java', 'Can\'t be Overloded', 'Can be inherited', 'Declared by the class name', 'None of the above', 'Declared by the class name'),
(10, '3', 'The Concept Of Overridding and OverLoading a method inferred as?', 'Inheritance', 'Encapsulation', 'Polymorphism', 'Abstruction', 'Polymorphism'),
(11, '4', 'Abstruct Class Contains?', 'Only Abstruct Methods', 'Only Concreat Methods', 'Method Can\'t Be Defined in Abstruct Class', 'None Of The Above', 'None Of The Above'),
(14, '5', 'A Class Can', 'Extend Multiple Classes', 'Can Only Impliment One Interface', 'Extend Multiple Abstruct Class', 'None Of The Above', 'None Of The Above'),
(15, '6', 'The Concept of Two Function With The Same Name But Different Return Type Is Known As?', 'Operator Overloading', 'Function Overloading', 'Function Overrriding', 'Function Renaming', 'Function Overloading'),
(16, '7', 'Which Programming Language is More Faster Among These?', 'PHP', 'Java', 'C', 'Visual Basic', 'C'),
(17, '8', 'int [ ] arr={1,2,3,4,5};System.out.println(arr[5]); Throws?', 'ArrayStoreException', 'illegalArgumentException', 'ArithmeticException', 'ArreyIndexOutOfBoundException', 'ArreyIndexOutOfBoundException'),
(18, '9', 'The Process of wrapping the data (variables) and code acting on the data (methods) together as a single unit Is called', 'Abstruction', 'Encapsulation', 'Polymorpisms', 'None of the above', 'Encapsulation'),
(19, '10', 'Different field/variables Represents?', 'State Of The Object', 'Behavior Of The Object', 'Characteristic Of The Object', 'Type Of The Object', 'State Of The Object');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`ids`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `ids` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
