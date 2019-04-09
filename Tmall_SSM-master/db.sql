DROP DATABASE IF EXISTS tmall_ssm;
CREATE DATABASE tmall_ssm DEFAULT CHARACTER SET utf8;

use tmall_ssm;

CREATE TABLE category (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  name varchar(255) NOT NULL COMMENT '分类的名字',
  PRIMARY KEY (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE referal_link (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  text varchar(255) NOT NULL COMMENT '超链显示的文字',
  link varchar(255) NOT NULL COMMENT '超链的地址',
  PRIMARY KEY (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE product (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  name varchar(255) NOT NULL COMMENT '产品的名称',
  sub_title varchar(255) DEFAULT NULL COMMENT '小标题',
  price float DEFAULT NULL COMMENT '价格',
  sale int(11) DEFAULT NULL COMMENT '销量',
  stock int(11) DEFAULT NULL COMMENT '库存',
  category_id int(11) DEFAULT NULL COMMENT '对应的分类id',
  PRIMARY KEY (id),
  CONSTRAINT fk_product_category FOREIGN KEY (category_id) REFERENCES category (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE property (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  name varchar(255) DEFAULT NULL COMMENT '属性名称',
  category_id int(11) NOT NULL COMMENT '对应的分类id',
  PRIMARY KEY (id),
  CONSTRAINT fk_property_category FOREIGN KEY (category_id) REFERENCES category(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE property_value (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  product_id int(11) NOT NULL COMMENT '对应产品id',
  properti_id int(11) NOT NULL COMMENT '对应属性id',
  value varchar(255) DEFAULT NULL COMMENT '具体的属性值',
  PRIMARY KEY (id),
  CONSTRAINT fk_property_value_property FOREIGN KEY (properti_id) REFERENCES property (id),
  CONSTRAINT fk_property_value_product FOREIGN KEY (product_id) REFERENCES product (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE product_image (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  product_id int(11) DEFAULT NULL COMMENT '对应的产品id',
  PRIMARY KEY (id),
  CONSTRAINT fk_product_image_product FOREIGN KEY (product_id) REFERENCES product (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  name varchar(255) NOT NULL COMMENT '用户名称',
  password varchar(255) NOT NULL COMMENT '用户密码',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE review (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  content varchar(4000) DEFAULT NULL COMMENT '评价内容',
  user_id int(11) NOT NULL COMMENT '对应的用户id',
  product_id int(11) NOT NULL COMMENT '对应的产品id',
  createDate datetime DEFAULT NULL COMMENT '评价时间',
  PRIMARY KEY (id),
  CONSTRAINT fk_review_product FOREIGN KEY (product_id) REFERENCES product (id),
  CONSTRAINT fk_review_user FOREIGN KEY (user_id) REFERENCES user (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE order_ (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  order_code varchar(255) NOT NULL COMMENT '订单号',
  address varchar(255) NOT NULL COMMENT '收货地址',
  post varchar(255) NOT NULL COMMENT '邮编',
  receiver varchar(255) NOT NULL COMMENT '收货人姓名',
  mobile varchar(255) NOT NULL COMMENT '手机号码',
  user_message varchar(255) NOT NULL COMMENT '用户备注的信息',
  create_date datetime NOT NULL COMMENT '订单创建时间',
  pay_date datetime DEFAULT NULL COMMENT '订单支付时间',
  delivery_date datetime DEFAULT NULL COMMENT '发货日期',
  confirm_date datetime DEFAULT NULL COMMENT '确认收货日期',
  user_id int(11) DEFAULT NULL COMMENT '对应的用户id',
  status varchar(255) NOT NULL COMMENT '订单状态',
  PRIMARY KEY (id),
  CONSTRAINT fk_order_user FOREIGN KEY (user_id) REFERENCES user (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE order_item (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一索引id',
  product_id int(11) NOT NULL COMMENT '对应产品id',
  order_id int(11) NOT NULL COMMENT '对应订单id',
  number int(11) DEFAULT NULL COMMENT '对应产品购买的数量',
  PRIMARY KEY (id) COMMENT '邮编',
  CONSTRAINT fk_order_item_product FOREIGN KEY (product_id) REFERENCES product (id),
  CONSTRAINT fk_order_item_order FOREIGN KEY (order_id) REFERENCES order_ (id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;