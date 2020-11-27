/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 80021
Source Host           : localhost:3306
Source Database       : zrq

Target Server Type    : MYSQL
Target Server Version : 80021
File Encoding         : 65001

Date: 2020-10-30 18:43:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for region
-- ----------------------------
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `regionid` int NOT NULL,
  `rname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`regionid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of region
-- ----------------------------
INSERT INTO `region` VALUES ('0', '--请选择--');
INSERT INTO `region` VALUES ('1', '大陆');
INSERT INTO `region` VALUES ('2', '新加坡');
INSERT INTO `region` VALUES ('3', '欧美');
INSERT INTO `region` VALUES ('4', '港澳');
