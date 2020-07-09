/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : bookshop

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 09/07/2020 16:21:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book_info
-- ----------------------------
DROP TABLE IF EXISTS `book_info`;
CREATE TABLE `book_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookname` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  `price` decimal(5, 2) DEFAULT NULL,
  `stock` int(10) DEFAULT NULL,
  `author` varchar(200) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  `category` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 57 CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of book_info
-- ----------------------------
INSERT INTO `book_info` VALUES (1, '太阳从西边出来', 39.00, 100, '王志气', '文学经典');
INSERT INTO `book_info` VALUES (2, '天工开物', 76.00, 107, '尚刚', '文学经典');
INSERT INTO `book_info` VALUES (3, '钟鼓楼', 25.00, 119, '刘心武', '文艺小说');
INSERT INTO `book_info` VALUES (4, '荷花鲤鱼', 56.00, 132, '路雨年', '文学经典');
INSERT INTO `book_info` VALUES (5, '世说新语', 56.00, 153, '蒋凡', '文学经典');
INSERT INTO `book_info` VALUES (6, '科学', 30.00, 120, '教育部', '科技杂志');
INSERT INTO `book_info` VALUES (7, '孝经', 56.00, 126, '孔丘', '文学经典');
INSERT INTO `book_info` VALUES (8, '四世同堂', 56.00, 118, '老舍', '文学经典');
INSERT INTO `book_info` VALUES (9, '狂人日记', 65.00, 201, '鲁迅', '文艺小说');
INSERT INTO `book_info` VALUES (10, '西游记', 36.00, 100, '吴承恩', '文学经典');
INSERT INTO `book_info` VALUES (11, '骆驼祥子', 82.00, 222, '老舍', '文艺小说');
INSERT INTO `book_info` VALUES (12, '中国科学技术史', 50.60, 852, '李约翰', '科技杂志');
INSERT INTO `book_info` VALUES (13, ' 影像中的教育学', 60.00, 160, '陈大伟', '成功励志');
INSERT INTO `book_info` VALUES (14, '子夜', 50.00, 200, '茅盾', '文艺小说');
INSERT INTO `book_info` VALUES (15, '三毛传', 56.00, 110, '余文', '文学经典');
INSERT INTO `book_info` VALUES (16, '枸杞 优质丰产栽培', 69.80, 560, '简在友', '农林医学');
INSERT INTO `book_info` VALUES (17, '林海雪原', 45.00, 120, '曲波', '文艺小说');
INSERT INTO `book_info` VALUES (18, '黑客攻防', 80.00, 170, '恒盛杰资讯', '计算机类');
INSERT INTO `book_info` VALUES (19, '材料科学基础', 32.50, 852, '石德珂', '科技杂志');
INSERT INTO `book_info` VALUES (20, '窗边的小豆豆', 50.00, 100, '黑柳彻子', '文学经典');
INSERT INTO `book_info` VALUES (21, '古玩行捡漏笔记', 50.00, 100, '张志岭', '成功励志');
INSERT INTO `book_info` VALUES (22, '中药学', 25.80, 1000, '次一谈', '农林医学');
INSERT INTO `book_info` VALUES (23, '梵高', 90.00, 155, '玲珑', '文学经典');
INSERT INTO `book_info` VALUES (25, '我是猫', 61.00, 160, '夏日漱石', '外文天地');
INSERT INTO `book_info` VALUES (26, '实用理疗技术手册', 50.00, 256, '郭新娜', '农林医学');
INSERT INTO `book_info` VALUES (27, '红楼梦里人', 60.00, 110, '亦舒', '文艺小说');
INSERT INTO `book_info` VALUES (28, '微型计算机及接口技术', 46.50, 158, '刘乐善、陈进才', '计算机类');
INSERT INTO `book_info` VALUES (29, '努力到无能为力，拼搏到感动自己', 120.00, 1000, '陶君豪', '成功励志');
INSERT INTO `book_info` VALUES (30, '中国民间美术造型', 35.00, 100, '左汉中', '文学经典');
INSERT INTO `book_info` VALUES (31, '雷达维修理论与实践', 45.00, 120, '康健、唐小明 ', '科技杂志');
INSERT INTO `book_info` VALUES (34, '钢琴艺术', 60.00, 135, '高晓光', '文艺小说');
INSERT INTO `book_info` VALUES (35, '遇事最有水平的处理方法', 50.00, 200, '南小乐', '成功励志');
INSERT INTO `book_info` VALUES (36, '朱自清散文精选', 45.00, 124, '朱自清', '文学经典');
INSERT INTO `book_info` VALUES (37, '通俗《资本论》', 52.60, 563, '洪远明', '科技杂志');
INSERT INTO `book_info` VALUES (38, '写给孩子的世界地理', 60.00, 160, '维吉尔西尔耶 ', '外文天地');
INSERT INTO `book_info` VALUES (39, '中华上下五千年 ', 45.00, 100, '墨人', '文学经典');
INSERT INTO `book_info` VALUES (40, '针灸医疗险', 16.80, 596, '杨长森', '农林医学');
INSERT INTO `book_info` VALUES (41, '图说只会城市', 65.00, 123, '蓝荣钦 王海波', '科技杂志');
INSERT INTO `book_info` VALUES (42, '本草纲目', 63.00, 500, '李时珍', '农林医学');
INSERT INTO `book_info` VALUES (43, '实用心脏病学', 20.60, 596, '程银珠', '农林医学');
INSERT INTO `book_info` VALUES (44, '三十六计', 35.00, 100, '黄甫林', '文艺经典');
INSERT INTO `book_info` VALUES (45, '瓦尔登湖', 80.00, 200, '梭罗', '外文天地');
INSERT INTO `book_info` VALUES (46, '深度学习', 60.00, 145, '高志强', '计算机类');
INSERT INTO `book_info` VALUES (47, 'Born A Crime', 25.00, 596, 'Trevor Noah ', '外文天地');
INSERT INTO `book_info` VALUES (48, '千金方', 65.00, 185, '孙思邈', '文学经典');
INSERT INTO `book_info` VALUES (49, 'Word Power Made Easy', 31.50, 896, 'Norman Lewis', '外文天地');
INSERT INTO `book_info` VALUES (50, '生活美学与当代艺术', 43.00, 135, '刘悦迪 ', '文艺小说');
INSERT INTO `book_info` VALUES (51, 'Big Egg', 36.90, 960, 'Molly Coxe', '外文天地');
INSERT INTO `book_info` VALUES (52, 'Grimm\'s Fairy Tales', 30.00, 100, 'Jacob Grimm', '外文天地');
INSERT INTO `book_info` VALUES (53, 'Essential English Grammar', 53.52, 101, 'Philip Gucker', '外文天地');
INSERT INTO `book_info` VALUES (54, '木雕图案', 50.00, 140, '马慕良 ', '文艺小说');
INSERT INTO `book_info` VALUES (55, '侯大利刑侦笔记2：辨骨寻凶', 63.00, 100, '小桥老树', '文艺小说');
INSERT INTO `book_info` VALUES (56, '爱在山野', 60.00, 162, '刘尧平', '文艺小说');

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` int(11) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `booId` int(11) DEFAULT NULL,
  `receivingAddress` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  `bookNum` int(10) DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  `totalprince` decimal(10, 2) DEFAULT NULL,
  `receiver` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  `bookname` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `pk1`(`userId`) USING BTREE,
  INDEX `pk2`(`booId`) USING BTREE,
  CONSTRAINT `pk1` FOREIGN KEY (`userId`) REFERENCES `user_info` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `pk2` FOREIGN KEY (`booId`) REFERENCES `book_info` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES (00000000001, 12, 2, '11', 1, '123456', 76.00, '杨坤磊', '....');
INSERT INTO `t_order` VALUES (00000000002, 12, 3, '1236', 1, '123456', 25.00, '杨坤磊', '...');
INSERT INTO `t_order` VALUES (00000000003, 12, 5, '36\r\n', 1, '123456', 56.00, '杨坤磊', '...');
INSERT INTO `t_order` VALUES (00000000004, 12, 5, '安徽新华学院', 1, '123456', 56.00, '杨坤磊', '世说新语');
INSERT INTO `t_order` VALUES (00000000005, 12, 8, '安徽新华学院', 2, '123456', 112.00, '杨坤磊', '四世同堂');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  `sex` varchar(4) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET gbk COLLATE gbk_chinese_ci DEFAULT NULL,
  `blance` decimal(10, 2) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES (12, '169@qq.com', '4QrcOUm6Wau+VuBX8g+IPg==', '杨坤磊', '男', '123456', 9599.00);
INSERT INTO `user_info` VALUES (13, '168@qq.com', '4QrcOUm6Wau+VuBX8g+IPg==', '杨坤', '男', '1730963475', 100.00);

SET FOREIGN_KEY_CHECKS = 1;
