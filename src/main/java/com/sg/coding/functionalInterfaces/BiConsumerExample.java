package com.sg.coding.functionalInterfaces;



import com.sg.coding.model.Student;
import com.sg.coding.model.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String,List<String>>{
    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer=(name,activities) ->
        {
            System.out.println(name + " : " + activities);

        };
        List<Student> students= StudentDataBase.getAllStudents();
        students.forEach(student -> {
            biConsumer.accept(student.getName(),student.getActivities());
        });

    }

    public static void nameAndActivitiesBeforeFunctionalInterface() {
        BiConsumerExample biConsumerExample=new BiConsumerExample();
        List<Student> students=StudentDataBase.getAllStudents();
        for(Student student:students) {
            biConsumerExample.accept(student.getName(),student.getActivities());
        }
    }


    public static void main(String[] args) {
        nameAndActivities();
        nameAndActivitiesBeforeFunctionalInterface();
    }

    @Override
    public void accept(String name, List<String> activities) {
        System.out.println("Java 1.8");
        System.out.println(name + " : " + activities);
    }
}
