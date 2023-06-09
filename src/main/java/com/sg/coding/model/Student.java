package com.sg.coding.model;

import java.util.List;
import java.util.Optional;

public class Student {
    private String name;
    private List<String> activities;
    private Integer gpa;
    private Integer gradeLevel;

    private Optional<Bike> bike;

    private Integer noteBooks;

    private String gender;

    public  Student(String name, List<String> activities, Integer gpa, Integer gradeLevel) {
        this.name = name;
        this.activities = activities;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
    }

    public Student(String name, List<String> activities, Integer gpa, Integer gradeLevel, Integer  noteBooks, String gender) {
        this.name = name;
        this.activities = activities;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.noteBooks = noteBooks;
        this.gender = gender;
    }

    public Integer getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(Integer noteBooks) {
        this.noteBooks = noteBooks;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getActivities() {
        //System.out.println("List of Activities are : " + this.activities);
        return activities;
    }

    public void setActivities(List<String> activities) {


        this.activities = activities;
    }

    public Integer getGpa() {
        return gpa;
    }

    public void setGpa(Integer gpa) {
        this.gpa = gpa;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }


    public void printListOfActivities(){

        System.out.println("List of Activities are : " + this.activities);
    }

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", activities=" + activities +
                ", gpa=" + gpa +
                ", gradeLevel=" + gradeLevel +
                ", noteBooks=" + noteBooks +
                ", gender='" + gender + '\'' +
                '}';
    }
}
