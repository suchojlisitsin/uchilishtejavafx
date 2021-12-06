package com.example.uchilisthe_javafx;


import java.util.ArrayList;

public class School {
    String name;
    ArrayList<String> studentlist = new ArrayList<String>();
    ArrayList<String> grouplist = new ArrayList<String>();
    ArrayList<String> teacherlist = new ArrayList<String>();
    /*public School(String n, ArrayList sl, ArrayList gl, ArrayList tl) {
        name = n;
        studentlist.addAll(sl);
        grouplist.addAll(gl);
        teacherlist.addAll(tl);
    }*/
    public School(){

    }
    public String getName(){
        return name;
    }
}
