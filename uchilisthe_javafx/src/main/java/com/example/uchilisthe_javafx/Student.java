package com.example.uchilisthe_javafx;

public class Student extends School {
    String name;
    String familyname;

    public Student(String n, String fn) {
        name = n;
        familyname = fn;
    }

    public String getName() {
        return name;
    }

    public String getFamilyname() {
        return familyname;
    }
}
