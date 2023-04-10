package com.sg.coding.collections;

import com.sg.coding.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyList {
    private static List<Student> list = new ArrayList<>();
    private static List<Student> newList = new ArrayList<>();

    public static List<Student> getStudentList() {
        Student s1 = new Student("Sam", Arrays.asList("Tennis", "Math", "Swimming", "Chess"), 3, 3);
        Student s2 = new Student("Terry", Arrays.asList("Skating", "Math", "Swimming", "Piano"), 4, 3);
        Student s3 = new Student("Fox", Arrays.asList("Testing", "Math", "Science", "English"), 5, 4);
        Student s4 = new Student("Max", Arrays.asList("Automation", "Economics", "Commerce", "English"), 6, 5);
        // add elements to the list
        list = Arrays.asList(s1, s2, s3, s4);
        return list;
    }

    public static List<Student> getNewStudentList() {
        Student s5 = new Student("MJane", Arrays.asList("Automation", "Economics", "Commerce", "English"), 6, 5, 8, "male");
        newList.add(s5);
        return newList;
    }

    public static void main(String[] args) {
        getStudentList();
        getNewStudentList();
        System.out.println("Old List : " + list);
        newList.addAll(list);
        System.out.println("New List : " + newList);
    }
}
