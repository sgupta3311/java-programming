package com.sg.coding.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDataBase {


    private static List<Student> students = new ArrayList<>();
    private static List<Student> newStudents = new ArrayList<>();

    public static List<Student> getAllStudents() {
        Student s1 = new Student("Sam", Arrays.asList("Tennis", "Math", "Swimming", "Chess"), 3, 3);
        Student s2 = new Student("Terry", Arrays.asList("Skating", "Math", "Swimming", "Piano"), 4, 3);
        Student s3 = new Student("Fox", Arrays.asList("Testing", "Math", "Science", "English"), 5, 4);
        Student s4 = new Student("Max", Arrays.asList("Automation", "Economics", "Commerce", "English"), 6, 5);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        getAllNewStudents();
        System.out.println("Get old student: " + students);
        students.addAll(newStudents);
        System.out.println("Total student list : " + students);
        return students;
    }

    public static List<Student> getAllNewStudents() {
        Student s1 = new Student("SamKing", Arrays.asList("Tennis", "Math", "Swimming", "Chess"), 3, 3,20,"male");
        Student s2 = new Student("TerryKing", Arrays.asList("Skating", "Math", "Swimming", "Piano"), 4, 3,20,"male");
        Student s3=new Student("Julie", Arrays.asList("English", "French", "German", "Mandarin","Spanish","Japanese"), 4, 3,30,"female");
        newStudents.add(s1);
        newStudents.add(s2);
        newStudents.add(s3);
        return newStudents;
    }


}
