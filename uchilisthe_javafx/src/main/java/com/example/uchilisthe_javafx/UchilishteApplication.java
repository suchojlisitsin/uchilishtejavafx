package com.example.uchilisthe_javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class UchilishteApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UchilishteApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("SchoolGroup");
        stage.setScene(scene);
        stage.show();


    }
    public static ArrayList<Student> studentlist = new ArrayList<Student>();
    public static ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();
    public static void main(String[] args) throws ClassNotFoundException {
        DatabaseConnection dbc = new DatabaseConnection();
        dbc.getConnection("com.mysql.cj.jdbc.Driver");

        dbc.assignStudentNames();
        dbc.assignTeacherNames();

        /*ArrayList<Group> grouplist = new ArrayList<Group>();
        ArrayList<Student> grouplist1 = new ArrayList<Student>();
        grouplist1.add(studentlist.get(0));
        grouplist1.add(studentlist.get(1));
        grouplist.add(new Group("matematika", grouplist1));
        ArrayList<Student> grouplist2 = new ArrayList<Student>();
        grouplist2.add(studentlist.get(2));
        grouplist2.add(studentlist.get(3));
        grouplist.add(new Group("programirane", grouplist2));
        System.out.println(studentlist.get(3).name);
        System.out.println(grouplist.get(0).studentlist.get(0).name);*/

        /*ArrayList<Group> tgl1 = new ArrayList<Group>();
        tgl1.add(grouplist.get(0));
        teacherlist.add(new Teacher("Petar", "Petrov", tgl1));
        ArrayList<Group> tgl2 = new ArrayList<Group>();
        tgl2.add(grouplist.get(0));
        tgl2.add(grouplist.get(1));
        teacherlist.add(new Teacher("Kiril", "Izmirliev", tgl2));
        System.out.println(teacherlist.get(1).grouplist.get(1).studentlist.get(0).name);*/


        ///
        /*
        ObservableList<Student> s = FXCollections.observableArrayList(
                studentlist.get(0),
                studentlist.get(1),
                studentlist.get(2)
        );*/   /*

        System.out.println(s.get(0));
        System.out.println(s.get(1));
        System.out.println(s.get(2));*/
        Controller c = new Controller();
        //
        launch();
    }
}