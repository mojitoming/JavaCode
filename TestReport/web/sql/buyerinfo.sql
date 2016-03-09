/*
-- Query: select * from buyerinfo
LIMIT 0, 1000

-- Date: 2016-03-09 19:40
*/

CREATE TABLE `buyerinfo` (
  `USERID` int(11) NOT NULL AUTO_INCREMENT COMMENT '买家ID',
  `NAME` varchar(20) NOT NULL COMMENT '买家姓名',
  `AGE` tinyint(4) DEFAULT NULL COMMENT '买家年龄',
  `SEX` varchar(2) DEFAULT NULL COMMENT '买家性别',
  `AREA` varchar(30) DEFAULT NULL COMMENT '买家所在地区',
  `TEL` varchar(11) DEFAULT NULL COMMENT '买家电话',
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


INSERT INTO `buyerinfo` (`USERID`,`NAME`,`AGE`,`SEX`,`AREA`,`TEL`) VALUES (1,'路飞',22,'0','新世界伟大航路','18678866666');
INSERT INTO `buyerinfo` (`USERID`,`NAME`,`AGE`,`SEX`,`AREA`,`TEL`) VALUES (2,'索隆',25,'0','新世界伟大航路','18678888888');
INSERT INTO `buyerinfo` (`USERID`,`NAME`,`AGE`,`SEX`,`AREA`,`TEL`) VALUES (3,'罗宾',27,'1','新世界伟大航路','13877777777');
INSERT INTO `buyerinfo` (`USERID`,`NAME`,`AGE`,`SEX`,`AREA`,`TEL`) VALUES (4,'香克斯',35,'0','四皇领地','19999999999');
INSERT INTO `buyerinfo` (`USERID`,`NAME`,`AGE`,`SEX`,`AREA`,`TEL`) VALUES (5,'娜美',22,'1','新世界伟大航路','13666666666');
