package com.example.uchilisthe_javafx;

import java.sql.*;

public class DatabaseConnection {
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;
    public static void getConnection(String className) throws ClassNotFoundException{
        try {
            Class.forName(className);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","159159159");

            stmt = con.createStatement();

            rs = stmt.executeQuery("select * from Student");
            while(rs.next()){
                System.out.println(rs.getString("name")+" "+rs.getString("familyname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public static String getUsername(){
        try {
            System.out.println("//"+rs.getString("username"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "ff";
    }
    public static void assignStudentNames(){
        try {
            rs = stmt.executeQuery("select * from Student");
            while(rs.next()) {
                UchilishteApplication.studentlist.add(new Student(rs.getString("name"), rs.getString("familyname")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void assignTeacherNames(){
        try {
            rs = stmt.executeQuery("select * from Teacher");
            while(rs.next()) {
                UchilishteApplication.teacherlist.add(new Teacher(rs.getString("name"), rs.getString("familyname")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void addStudent(String name, String familyname){
        try {
            stmt.executeUpdate("INSERT INTO Student(name, familyname) VALUES('"+name+"','"+familyname+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void addTeacher(String name, String familyname){
        try {
            stmt.executeUpdate("INSERT INTO Teacher(name, familyname) VALUES('"+name+"','"+familyname+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
