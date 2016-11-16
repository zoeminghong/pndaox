CREATE TABLE PN_User (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `userName` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `mobileNo` varchar(200) NOT NULL,
  `avatar` VARCHAR(255) NOT NULL ,
  `AddTime` datetime NOT NULL,
  `UpdateTime` datetime NOT NULL
);