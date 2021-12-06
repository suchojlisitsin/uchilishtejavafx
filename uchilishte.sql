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
SELECT * FROM Student;