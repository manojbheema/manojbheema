DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
-- Dumping data for table eaton.users: ~2 rows (approximately)
INSERT INTO `users` (`username`, `password`, `enabled`) VALUES
	('ameya', '1234', 1),
	('avani', '1234', 1);
-- Dumping structure for table eaton.user_roles
DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE IF NOT EXISTS `user_roles` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  UNIQUE KEY `uni_username_role` (`role`,`username`),
  KEY `fk_username_idx` (`username`),
  CONSTRAINT `fk_username` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
-- Dumping data for table eaton.user_roles: ~3 rows (approximately)
INSERT INTO `user_roles` (`user_role_id`, `username`, `role`) VALUES
	(2, 'ameya', 'ROLE_ADMIN'),
	(1, 'ameya', 'ROLE_USER'),
	(3, 'avani', 'ROLE_USER');