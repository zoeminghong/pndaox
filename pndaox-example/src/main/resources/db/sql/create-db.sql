CREATE TABLE User (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `userName` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `mobileNo` varchar(200) NOT NULL,
  `avatar` VARCHAR(255) NOT NULL ,
  `createDate` datetime NOT NULL,
  `updateDate` datetime NOT NULL
);