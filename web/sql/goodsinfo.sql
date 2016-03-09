/*
-- Query: select * from goodsinfo
LIMIT 0, 1000

-- Date: 2016-03-09 19:40
*/

CREATE TABLE `goodsinfo` (
  `GOODS_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `GOODS_NAME` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `COST_PRICE` decimal(10,2) DEFAULT NULL COMMENT '成本价',
  `SELLING_PRICE` decimal(10,2) DEFAULT NULL COMMENT '售价',
  `MANUFACTURER` varchar(255) DEFAULT NULL COMMENT '制造商',
  PRIMARY KEY (`GOODS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;


INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (1,'iPhone 6',2000.00,5088.00,'apple');
INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (2,'iPhone 6s',2500.00,5288.00,'apple');
INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (3,'iPhone 6 plus',3000.00,6088.00,'apple');
INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (4,'iPhone 6s plus',3500.00,6288.00,'apple');
INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (5,'小米4',1000.00,2200.00,'小米');
INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (6,'华为P8',1000.00,2600.00,'华为');
INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (7,'三星 s6',3000.00,5000.00,'三星');
INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (8,'iPad pro',2500.00,3800.00,'apple');
INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (9,'Mac Pro',10000.00,19000.00,'apple');
INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (10,'iPad mini pro',1000.00,2800.00,'apple');
INSERT INTO `goodsinfo` (`GOODS_ID`,`GOODS_NAME`,`COST_PRICE`,`SELLING_PRICE`,`MANUFACTURER`) VALUES (11,'Mac Air',8000.00,11000.00,'apple');
