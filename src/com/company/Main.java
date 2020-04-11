package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printMenu(String...a){
        int i = 1;
        for (String s:a){
            System.out.println(i+"."+s);
            i++;
        }
    }
    public static void Samples(ArrayList s, ArrayList c){
        Student<Integer> st1 = new Student<Integer>(88889,"Torres Hoang", "20/2/1996");   //Generics Feature
        Student<String> st2 = new Student<String>("s123456","Hoang Long", "10/9/1997");
        Student<Integer> st3 = new Student<Integer>(54321,"Alex Nguyen", "6/5/1992");
        s.add(st1);
        s.add(st2);
        s.add(st3);
        Course c1 = new Course(Courses.COSC2222,"Intro to Programming",12);           //Enum Feature
        Course c2 = new Course(Courses.COSC1110,"Web Programming",12);
        Course c3 = new Course(Courses.COSC111,"Building IT Systems", 12);
        c.add(c1);
        c.add(c2);
        c.add(c3);
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();
        ArrayList<Course> courses = new ArrayList();
        ArrayList<StudentEnrollMent> studentEnrollMents = new ArrayList();
        Samples(students, courses);

        System.out.print("Please enter your name to start:");
        Scanner readname = new Scanner(System.in);
        var name = readname.nextLine();
        System.out.println("Good day "+name);
        NewProgram task = NewProgram.getInstance();
        Thread t = new Thread(task);
        t.start();
        boolean exit = false;
        while(!exit) {
            StudentEnrollMent ste = new StudentEnrollMent();
            printMenu("Enroll",
                    "Drop Enrollment",
                    "Update Enrollment",
                    "View Enrollments",
                    "Print all courses ",
                    "Print all students",
                    "Exit");
            System.out.print("Choose your option:");
            Scanner scanner = new Scanner(System.in);
            var choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Create new enrollment:\n");
                    studentEnrollMents = ste.enroll(studentEnrollMents, students, courses);
                    ste.view(studentEnrollMents);
                    break;

                }
                case 2: {
                    System.out.println("Delete an enrollment:\n");
                    ste.view(studentEnrollMents);
                    studentEnrollMents = ste.delete(studentEnrollMents);
                    ste.view(studentEnrollMents);
                    break;
                }
                case 3: {
                    System.out.println("Update an enrollment:\n");
                    ste.view(studentEnrollMents);
                    studentEnrollMents = ste.update(studentEnrollMents, students, courses);
                    ste.view(studentEnrollMents);
                    break;
                }
                case 4: {
                    System.out.println("View enrollments:\n");
                    ste.view(studentEnrollMents);
                    break;
                }
                case 5:{
                    System.out.println("Print all courses:\n");
                    ste.view(studentEnrollMents);
                    break;
                }
                case 6:{
                    System.out.println("Print all students:\n");
                    ste.view(studentEnrollMents);
                    ArrayList a = new ArrayList();
                    break;
                }
                case 7:{
                    System.out.println("Bye Bye!");
                    exit = true;
                    break;
                }
            }
        }
    }
}

