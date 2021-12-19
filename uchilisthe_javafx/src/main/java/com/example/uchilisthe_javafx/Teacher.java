package com.example.uchilisthe_javafx;

import java.util.ArrayList;

public class Teacher extends School {
    String name;
    String familyname;
    ArrayList<Group> grouplist = new ArrayList<Group>();

    public Teacher(String n, String fn) {
        name = n;
        familyname = fn;
        //grouplist.addAll(gl);
        //super(grouplist, schoolname i tn da napravq)
    }
    public String getName() {
        return name;
    }

    public String getFamilyname() {
        return familyname;
    }
}
