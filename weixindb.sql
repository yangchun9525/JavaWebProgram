/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : weixindb

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 10/06/2018 16:57:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_area
-- ----------------------------
DROP TABLE IF EXISTS `tb_area`;
CREATE TABLE `tb_area`  (
  `area_id` int(2) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `priority` int(2) NOT NULL DEFAULT 0,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `last_edit_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`area_id`) USING BTREE,
  UNIQUE INDEX `UK_AREA`(`area_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_area
-- ----------------------------
INSERT INTO `tb_area` VALUES (1, '东苑', 2, '2018-06-10 10:03:34', '2018-06-10 10:03:50');
INSERT INTO `tb_area` VALUES (2, '西苑', 1, '2018-06-10 11:15:34', '2018-06-10 11:15:50');

SET FOREIGN_KEY_CHECKS = 1;
