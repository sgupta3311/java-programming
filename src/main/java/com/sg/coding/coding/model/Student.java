package com.sg.coding.coding.model;

import java.util.List;

public class Student {
    private String name;
    private List<String> activities;
    private Integer gpa;
    private Integer gradeLevel;

    public Student(String name, List<String> activities, Integer gpa, Integer gradeLevel) {
        this.name = name;
        this.activities = activities;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getActivities() {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", activities=" + activities +
                ", gpa=" + gpa +
                ", gradeLevel=" + gradeLevel +
                '}';
    }
}
