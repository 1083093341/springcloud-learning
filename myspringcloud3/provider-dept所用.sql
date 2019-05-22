/*
 Navicat Premium Data Transfer

 Source Server         : mydemo
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : db01

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 14/05/2019 17:52:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `db_source` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of dept
-- ----------------------------
BEGIN;
INSERT INTO `dept` VALUES (1, '市场', 'db01');
INSERT INTO `dept` VALUES (2, '运营', 'db01');
INSERT INTO `dept` VALUES (3, '开发部', 'db01');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
