/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : SSMTest

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 07/20/2017 16:03:21 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `s_book`
-- ----------------------------
DROP TABLE IF EXISTS `s_book`;
CREATE TABLE `s_book` (
  `b_id` int(11) NOT NULL AUTO_INCREMENT,
  `b_bookName` varchar(50) DEFAULT NULL,
  `b_author` varchar(100) DEFAULT NULL,
  `b_price` float DEFAULT NULL,
  `b_introduce` varchar(500) DEFAULT NULL,
  `b_publisher` varchar(100) DEFAULT NULL,
  `b_isbn` bigint(20) DEFAULT NULL,
  `b_repertory` int(11) DEFAULT NULL,
  `b_cover` varchar(400) DEFAULT NULL,
  `b_type` int(11) DEFAULT NULL,
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `s_collection`
-- ----------------------------
DROP TABLE IF EXISTS `s_collection`;
CREATE TABLE `s_collection` (
  `cl_id` int(11) NOT NULL AUTO_INCREMENT,
  `cl_collectorID` int(11) DEFAULT NULL,
  `cl_bookID` int(11) DEFAULT NULL,
  `cl_bookName` varchar(50) DEFAULT NULL,
  `cl_bookPrice` float DEFAULT NULL,
  `cl_bookCover` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`cl_id`),
  KEY `collecterID` (`cl_collectorID`),
  KEY `bookID` (`cl_bookID`),
  CONSTRAINT `s_collection_ibfk_1` FOREIGN KEY (`cl_collectorID`) REFERENCES `s_user` (`u_id`),
  CONSTRAINT `s_collection_ibfk_2` FOREIGN KEY (`cl_bookID`) REFERENCES `s_book` (`b_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `s_comment`
-- ----------------------------
DROP TABLE IF EXISTS `s_comment`;
CREATE TABLE `s_comment` (
  `cm_id` int(11) NOT NULL AUTO_INCREMENT,
  `cm_bookID` int(11) DEFAULT NULL,
  `cm_buyerID` int(11) DEFAULT NULL,
  `cm_commentTime` date DEFAULT NULL,
  `cm_content` varchar(400) DEFAULT NULL,
  `cm_buyerName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cm_id`),
  KEY `bookID` (`cm_bookID`),
  KEY `buyerID` (`cm_buyerID`),
  CONSTRAINT `s_comment_ibfk_1` FOREIGN KEY (`cm_bookID`) REFERENCES `s_book` (`b_id`),
  CONSTRAINT `s_comment_ibfk_2` FOREIGN KEY (`cm_buyerID`) REFERENCES `s_user` (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `s_indent`
-- ----------------------------
DROP TABLE IF EXISTS `s_indent`;
CREATE TABLE `s_indent` (
  `i_id` int(11) NOT NULL AUTO_INCREMENT,
  `i_buyerID` int(11) DEFAULT NULL,
  `i_bookID` int(11) DEFAULT NULL,
  `i_bargainTime` datetime DEFAULT NULL,
  `i_buyerAddress` varchar(300) DEFAULT NULL,
  `i_bookName` varchar(50) DEFAULT NULL,
  `i_bookCover` varchar(400) DEFAULT NULL,
  `i_bookPrice` float DEFAULT NULL,
  `i_bookPublisher` varchar(100) DEFAULT NULL,
  `i_commentState` int(11) DEFAULT NULL,
  `i_buyerMobile` bigint(20) DEFAULT NULL,
  `i_buyerName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`i_id`),
  KEY `buyerID` (`i_buyerID`),
  KEY `bookID` (`i_bookID`),
  KEY `buyerID_2` (`i_buyerID`),
  KEY `bookID_2` (`i_bookID`),
  CONSTRAINT `s_indent_ibfk_1` FOREIGN KEY (`i_buyerID`) REFERENCES `s_user` (`u_id`),
  CONSTRAINT `s_indent_ibfk_2` FOREIGN KEY (`i_bookID`) REFERENCES `s_book` (`b_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `s_user`
-- ----------------------------
DROP TABLE IF EXISTS `s_user`;
CREATE TABLE `s_user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_userName` varchar(50) NOT NULL,
  `u_password` varchar(30) NOT NULL,
  `u_mobile` bigint(20) DEFAULT NULL,
  `u_address` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`u_id`),
  KEY `userName` (`u_userName`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
