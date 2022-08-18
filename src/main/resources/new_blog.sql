/*
 Navicat Premium Data Transfer

 Source Server         : 腾讯云
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : www.javashitang.com:3306
 Source Schema         : new_blog

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 23/06/2021 16:23:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for blog_user
-- ----------------------------
DROP TABLE IF EXISTS `blog_user`;
CREATE TABLE `blog_user` (
                             `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
                             `username` varchar(255) NOT NULL COMMENT '用户名',
                             `password` varchar(255) NOT NULL COMMENT '密码',
                             `integral` int(11) DEFAULT NULL COMMENT '积分',
                             PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of blog_user
-- ----------------------------
BEGIN;
INSERT INTO `blog_user` VALUES (2, 'root', '89753169ED5120291E4FC0AD512307F8', NULL);
INSERT INTO `blog_user` VALUES (3, 'test', '661BB8500BEB04EBA92D06C9BDD821E6', NULL);
INSERT INTO `blog_user` VALUES (4, 'wangjinyin1234', 'DB21DC40933B73AC1AC5CFF5A43601E5', NULL);
COMMIT;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
                            `category_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类别id',
                            `category_name` varchar(255) NOT NULL COMMENT '类别名字',
                            PRIMARY KEY (`category_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of category
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES (1, '后端');
INSERT INTO `category` VALUES (2, '前端');
INSERT INTO `category` VALUES (3, '大数据');
INSERT INTO `category` VALUES (4, 'python');
INSERT INTO `category` VALUES (5, 'php');
COMMIT;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
                           `comment_id` int(11) NOT NULL,
                           `user_id` int(11) NOT NULL,
                           `content` varchar(255) NOT NULL,
                           PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of comment
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
                            `resource_id` int(11) NOT NULL AUTO_INCREMENT,
                            `category_id` int(11) NOT NULL,
                            `user_id` int(11) NOT NULL,
                            `name` varchar(255) NOT NULL,
                            `link` varchar(255) NOT NULL,
                            `code` varchar(255) NOT NULL,
                            `description` varchar(255) DEFAULT NULL,
                            `post_date` datetime DEFAULT NULL,
                            `view_count` int(11) DEFAULT NULL,
                            `download_count` int(11) DEFAULT NULL,
                            `is_show` tinyint(3) NOT NULL DEFAULT '0',
                            `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
                            PRIMARY KEY (`resource_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of resource
-- ----------------------------
BEGIN;
INSERT INTO `resource` VALUES (2, 1, 2, 'Java玩转算法系列--图论精讲 面试升职必备', 'https://pan.baidu.com/s/12cEKPMfHsECRFG_dOrxOUg', '3h4p', NULL, '2020-01-20 21:36:28', NULL, NULL, 1, '2020-01-20 21:36:27');
INSERT INTO `resource` VALUES (3, 1, 2, '33算法面试通关40讲', 'https://pan.baidu.com/s/1zTm3jYzMVvTVmrWvEUAUqA', 'xu26', NULL, '2020-01-20 21:37:03', NULL, NULL, 1, '2020-01-20 21:37:03');
INSERT INTO `resource` VALUES (4, 1, 2, '黑马JavaEE 57期', 'https://pan.baidu.com/s/1pL2UZjGrWBkf99or6VhAzg', 'a0bz', NULL, '2020-01-20 21:37:54', NULL, NULL, 1, '2020-01-20 21:37:54');
INSERT INTO `resource` VALUES (5, 1, 2, '跟着360架构师 学习Shell脚本编程', 'https://pan.baidu.com/s/192i1ZuaolS5lKqcEGYd3Ag', 'ez37', NULL, '2020-01-20 22:13:22', NULL, NULL, 1, '2020-01-20 22:13:21');
INSERT INTO `resource` VALUES (6, 1, 2, 'Java工程师面试突击第1季（可能是史上最好的Java面试突击课程）-中华石杉老师', 'https://pan.baidu.com/s/1TXI88omPvPaWawh3i9i6aQ', 'iyrd', NULL, '2020-01-20 22:13:45', NULL, NULL, 1, '2020-01-20 22:13:45');
INSERT INTO `resource` VALUES (7, 1, 2, '百万年薪架构师 001期', 'https://pan.baidu.com/s/1LhkRDYCAYgK956WPjpIkNw', 'ypbl', NULL, '2020-01-20 22:14:04', NULL, NULL, 1, '2020-01-20 22:14:03');
INSERT INTO `resource` VALUES (8, 1, 2, 'Elasticsearch 顶级高手系列课程', 'https://pan.baidu.com/s/1MutAh4vIXnyjjrJWMHyVww', 'cjrn', NULL, '2020-01-20 22:14:33', NULL, NULL, 1, '2020-01-20 22:14:32');
INSERT INTO `resource` VALUES (9, 1, 2, '分布式事务 解决数据一致性', 'https://pan.baidu.com/s/1I9ol7bTs1x9iEvxaOfVhsw', '029b', NULL, '2020-01-20 22:15:01', NULL, NULL, 1, '2020-01-20 22:15:01');
INSERT INTO `resource` VALUES (10, 1, 2, 'SpringBoot2.0不容错过的新特性 WebFlux响应式编程', 'https://pan.baidu.com/s/1fT96TR1AnJLGw_ywE8Gn_A', 'ng06', NULL, '2020-01-20 22:15:20', NULL, NULL, 1, '2020-01-20 22:15:19');
INSERT INTO `resource` VALUES (11, 1, 2, 'SpringCloud广告系统设计与实现(wumi', 'https://pan.baidu.com/s/1rlknUA5LM9mOtdh87e6wJA', 'eze5', NULL, '2020-01-20 22:15:39', NULL, NULL, 1, '2020-01-20 22:15:39');
INSERT INTO `resource` VALUES (12, 1, 2, '2018传智黑马JAVA 49 期', 'https://pan.baidu.com/s/1L2mRC3s71reVEQLqqtphOA', 'wabj', NULL, '2020-01-20 22:15:58', NULL, NULL, 1, '2020-01-20 22:15:57');
INSERT INTO `resource` VALUES (13, 1, 2, '慕课剑指offer', 'https://pan.baidu.com/s/1XZDsu5IeNUdG70MTNEyguA', '53yx', NULL, '2020-01-20 22:16:18', NULL, NULL, 1, '2020-01-20 22:16:17');
INSERT INTO `resource` VALUES (14, 2, 2, '6小时 jQuery开发一个前端应用', 'https://pan.baidu.com/s/1PoFuYj7pnCjiYR02gwDY-A', 'yr0n', NULL, '2020-01-20 22:17:21', NULL, NULL, 1, '2020-01-20 22:17:20');
INSERT INTO `resource` VALUES (15, 1, 2, 'Java并发编程与高并发解决方案(完整无密)', 'https://pan.baidu.com/s/1eakYKTqIHDDs6lHrG6Ysrg', 'fxfl', NULL, '2020-01-20 22:17:45', NULL, NULL, 1, '2020-01-20 22:17:45');
INSERT INTO `resource` VALUES (16, 1, 2, 'Java秒杀系统方案优化 高性能高并发实战', 'https://pan.baidu.com/s/1SqwEK44KiNyDaf7AhQdz3A', 'gy4f', NULL, '2020-01-20 22:18:07', NULL, NULL, 1, '2020-01-20 22:18:07');
INSERT INTO `resource` VALUES (17, 1, 2, 'Python升级3.6 强力Django+杀手级Xadmin打造在线教育平台', 'https://pan.baidu.com/s/1TY6ZGHdgHugdtSRNMfd-TQ', 'ot58', NULL, '2020-01-20 22:18:38', NULL, NULL, 1, '2020-01-20 22:18:38');
INSERT INTO `resource` VALUES (18, 1, 2, '玩转算法面试 leetcode题库分门别类详细解析', 'https://pan.baidu.com/s/1uwFb5M6EOSly17zOcJ1etg', 'q7vm', NULL, '2020-01-20 22:19:10', NULL, NULL, 1, '2020-01-20 22:19:09');
INSERT INTO `resource` VALUES (19, 1, 2, 'Java大牛 带你从0到上线开发企业级电商项目（入门推荐）', 'https://pan.baidu.com/s/14WeP7eRTVrMnlrSi8GChnQ', 'n7ph', NULL, '2020-01-20 22:19:43', NULL, NULL, 1, '2020-01-20 22:19:43');
INSERT INTO `resource` VALUES (20, 2, 2, '前端JavaScript面试技巧', 'https://pan.baidu.com/s/1bMJcvv890XL1M8FQVs0kzg', 'f3kw', NULL, '2020-01-20 22:20:16', NULL, NULL, 1, '2020-01-20 22:20:15');
INSERT INTO `resource` VALUES (21, 1, 2, 'Spring Boot企业微信点餐系统', 'https://pan.baidu.com/s/1h49NwzJKKUMZ2ztIH13IzQ', 'yk9f', NULL, '2020-01-20 22:20:34', NULL, NULL, 1, '2020-01-20 22:20:34');
INSERT INTO `resource` VALUES (22, 1, 2, '企业级刚需Nginx入门，全面掌握Nginx配置+快速搭建高可用架构', 'https://pan.baidu.com/s/1PYVsjyGFFeR-Mmo_6EIFkA', '99tb', NULL, '2020-01-20 22:20:54', NULL, NULL, 1, '2020-01-20 22:20:53');
INSERT INTO `resource` VALUES (23, 1, 2, 'Spring Boot带前后端 渐进式开发企业级博客系统', 'https://pan.baidu.com/s/1OD1hk9WdeOq_EnpICumBhQ', 'cogv', NULL, '2020-01-20 22:21:22', NULL, NULL, 1, '2020-01-20 22:21:21');
INSERT INTO `resource` VALUES (24, 1, 2, 'Java企业级电商项目架构演进之路 Tomcat集群与Redis分布式（入门推荐）', 'https://pan.baidu.com/s/1ukSs6pO8ORHUkIBeSsnBBg', 'wbrq', NULL, '2020-01-20 22:22:04', NULL, NULL, 1, '2020-01-20 22:22:04');
INSERT INTO `resource` VALUES (25, 1, 2, 'Google资深工程师深度讲解Go语言', 'https://pan.baidu.com/s/19EbTdaz4D5g7ioNoVGDDBw', 'r6ta', NULL, '2020-01-20 22:22:27', NULL, NULL, 1, '2020-01-20 22:22:26');
INSERT INTO `resource` VALUES (28, 1, 2, '算法与数据结构---慕课网', 'https://pan.baidu.com/s/1RGGf1GkagUTiKy5kxwatCQ', 'o0ww', NULL, '2020-01-20 22:23:14', NULL, NULL, 1, '2020-01-20 22:23:14');
INSERT INTO `resource` VALUES (29, 1, 2, 'java设计模式精讲 Debug 方式+内存分析', 'https://pan.baidu.com/s/1B5ws9Tw31mmS5xNsv6BCIQ', 'jpl9', NULL, '2020-03-28 09:45:58', NULL, NULL, 1, '2020-03-28 09:45:58');
INSERT INTO `resource` VALUES (30, 1, 2, 'linux运维架构师', 'https://pan.baidu.com/s/1qGQXZaie0gVLqmbHRWlTzA', 'ksfx', NULL, '2020-03-28 09:47:23', NULL, NULL, 1, '2020-03-28 09:47:22');
INSERT INTO `resource` VALUES (31, 1, 2, '学成在线', 'https://pan.baidu.com/s/1uTnNpBgTrDXzRm4AKJjrzg', 's82y', NULL, '2020-03-28 09:49:01', NULL, NULL, 1, '2020-03-28 09:49:01');
INSERT INTO `resource` VALUES (32, 1, 2, '剑指Java面试-Offer直通车', 'https://pan.baidu.com/s/1LY1pNxgDa_6GreKe4FF9rw', '2n5a', NULL, '2020-03-28 09:49:42', NULL, NULL, 1, '2020-03-28 09:49:42');
INSERT INTO `resource` VALUES (33, 1, 2, '咕泡学院公开课', 'https://pan.baidu.com/s/1y17aJh9Lm4ykw1lndRcc_A', 'rwng', NULL, '2020-03-28 09:50:26', NULL, NULL, 1, '2020-03-28 09:50:26');
INSERT INTO `resource` VALUES (34, 3, 2, '尚学堂2018大数据教程', 'https://pan.baidu.com/s/103G8VTCGH5DtedGDxiKSRQ', 'reet', NULL, '2020-03-28 09:50:57', NULL, NULL, 1, '2020-03-28 09:50:57');
INSERT INTO `resource` VALUES (35, 4, 2, '慕课django', 'https://pan.baidu.com/s/1yik2efBrbQ5v_p5o1p1Trw', 'cpu8', NULL, '2020-03-28 09:52:06', NULL, NULL, 1, '2020-03-28 09:52:06');
INSERT INTO `resource` VALUES (36, 1, 2, '高性能可扩展mysql', 'https://pan.baidu.com/s/1BQgKwx4vJE8irMBUF-kmbw', 'gxhe', NULL, '2020-03-28 09:53:02', NULL, NULL, 1, '2020-03-28 09:53:01');
INSERT INTO `resource` VALUES (37, 1, 2, '从天气项目看Spring Cloud微服务治理', 'https://pan.baidu.com/s/1H5_f4J0mzyjLXJAPsPWnDA', 'tgxj', NULL, '2020-03-28 09:53:37', NULL, NULL, 1, '2020-03-28 09:53:36');
INSERT INTO `resource` VALUES (38, 1, 2, 'Java秒杀系统方案优化 高性能高并发实战', 'https://pan.baidu.com/s/1yAynRRPc5APg0XhgL0bxjQ', 'fx3r', NULL, '2020-03-28 09:54:09', NULL, NULL, 1, '2020-03-28 09:54:08');
INSERT INTO `resource` VALUES (39, 1, 2, 'Java Spring技术栈构建完整前后台团购网站', 'https://pan.baidu.com/s/1qVEgoN-Z7gqy6sCO-_jQVg', 'elhv', NULL, '2020-03-28 09:55:38', NULL, NULL, 1, '2020-03-28 09:55:37');
INSERT INTO `resource` VALUES (40, 1, 2, 'Java SSM开发大众点评后端', 'https://pan.baidu.com/s/1H0pvQRAinosunEcMWvDhHw', '0xt2', NULL, '2020-03-28 09:56:00', NULL, NULL, 1, '2020-03-28 09:55:59');
COMMIT;

-- ----------------------------
-- Table structure for resource_comment
-- ----------------------------
DROP TABLE IF EXISTS `resource_comment`;
CREATE TABLE `resource_comment` (
                                    `resource_id` int(11) NOT NULL,
                                    `comment_id` int(11) NOT NULL,
                                    PRIMARY KEY (`resource_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of resource_comment
-- ----------------------------
BEGIN;
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
