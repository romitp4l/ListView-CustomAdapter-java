package com.example.listview_customadapter_java;

import java.util.ArrayList;

public class Teacher  {

    String name;
    String course ;

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setCourse(String course) {
//        this.course = course;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    public static ArrayList<Teacher> get10RandomTeachers(){
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Alice", "Mathematics"));
        teachers.add(new Teacher("Bob", "Physics"));
        teachers.add(new Teacher("Charlie", "Chemistry"));
        teachers.add(new Teacher("David", "Biology"));
        teachers.add(new Teacher("Eve", "Computer Science"));
        teachers.add(new Teacher("Frank", "History"));
        teachers.add(new Teacher("Grace", "Geography"));
        teachers.add(new Teacher("Hannah", "English"));
        teachers.add(new Teacher("Ivy", "Art"));
        teachers.add(new Teacher("Jack", "Physical Education"));
        return teachers;  // Add this line to return the list
    }

}
