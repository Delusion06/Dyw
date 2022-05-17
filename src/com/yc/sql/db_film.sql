/*
 Navicat Premium Data Transfer

 Source Server         : 120.26.177.155_3306
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : 120.26.177.155:3306
 Source Schema         : db_film

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 21/12/2020 22:34:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_admin
-- ----------------------------
DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin`  (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `aname` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `apwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`aid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_admin
-- ----------------------------
INSERT INTO `tb_admin` VALUES (1, 'lydia', 'a');
INSERT INTO `tb_admin` VALUES (2, 'yc', 'a');

-- ----------------------------
-- Table structure for tb_film
-- ----------------------------
DROP TABLE IF EXISTS `tb_film`;
CREATE TABLE `tb_film`  (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `ftype` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `fyear` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `flength` int(11) NULL DEFAULT NULL,
  `fdate` date NULL DEFAULT NULL,
  `director` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `actors` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `fdis` text CHARACTER SET utf8 COLLATE utf8_bin NULL,
  `farea` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `fimage` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_film
-- ----------------------------
INSERT INTO `tb_film` VALUES (29, '唐人街探案3', '喜剧、推理', '2020-1-1', 136, '2020-10-04', '陈思诚', '王宝强|刘昊然|张子枫|妻夫木聪|托尼贾|长泽雅美|染谷将太|铃木保奈美', '该片讲述了“曼谷夺金杀人案”“纽约五行连环杀人案”后，“唐人街神探组合”唐仁，秦风被野田昊请到东京，调查一桩离奇的谋杀案的故事', '中国大陆', 'film_images/trj.jpg');
INSERT INTO `tb_film` VALUES (30, '夺冠', '体育、运动、剧情', '2020', 135, '2020-09-25', '陈可辛', '巩俐|黄渤|吴刚|彭昱畅|白浪|中国女子排球队', '1981年大阪世界杯决赛，中国队对战日本队，赢得了中国三大球第一个世界冠军，宋世雄那铿锵有力、极具辨识度的解说，一下子将观众带回了那个激情澎湃、阳光普照的年代。2008年北京奥运会小组赛，中国队对战当时主教练是郎平（巩俐饰）的美国队，中国队教练（黄渤饰）站在场边，全神贯注，面带笑容。郎平和那一代中国女排在那一刻所经历过的挣扎，令人心疼。2013年，郎平正式再次挂帅执教中国女排，带领着中国女排开启了新的历史阶段。2016年里约奥运会四分之一淘汰赛，中国队对战东道主世界排名第一的巴西队，最终获得了奥运会的金牌', '中国、中国香港', 'film_images/dg.jpg');
INSERT INTO `tb_film` VALUES (31, '熊出没·狂野大陆', '喜剧，科幻', '2020', 100, '2020-10-02', '丁亮', '张伟(配)|张秉君(配)|谭笑(配)|刘沛(配)|周子瑜(配)|朱光祖(配)|贾晨露(配)', '该片讲述穷苦光头强为百万奖金参加能变身成动物的“狂野大陆”主题乐园，不料却发现了一个惊天大阴谋的故事', '中国大陆', 'film_images/xcm.jpg');
INSERT INTO `tb_film` VALUES (32, '荞麦疯长', '爱情、剧情', '2020-8-25', 105, '2020-08-25', '徐展雄', '马思纯|钟楚曦|黄景瑜', '该片讲述了上世纪90年代，初入社会的两个女孩和一个男孩，在追求新生活的过程中所经历的不可思议的命运考验', '中国大陆', 'film_images/qmfz.jpg');
INSERT INTO `tb_film` VALUES (33, '山海经之小人国', '冒险，科幻', '2020-1-11', 105, '2020-01-11', '吕建民，张大星', '奥博特|克里斯蒂安.坎普|克劳迪略.卡斯特为利担任', '影片讲述了周饶小人国的王子锤木，意外之中闯下大祸，导致父亲变成石像，一路经历冒险，重新拯救了父亲和王国的故事。\n', '中国大陆', 'film_images/shj.jpg');
INSERT INTO `tb_film` VALUES (34, '鬼领路之闺蜜心窍', '爱情，悬疑，惊悚', '2020-9-4', 135, '2020-09-04', '洪斗贤', '金晨|姜潮|朱璇|王美人|杨丹|邱林|段小环|冯建克', '影片讲述了在遭遇一次意外后，一起出游的闺蜜突然死亡，由金晨饰演的宋婉嵚应其他闺蜜们之邀荒野出游，却意外遭遇“鬼领路”，鬼使神差地进入一幢处于墓地群之中的荒宅中，这里怨气丛生，他们之间的身份也发生了诡异的变化，恐怖事件随之而来\n', '中国大陆', 'film_images/gmxq.jpg');
INSERT INTO `tb_film` VALUES (35, '刻在心底的名字', '剧情 / 同性', '2020-03-14', 136, '2020-09-30', '柳广辉', '陈昊森 |曾敬骅 |邵奕玫 |戴立忍 | 王识贤 ', '影片讲述上世纪90年代初，两位少年前往台北，那里的一切冲击着这两个少年的感官。学校宿舍里发生了对同性恋的霸凌，尽管禁忌一一解放，学校也开始招收女生，但同性恋三个字仍如毒蛇猛兽人人唾弃。而两个男孩间原本暧昧的情愫，也因一个女孩的介入，而就此被打乱。', '中国台湾', 'film_images/kzxddmz.jpg');

-- ----------------------------
-- Table structure for tb_links
-- ----------------------------
DROP TABLE IF EXISTS `tb_links`;
CREATE TABLE `tb_links`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `href` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_links
-- ----------------------------
INSERT INTO `tb_links` VALUES (1, 'http://www.hao6v.com', '6v电影下载网');
INSERT INTO `tb_links` VALUES (2, 'http://www.dygang.net', '电影港');
INSERT INTO `tb_links` VALUES (3, 'http://www.dygang.net/bd/', '高清电影下载');
INSERT INTO `tb_links` VALUES (4, 'http://www.dygang.net/ys/', '最新电影');
INSERT INTO `tb_links` VALUES (5, 'http://www.dygang.net/dsj/', '电视剧下载');
INSERT INTO `tb_links` VALUES (6, 'http://www.dygang.net/', '迅雷电影下载');
INSERT INTO `tb_links` VALUES (7, 'http://www.baidu.com', '百度baidu');
INSERT INTO `tb_links` VALUES (8, 'http://www.66e.cc', '66影视');
INSERT INTO `tb_links` VALUES (9, 'http://www.6vhao.net', '6v电影');
INSERT INTO `tb_links` VALUES (10, 'http://www.mianbao.com', '面包网');
INSERT INTO `tb_links` VALUES (11, 'http://www.piaohua.com', '飘花电影');
INSERT INTO `tb_links` VALUES (12, 'http://www.omanhua.com/', '斗罗大陆漫画');

-- ----------------------------
-- Table structure for tb_msg
-- ----------------------------
DROP TABLE IF EXISTS `tb_msg`;
CREATE TABLE `tb_msg`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fid` int(11) NOT NULL COMMENT '电影id',
  `uname` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户名',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '留言内容',
  `createTime` timestamp(0) NULL DEFAULT NULL COMMENT '留言时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fid`(`fid`) USING BTREE,
  CONSTRAINT `fid` FOREIGN KEY (`fid`) REFERENCES `tb_film` (`fid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_msg
-- ----------------------------
INSERT INTO `tb_msg` VALUES (19, 34, '李四&&lisi@qq.com', '哈哈哈哈哈', '2020-12-21 10:48:01');
INSERT INTO `tb_msg` VALUES (20, 33, '小文&&xiaowen@qq.com', '谢谢共享', '2020-12-21 10:48:57');
INSERT INTO `tb_msg` VALUES (26, 35, '张三&&139@qq.com', '很卡顿', '2020-12-21 14:25:13');
INSERT INTO `tb_msg` VALUES (27, 35, '李四&&139@qq.com', '不太美观', '2020-12-21 14:25:34');
INSERT INTO `tb_msg` VALUES (28, 35, '李四&&139@qq.com', '不太美观', '2020-12-21 14:26:19');
INSERT INTO `tb_msg` VALUES (29, 35, '王五&&1395382937@qq.com', '整挺好', '2020-12-21 14:26:54');
INSERT INTO `tb_msg` VALUES (30, 35, '小花&&1395382937@qq.com', '11', '2020-12-21 14:28:10');

-- ----------------------------
-- Table structure for tb_reply
-- ----------------------------
DROP TABLE IF EXISTS `tb_reply`;
CREATE TABLE `tb_reply`  (
  `rid` int(10) NOT NULL AUTO_INCREMENT,
  `id` int(11) NULL DEFAULT NULL,
  `replyTime` timestamp(0) NULL DEFAULT NULL,
  `replyContent` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`rid`) USING BTREE,
  INDEX `id`(`id`) USING BTREE,
  CONSTRAINT `id` FOREIGN KEY (`id`) REFERENCES `tb_msg` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_reply
-- ----------------------------
INSERT INTO `tb_reply` VALUES (22, 27, '2020-12-21 14:47:38', '后期会改进的');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `upwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `state` int(11) NULL DEFAULT NULL,
  `message` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '留言',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, '张三', '1395382937@qq.com', 'a', 1, NULL);
INSERT INTO `tb_user` VALUES (2, '张三', 'zhangsan@qq.com', '123', 1, NULL);
INSERT INTO `tb_user` VALUES (3, '李四', 'lisi@qq.com', '12', 1, NULL);
INSERT INTO `tb_user` VALUES (4, 'wangwu', 'wangwu@qq.com', '124', 1, 'hello');
INSERT INTO `tb_user` VALUES (5, 'zhangsan', 'zhangsan@qq.com', '123', 1, 'nihao');
INSERT INTO `tb_user` VALUES (6, 'fanfei', 'fanfei@qq.com', 'aaa', 1, '1111');
INSERT INTO `tb_user` VALUES (8, '王五', '123@qq.com', '1', 1, 'aaaa');
INSERT INTO `tb_user` VALUES (9, 'aihua', '111@qq.com', '', 1, 'aaa');
INSERT INTO `tb_user` VALUES (10, 'hua', '133@qq.com', '', 1, '111');
INSERT INTO `tb_user` VALUES (11, 'meimei', '111111@qq.com', '111', 1, NULL);
INSERT INTO `tb_user` VALUES (12, '范飞', '1424314249@qq.com', '12', 1, NULL);

SET FOREIGN_KEY_CHECKS = 1;
