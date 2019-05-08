create database tfs;
use tfs;
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
   gid  int not null,
  `uname` varchar(32) NOT NULL,
  `unickname` varchar(32) NOT NULL,
  `upwd` varchar(32) NOT NULL,
  `ulogindate` datetime NOT NULL,
  `isdelete` bit(1) NOT NULL,
  `isonline` bit(1) NOT NULL,
  `remark1` varchar(32)  NULL,
  `remark2` varchar(32)  NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE teach_feedback
(
   feedid INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
   feedperson INT NOT NULL,
   feedtitle  VARCHAR(256) NOT NULL,
   feedcontent  VARCHAR(4096) NOT NULL,
   feeddate  DATETIME NOT NULL,
   feedstatus  INT NOT NULL,
   feedisdelete BIT NOT NULL,
   remark1 VARCHAR(256),
   remark2 VARCHAR(256)
)