CREATE DATABASE IF NOT EXISTS CrudJava;

USE CrudJava;

CREATE TABLE IF NOT EXISTS LOGIN(
	USER_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    USERNAME VARCHAR(45) NOT NULL,
    PSWD VARCHAR(255) NOT NULL,
    FULLNAME VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(100) NOT NULL UNIQUE
    ); 
	
    #SELECT * FROM LOGIN;
    
    #UPDATE LOGIN SET USERNAME = ?, PSWD = ?, FULLNAME = ?, EMAIL = ? WHERE USER_ID = ?;
    #DELETE FROM LOGIN WHERE USER_ID = 4;
    #DROP TABLE IF EXISTS LOGIN;
    #INSERT INTO LOGIN VALUES (0,'mresanto', 'pass123', 'Micael Rodrigues', 'micaelrodrigues504@gmail.com');