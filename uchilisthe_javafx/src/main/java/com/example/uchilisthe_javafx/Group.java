package com.example.uchilisthe_javafx;

import java.util.ArrayList;

public class Group extends School {
    String name;
    ArrayList<Student> studentlist = new ArrayList<Student>();

    public Group(String n, ArrayList sl) {
        name = n;
        studentlist.addAll(sl);

        //super(studetnlist, schoolname i tn da napravq)
    }
}
