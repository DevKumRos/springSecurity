use spring_security;

DROP TABLE IF EXISTS user;
CREATE TABLE user (
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  role VARCHAR(100) NOT NULL,
  PRIMARY KEY (id));