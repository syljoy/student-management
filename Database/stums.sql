/*
Navicat MySQL Data Transfer

Source Server         : JavaSpring
Source Server Version : 50613
Source Host           : localhost:3306
Source Database       : stums

Target Server Type    : MYSQL
Target Server Version : 50613
File Encoding         : 65001

Date: 2019-02-27 13:18:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminId` varchar(255) NOT NULL,
  `adminPassword` varchar(255) NOT NULL,
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', 'admin');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stuId` varchar(255) NOT NULL,
  `stuName` varchar(255) DEFAULT NULL,
  `stuPassword` varchar(255) DEFAULT NULL,
  `stuBirthday` varchar(25) DEFAULT NULL,
  `stuPhone` varchar(11) DEFAULT NULL,
  `stuAddress` varchar(255) DEFAULT NULL,
  `stuMath` double(255,2) DEFAULT '-1.00',
  `stuEnglish` double(255,2) DEFAULT '-1.00',
  `stuJava` double(255,2) DEFAULT '-1.00',
  `stuC` double(255,2) DEFAULT '-1.00',
  `stuPE` double(255,2) DEFAULT '-1.00',
  PRIMARY KEY (`stuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('20151314001', '张三', '123456', '1997-10-21', '15648523654', '河北石家庄', '89.00', '56.00', '90.00', '85.00', '62.00');
INSERT INTO `student` VALUES ('20151314002', '李四', '159753', '1996-08-02', '15688557596', '河南郑州', '45.00', '95.00', '85.00', '61.00', '60.00');
INSERT INTO `student` VALUES ('20151314003', '王五', '154752', '1999-08-01', '14569887563', '北京', '60.00', '60.00', '59.00', '59.00', '59.99');
INSERT INTO `student` VALUES ('20151314004', '赵六', '465123', '2000-08-07', '15985668745', '上海', '-1.00', '-1.00', '-1.00', '-1.00', '-1.00');
