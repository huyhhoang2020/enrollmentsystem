package com.company;

public class NewProgram implements Runnable {
    private static NewProgram instance = new NewProgram();

    public static NewProgram getInstance() {
        return instance;
    }

    @Override
    public void run() {
        System.out.println("Welcome to the student enrollment program");
    }

}
