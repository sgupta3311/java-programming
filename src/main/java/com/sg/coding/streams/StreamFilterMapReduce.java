package com.sg.coding.streams;

import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class StreamFilterMapReduce {
    private static final Predicate<Student> genderPredicate = student -> {
        return student.getGender().equalsIgnoreCase("male");
    };
    private static final Predicate<Student> gradeLevelPredicate = student -> {
        return student.getGpa() > 2.0;
    };

    static int noOfNoteBooks() {
        int totalNoOfNoteBooks = StudentDataBase.getAllStudents().stream().filter(gradeLevelPredicate.and(gradeLevelPredicate)).
                map(student-> {
                    if (student.getNoteBooks()!=null)
                    return student.getNoteBooks();
                    else
                        return 0;
                }).reduce(0, Integer::sum);
        return totalNoOfNoteBooks;
    }

    public static void main(String[] args) {
        System.out.println("Total no of books "+noOfNoteBooks());
    }

}
