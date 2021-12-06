package com.example.uchilisthe_javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.crypto.spec.PSource;

public class Controller {
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> familyname_student;

    @FXML
    private TableColumn<Student, String> firstname_student;

    @FXML
    private TableView<Teacher> teacherTable;

    @FXML
    private TableColumn<Teacher, String> firstname_teacher;

    @FXML
    private TableColumn<Teacher, String> familyname_teacher;

   // @FXML
   // private TableColumn<Student, String> groups_student;
    public UchilishteApplication ua = new UchilishteApplication();
    public ObservableList<Student> sl = FXCollections.observableArrayList();
    public ObservableList<Teacher> tl = FXCollections.observableArrayList();
   // public ObservableList<> gl = FXCollections.observableArrayList();
    @FXML
    public void initialize() {
        //student
        firstname_student.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        familyname_student.setCellValueFactory(new PropertyValueFactory<Student, String>("familyname"));
        for(int i = 0; i < ua.studentlist.size(); i++){
            sl.add(ua.studentlist.get(i));
        }
        studentTable.setItems(sl);
        //teacher
        firstname_teacher.setCellValueFactory(new PropertyValueFactory<Teacher, String>("name"));
        familyname_teacher.setCellValueFactory(new PropertyValueFactory<Teacher, String>("familyname"));
        for(int i = 0; i < ua.teacherlist.size(); i++){
            tl.add(ua.teacherlist.get(i));
        }
        teacherTable.setItems(tl);
    }
    @FXML
    void clickTest(ActionEvent event) {
        /*studentTable.setItems(sl);
        System.out.println(sl.get(0));
        System.out.println(sl.get(1));
        System.out.println(sl.get(2));*/
        System.out.println(studentTable.getColumns());

    }
}