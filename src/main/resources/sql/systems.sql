/*
Navicat MySQL Data Transfer

Source Server         : HOST
Source Server Version : 50537
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2019-03-09 23:09:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for systems
-- ----------------------------
DROP TABLE IF EXISTS `systems`;
CREATE TABLE `systems` (
  `sysID` char(32) NOT NULL,
  `sysName` varchar(255) DEFAULT NULL,
  `sysDescribe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sysID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of systems
-- ----------------------------
INSERT INTO `systems` VALUES ('1', 'xiaoming', 'xiaoming');
