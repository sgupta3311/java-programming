package com.sg.coding.functionalInterfaces;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static Supplier<List<Student>> students= ()->StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        System.out.println(students.get());
    }
}
