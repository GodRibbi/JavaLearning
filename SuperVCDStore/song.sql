/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 80021
Source Host           : localhost:3306
Source Database       : zrq

Target Server Type    : MYSQL
Target Server Version : 80021
File Encoding         : 65001

Date: 2020-10-30 18:43:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for song
-- ----------------------------
DROP TABLE IF EXISTS `song`;
CREATE TABLE `song` (
  `songid` bigint NOT NULL AUTO_INCREMENT,
  `albumid` int DEFAULT NULL,
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `long` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`songid`)
) ENGINE=InnoDB AUTO_INCREMENT=211 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of song
-- ----------------------------
INSERT INTO `song` VALUES ('1', '1', '披着羊皮的狼', '07:28');
INSERT INTO `song` VALUES ('2', '1', '美丽的草原我的家', '05:33');
INSERT INTO `song` VALUES ('3', '1', '雁南飞', '04:59');
INSERT INTO `song` VALUES ('4', '1', '吐鲁番的葡萄熟了', '05:06');
INSERT INTO `song` VALUES ('5', '1', '还念战友', '05:05');
INSERT INTO `song` VALUES ('6', '1', '花儿为什么这样红', '04:06');
INSERT INTO `song` VALUES ('7', '1', '祝酒歌', '04:06');
INSERT INTO `song` VALUES ('8', '1', '驼铃', '04:43');
INSERT INTO `song` VALUES ('9', '1', '新疆好', '04:35');
INSERT INTO `song` VALUES ('10', '1', '阿瓦尔古丽', '03:48');
INSERT INTO `song` VALUES ('11', '1', '敖包相会', '04:29');
INSERT INTO `song` VALUES ('12', '1', '草原之夜', '04:21');
INSERT INTO `song` VALUES ('13', '2', '月下待杜鹃不来', '03:40');
INSERT INTO `song` VALUES ('14', '2', '天之大', '04:57');
INSERT INTO `song` VALUES ('15', '2', '屋檐下的思念', '04:34');
INSERT INTO `song` VALUES ('16', '2', '就是你可是你', '04:32');
INSERT INTO `song` VALUES ('17', '2', '真的好想你', '04:55');
INSERT INTO `song` VALUES ('18', '2', '涛声依旧', '04:39');
INSERT INTO `song` VALUES ('19', '2', '弯弯的月亮', '05:16');
INSERT INTO `song` VALUES ('20', '2', '爱是一个圆', '03:58');
INSERT INTO `song` VALUES ('21', '2', '昨夜小楼又东风', '04:05');
INSERT INTO `song` VALUES ('22', '2', '一剪梅', '03:55');
INSERT INTO `song` VALUES ('23', '3', '精忠报国', '03:34');
INSERT INTO `song` VALUES ('24', '3', '孔雀东南飞', '04:24');
INSERT INTO `song` VALUES ('25', '3', '中国功夫', '04:05');
INSERT INTO `song` VALUES ('26', '3', '江山无限', '03:33');
INSERT INTO `song` VALUES ('27', '3', '爸爸', '04:15');
INSERT INTO `song` VALUES ('28', '3', '战士歌唱东方红', '04:04');
INSERT INTO `song` VALUES ('29', '3', '藏龙卧虎', '04:39');
INSERT INTO `song` VALUES ('30', '3', '世间男人', '04:43');
INSERT INTO `song` VALUES ('31', '3', '守太平', '04:08');
INSERT INTO `song` VALUES ('32', '3', '爱人', '04:07');
INSERT INTO `song` VALUES ('33', '3', '霸王别姬', '06:34');
INSERT INTO `song` VALUES ('34', '4', '牵心', '05:19');
INSERT INTO `song` VALUES ('35', '4', '梦里潮汐', '03:57');
INSERT INTO `song` VALUES ('36', '4', '换个心情', '02:55');
INSERT INTO `song` VALUES ('37', '4', '三心二意', '04:37');
INSERT INTO `song` VALUES ('38', '4', '错过', '04:10');
INSERT INTO `song` VALUES ('39', '4', '轻轻走近你', '03:11');
INSERT INTO `song` VALUES ('40', '4', '让你幸福在每一天', '04:57');
INSERT INTO `song` VALUES ('41', '4', '海无边际', '04:47');
INSERT INTO `song` VALUES ('42', '4', '望乡', '03:58');
INSERT INTO `song` VALUES ('43', '5', 'Sixology', '00:41');
INSERT INTO `song` VALUES ('44', '5', '不潮不用花钱', '03:53');
INSERT INTO `song` VALUES ('45', '5', '小酒窝', '03:38');
INSERT INTO `song` VALUES ('46', '5', '黑武士', '03:39');
INSERT INTO `song` VALUES ('47', '5', '醉赤壁', '04:41');
INSERT INTO `song` VALUES ('48', '5', '由你选择', '03:53');
INSERT INTO `song` VALUES ('49', '5', 'Always Online', '03:45');
INSERT INTO `song` VALUES ('50', '5', '街道', '04:02');
INSERT INTO `song` VALUES ('51', '5', '主角', '03:32');
INSERT INTO `song` VALUES ('52', '5', '我还想她', '04:07');
INSERT INTO `song` VALUES ('53', '5', '点一把火炬', '04:13');
INSERT INTO `song` VALUES ('54', '5', '期待爱', '03:54');
INSERT INTO `song` VALUES ('55', '5', 'Cries In A Distance', '03:45');
INSERT INTO `song` VALUES ('56', '5', '希望与爱', '03:43');
INSERT INTO `song` VALUES ('57', '6', 'Intro', '00:59');
INSERT INTO `song` VALUES ('58', '6', '逆光', '04:54');
INSERT INTO `song` VALUES ('59', '6', '梦游', '03:08');
INSERT INTO `song` VALUES ('60', '6', '咕叽咕叽', '04:32');
INSERT INTO `song` VALUES ('61', '6', '我怀念的', '04:49');
INSERT INTO `song` VALUES ('62', '6', '安宁', '03:18');
INSERT INTO `song` VALUES ('63', '6', '飘着', '04:09');
INSERT INTO `song` VALUES ('64', '6', '爱情的花样', '03:43');
INSERT INTO `song` VALUES ('65', '6', '旋涡', '04:51');
INSERT INTO `song` VALUES ('66', '6', '需要你', '04:08');
INSERT INTO `song` VALUES ('67', '6', '关于', '03:57');
INSERT INTO `song` VALUES ('68', '6', 'Outro', '00:56');
INSERT INTO `song` VALUES ('69', '7', '达尔文2', '03:39');
INSERT INTO `song` VALUES ('70', '7', 'Goodbye&Hello', '03:40');
INSERT INTO `song` VALUES ('71', '7', '当你离开的时候', '03:57');
INSERT INTO `song` VALUES ('72', '7', '空白格', '04:12');
INSERT INTO `song` VALUES ('73', '7', '越来越不懂', '04:09');
INSERT INTO `song` VALUES ('74', '7', 'It\'s True', '04:24');
INSERT INTO `song` VALUES ('75', '7', '如果你爱我', '03:50');
INSERT INTO `song` VALUES ('76', '7', '化学实验', '04:14');
INSERT INTO `song` VALUES ('77', '7', '晨间新闻', '03:50');
INSERT INTO `song` VALUES ('78', '7', '走过的路', '04:32');
INSERT INTO `song` VALUES ('79', '7', '达尔文', '04:25');
INSERT INTO `song` VALUES ('80', '8', '他一定很爱你', '03:34');
INSERT INTO `song` VALUES ('81', '8', '天黑', '04:22');
INSERT INTO `song` VALUES ('82', '8', '天天看到你', '03:56');
INSERT INTO `song` VALUES ('83', '8', '一个人住', '04:21');
INSERT INTO `song` VALUES ('84', '8', 'Andy', '05:15');
INSERT INTO `song` VALUES ('85', '8', '撕夜', '04:38');
INSERT INTO `song` VALUES ('86', '8', '无法阻挡', '04:11');
INSERT INTO `song` VALUES ('87', '8', '你很好', '03:31');
INSERT INTO `song` VALUES ('88', '8', '离别', '03:50');
INSERT INTO `song` VALUES ('89', '9', 'Right Here Waiting', '04:10');
INSERT INTO `song` VALUES ('90', '9', 'My Love', '03:53');
INSERT INTO `song` VALUES ('91', '9', 'What Makes a Man', '03:52');
INSERT INTO `song` VALUES ('92', '9', 'I Lay My Love on You', '03:28');
INSERT INTO `song` VALUES ('93', '9', 'Against All Odds', '03:20');
INSERT INTO `song` VALUES ('94', '9', 'When You\'re Looking Like That', '03:52');
INSERT INTO `song` VALUES ('95', '9', 'Close', '04:04');
INSERT INTO `song` VALUES ('96', '9', 'Somebody Needs You', '03:07');
INSERT INTO `song` VALUES ('97', '9', 'Angels Wings', '04:02');
INSERT INTO `song` VALUES ('98', '9', 'Soledad', '03:57');
INSERT INTO `song` VALUES ('99', '9', 'Puzzle of My Heart', '03:39');
INSERT INTO `song` VALUES ('100', '9', 'Dreams Come True', '03:08');
INSERT INTO `song` VALUES ('101', '9', 'No Place That Far', '03:12');
INSERT INTO `song` VALUES ('102', '9', 'You Make Me Feel', '03:38');
INSERT INTO `song` VALUES ('103', '9', 'Loneliness Knows Me By Name', '03:02');
INSERT INTO `song` VALUES ('104', '9', 'Fragile Heart', '02:59');
INSERT INTO `song` VALUES ('105', '9', 'Every Little Thing You Do', '04:07');
INSERT INTO `song` VALUES ('106', '9', 'Uptown Girl', '03:06');
INSERT INTO `song` VALUES ('107', '9', 'I Have a Dream', '04:13');
INSERT INTO `song` VALUES ('108', '9', 'My Girl', '02:54');
INSERT INTO `song` VALUES ('109', '10', 'Eraser', '03:47');
INSERT INTO `song` VALUES ('110', '10', 'Castle on the Hill', '04:21');
INSERT INTO `song` VALUES ('111', '10', 'Dive', '03:58');
INSERT INTO `song` VALUES ('112', '10', 'Shape of You', '03:53');
INSERT INTO `song` VALUES ('113', '10', 'Perfect', '04:23');
INSERT INTO `song` VALUES ('114', '10', 'Galway Girl', '02:50');
INSERT INTO `song` VALUES ('115', '10', 'Happier', '03:27');
INSERT INTO `song` VALUES ('116', '10', 'New Man', '03:09');
INSERT INTO `song` VALUES ('117', '10', 'Hearts Don\'t Break Around Here', '04:08');
INSERT INTO `song` VALUES ('118', '10', 'What Do I Know?', '03:57');
INSERT INTO `song` VALUES ('119', '10', 'How Would You Feel', '04:40');
INSERT INTO `song` VALUES ('120', '10', 'Supermarket Flowers', '03:41');
INSERT INTO `song` VALUES ('121', '10', 'Barcelona', '03:11');
INSERT INTO `song` VALUES ('122', '10', 'Bibia Be Ye Ye', '02:56');
INSERT INTO `song` VALUES ('123', '10', 'Nancy Mulligan', '02:59');
INSERT INTO `song` VALUES ('124', '10', 'Save Myself', '04:07');
INSERT INTO `song` VALUES ('125', '11', 'Jump Then Fall', '03:58');
INSERT INTO `song` VALUES ('126', '11', 'Untouchable', '05:12');
INSERT INTO `song` VALUES ('127', '11', 'Forever & Always', '04:28');
INSERT INTO `song` VALUES ('128', '11', 'Come In With the Rain', '03:58');
INSERT INTO `song` VALUES ('129', '11', 'SuperStar', '04:22');
INSERT INTO `song` VALUES ('130', '11', 'The Other Side of the Door', '03:58');
INSERT INTO `song` VALUES ('131', '11', 'Fearless', '04:02');
INSERT INTO `song` VALUES ('132', '11', 'Fifteen', '04:55');
INSERT INTO `song` VALUES ('133', '11', 'Love Story', '03:56');
INSERT INTO `song` VALUES ('134', '11', 'Hey Stephen', '04:16');
INSERT INTO `song` VALUES ('135', '11', 'White Horse', '03:55');
INSERT INTO `song` VALUES ('136', '11', 'You Belong With Me', '03:52');
INSERT INTO `song` VALUES ('137', '11', 'Breathe', '04:24');
INSERT INTO `song` VALUES ('138', '11', 'Tell Me Why', '03:21');
INSERT INTO `song` VALUES ('139', '11', 'You\'re Not Sorry', '04:23');
INSERT INTO `song` VALUES ('140', '11', 'The Way I Loved You', '04:05');
INSERT INTO `song` VALUES ('141', '11', 'The Best Day', '04:05');
INSERT INTO `song` VALUES ('142', '11', 'Change', '04:41');
INSERT INTO `song` VALUES ('143', '11', 'Our Song', '03:21');
INSERT INTO `song` VALUES ('144', '11', 'Teardrops On My Guitar', '03:14');
INSERT INTO `song` VALUES ('145', '11', 'Should\'ve Said No', '04:05');
INSERT INTO `song` VALUES ('146', '12', 'Mark My Words', '02:14');
INSERT INTO `song` VALUES ('147', '12', 'I\'ll Show You', '03:19');
INSERT INTO `song` VALUES ('148', '12', 'What Do You Mean?', '03:25');
INSERT INTO `song` VALUES ('149', '12', 'Sorry', '03:20');
INSERT INTO `song` VALUES ('150', '12', 'Love Yourself', '03:53');
INSERT INTO `song` VALUES ('151', '12', 'Company', '03:28');
INSERT INTO `song` VALUES ('152', '12', 'No Pressure', '04:46');
INSERT INTO `song` VALUES ('153', '12', 'No Sense', '04:35');
INSERT INTO `song` VALUES ('154', '12', 'The Feeling', '04:04');
INSERT INTO `song` VALUES ('155', '12', 'Life Is Worth Living', '03:54');
INSERT INTO `song` VALUES ('156', '12', 'Where Are U Now', '04:02');
INSERT INTO `song` VALUES ('157', '12', 'Chidren', '03:43');
INSERT INTO `song` VALUES ('158', '12', 'Purpose', '03:30');
INSERT INTO `song` VALUES ('159', '12', 'Been You', '03:19');
INSERT INTO `song` VALUES ('160', '12', 'Get Used To It', '03:58');
INSERT INTO `song` VALUES ('161', '12', 'We Are', '03:23');
INSERT INTO `song` VALUES ('162', '12', 'Trust', '03:23');
INSERT INTO `song` VALUES ('163', '12', 'All In It', '03:51');
INSERT INTO `song` VALUES ('164', '12', 'Hit the Ground', '03:48');
INSERT INTO `song` VALUES ('165', '12', 'The Most', '03:20');
INSERT INTO `song` VALUES ('166', '12', 'Home To Mama', '03:23');
INSERT INTO `song` VALUES ('167', '13', '不准点火', '04:57');
INSERT INTO `song` VALUES ('168', '13', '给我亲爱的', '04:33');
INSERT INTO `song` VALUES ('169', '13', '忘情负义', '04:06');
INSERT INTO `song` VALUES ('170', '13', 'CRY', '04:47');
INSERT INTO `song` VALUES ('171', '13', '旧信,旧梦!', '04:47');
INSERT INTO `song` VALUES ('172', '13', 'Linda', '04:37');
INSERT INTO `song` VALUES ('173', '13', '法国餐厅', '04:12');
INSERT INTO `song` VALUES ('174', '13', '热情面具', '04:32');
INSERT INTO `song` VALUES ('175', '13', '仍是会喜欢你', '05:08');
INSERT INTO `song` VALUES ('176', '13', '圈圈', '04:20');
INSERT INTO `song` VALUES ('177', '14', '似梦似离', '03:22');
INSERT INTO `song` VALUES ('178', '14', '一切OK', '04:06');
INSERT INTO `song` VALUES ('179', '14', '千亿个夜晚', '05:26');
INSERT INTO `song` VALUES ('180', '14', '最爱是谁', '03:28');
INSERT INTO `song` VALUES ('181', '14', '敢爱敢做', '04:59');
INSERT INTO `song` VALUES ('182', '14', '生命之曲', '04:47');
INSERT INTO `song` VALUES ('183', '14', '千枝针刺在心', '04:02');
INSERT INTO `song` VALUES ('184', '14', '真的汉子', '04:44');
INSERT INTO `song` VALUES ('185', '14', '花街70号', '03:53');
INSERT INTO `song` VALUES ('186', '14', '阿Lam日记', '03:17');
INSERT INTO `song` VALUES ('187', '14', '在等一个晚上', '03:40');
INSERT INTO `song` VALUES ('188', '14', '深夜里', '04:48');
INSERT INTO `song` VALUES ('189', '14', '这一个夜', '03:52');
INSERT INTO `song` VALUES ('190', '15', '我这个你不爱的人', '04:29');
INSERT INTO `song` VALUES ('191', '15', '麻辣男人', '04:26');
INSERT INTO `song` VALUES ('192', '15', '第一号伤心人', '04:38');
INSERT INTO `song` VALUES ('193', '15', '出卖心碎', '04:50');
INSERT INTO `song` VALUES ('194', '15', '无名小卒', '03:39');
INSERT INTO `song` VALUES ('195', '15', '我敬你', '03:58');
INSERT INTO `song` VALUES ('196', '15', '如果你是爱上我的沧桑', '03:45');
INSERT INTO `song` VALUES ('197', '15', '弃爱保歌', '04:17');
INSERT INTO `song` VALUES ('198', '15', '爱无罪', '04:35');
INSERT INTO `song` VALUES ('199', '15', '管他谁爱谁', '04:55');
INSERT INTO `song` VALUES ('200', '16', '回家', '04:59');
INSERT INTO `song` VALUES ('201', '16', '不想一个人', '04:27');
INSERT INTO `song` VALUES ('202', '16', 'Can\'t Get Enough', '03:43');
INSERT INTO `song` VALUES ('203', '16', '永远等待', '04:55');
INSERT INTO `song` VALUES ('204', '16', '玩具', '05:08');
INSERT INTO `song` VALUES ('205', '16', '太阳', '03:04');
INSERT INTO `song` VALUES ('206', '16', 'A Bowl Of Rice', '03:23');
INSERT INTO `song` VALUES ('207', '16', '那那那那', '04:10');
INSERT INTO `song` VALUES ('208', '16', 'CJ', '05:14');
INSERT INTO `song` VALUES ('209', '16', '亲爱的Jazz', '04:43');
INSERT INTO `song` VALUES ('210', '16', 'Always Sisters', '02:37');
