CREATE DATABASE School;
USE School;

CREATE TABLE Student(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(32),
    familyname VARCHAR(32)
);
INSERT INTO Student(name, familyname) 
VALUES
	("Gosho","Goshev"),
	("Ivan","Ivanov"),
	("Mitko","Mitkov"),
	("Miladin","Miladinov"),
	("Gosho","Miladinov"),
	("Ivan","Goshev"),
	("Mitko","Ivanov"),
	("Miladin","Mitkov");
 -- 
CREATE TABLE Teacher(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(32),
    familyname VARCHAR(32)
);
INSERT INTO Teacher(name, familyname) 
VALUES
	("Dimiter","Goshev"),
	("Peter","Ivanov"),
	("Milan","Mitkov"),
	("Georgi","Miladinov"),
	("Atanas","Miladinov"),
	("Teodor","Goshev"),
	("Teodosii","Ivanov"),
	("Simeon","Mitkov");
 --
SELECT * FROM Student;
SELECT * FROM Teacher;
