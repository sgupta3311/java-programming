package com.sg.coding.lambda;

public class RunningLambdaExample {
    public static void main(String[] args) {
        //Prior Java 1.8
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread..");
            }
        };
     new Thread(runnable).start();
        // Java 1.8
        Runnable runnableLambda=()-> System.out.println("Lambda Thread");
        new Thread(runnableLambda).start();

        Runnable multipleRunnable=()->{
            System.out.println("Multiple thread 1..");
            System.out.println("Multiple thread 2..");
        };
        new Thread(multipleRunnable).start();
        //Providing runnable interface implementation inside the thread itself
        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Providing runnable interface implementation inside the thread itself   ");
            }
        }).start();


    }


}
