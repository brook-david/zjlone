/*
Navicat MySQL Data Transfer

Source Server         : 120.26.49.186
Source Server Version : 50173
Source Host           : 120.26.49.186:3306
Source Database       : witspal

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2017-08-21 09:49:16
*/


-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
`MENU_ID`  varchar(32) NOT NULL ,
`FID`  varchar(32) NULL DEFAULT NULL ,
`MENU_NAME`  varchar(32) NULL DEFAULT NULL ,
`PATH`  varchar(64) NULL DEFAULT NULL ,
`ORDERNUM`  int(11) NULL DEFAULT NULL ,
PRIMARY KEY (`MENU_ID`)
)



;

-- ----------------------------
-- Records of menu
-- ----------------------------



-- ----------------------------
-- Table structure for `permissions`
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions` (
`id`  varchar(32) NOT NULL  ,
`permission`  varchar(45) NOT NULL ,
`description`  varchar(255) NULL DEFAULT NULL ,
`create_time`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ,
PRIMARY KEY (`id`)
)


;

-- ----------------------------
-- Records of permissions
-- ----------------------------

INSERT INTO `permissions` VALUES ('1', 'editUser', null, '2014-02-26 17:50:14'), ('2', 'showUser', null, '2014-02-26 17:50:26'), ('3', 'addUser', null, '2014-02-26 17:50:37'), ('4', 'deleteUser', null, '2014-02-26 17:51:11');


-- ----------------------------
-- Table structure for `roles`
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
`id`  varchar(32) NOT NULL  ,
`role_name`  varchar(45) NOT NULL ,
`description`  varchar(255) NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)


;

-- ----------------------------
-- Records of roles
-- ----------------------------

INSERT INTO `roles` VALUES ('1', 'admin', 'admin user'), ('2', 'user', 'user');


-- ----------------------------
-- Table structure for `roles_permissions`
-- ----------------------------
DROP TABLE IF EXISTS `roles_permissions`;
CREATE TABLE `roles_permissions` (
`role_id`  varchar(32) NOT NULL ,
`permission_id`  varchar(32) NOT NULL ,
`create_time`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ,
PRIMARY KEY (`role_id`, `permission_id`),
FOREIGN KEY (`permission_id`) REFERENCES `permissions` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)



;

-- ----------------------------
-- Records of roles_permissions
-- ----------------------------

INSERT INTO `roles_permissions` VALUES ('1', '1', '2014-02-26 17:52:23'), ('1', '2', '2014-02-26 17:52:30'), ('1', '3', '2014-02-26 17:52:38'), ('1', '4', '2014-02-26 17:52:44'), ('2', '2', '2014-02-26 17:52:51');


-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
`id` varchar(32) NOT NULL ,
`username`  varchar(255) NOT NULL ,
`password`  varchar(255) NULL DEFAULT NULL ,
`status`  tinyint(4) NOT NULL DEFAULT 0 ,
`create_time`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ,
PRIMARY KEY (`id`)
)


;

-- ----------------------------
-- Records of users
-- ----------------------------

INSERT INTO `users` VALUES ('1', 'xiaoming', 'xiaoming', '1', '2014-02-26 17:44:21'), ('2', 'xiaohong', 'xiaohong', '1', '2014-02-26 17:44:45'), ('3', 'xiaohuang', 'xiaohuang', '1', '2014-02-26 23:31:20');



-- ----------------------------
-- Table structure for `user_roles`
-- ----------------------------
DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE `user_roles` (
`user_id`  varchar(32) NOT NULL ,
`role_id`  varchar(32) NOT NULL ,
`create_time`  timestamp NULL DEFAULT CURRENT_TIMESTAMP ,
PRIMARY KEY (`user_id`, `role_id`),
FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)



;

-- ----------------------------
-- Records of user_roles
-- ----------------------------

INSERT INTO `user_roles` VALUES ('1', '1', '2014-02-26 17:51:56'), ('1', '2', '2014-02-26 20:46:55'), ('2', '2', '2014-02-26 17:52:00'), ('3', '1', '2014-02-26 23:34:06');

