package com.company;


import com.company.Print.PrintAllCourses;
import com.company.Print.PrintAllStudents;
import com.company.Print.PrintEnrollments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentEnrollMent {
    private Student student;
    private Course course;
    private String semester;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList enroll(ArrayList e, ArrayList s, ArrayList c) {
        StudentEnrollMent ste = new StudentEnrollMent();

//        printStudent(s);
        PrintEnrollments printStudents = new PrintAllStudents();
        printStudents.print(s);

        System.out.print("Enter ID student you want to enroll:");
        Scanner scanner = new Scanner(System.in);
        var ids = scanner.nextInt() - 1;
        Student s1;
        s1 = (Student) s.get(ids);
        ste.setStudent(s1);

//        printCourse(c);
        PrintEnrollments printCourses = new PrintAllCourses();
        printCourses.print(c);
        System.out.print("Enter ID course you want to enroll:");
        var idc = scanner.nextInt() - 1;
        Course c1;
        c1 = (Course) c.get(idc);
        ste.setCourse(c1);

        System.out.println("Enter the semester: 1.2018A |2.2018B |3.2018C");
        Scanner scanner1 =new Scanner(System.in);
        String sem = scanner1.nextLine().toUpperCase();
        ste.setSemester(sem);

        e.add(ste);

        return e;
    }

    public ArrayList delete(ArrayList e){
        System.out.print("Enter the ID of enrollment to drop:");
        Scanner scanner = new Scanner(System.in);
        var idtodrop = scanner.nextInt() - 1;
        e.remove(idtodrop);
        return e;
    }

    public void view(ArrayList e) {
        if (e.size()==0){
            System.out.println("The enrollment is empty");
        }
        var id = 0;
        Iterator ste = e.iterator();
        while (ste.hasNext()) {
            Object obj = ste.next();
            if (obj instanceof StudentEnrollMent) {
                id++;
                StudentEnrollMent steprint = (StudentEnrollMent) obj;
                System.out.println(
                        "ID:" + id + "-->| Name:" + steprint.getStudent().getName() +"|Card Number: "+steprint.getStudent().getId()+" |Dob:" + steprint.getStudent().getDob()
                                + "|"+steprint.getCourse().getId()+" " + steprint.getCourse().getName() + "|Credit:" + steprint.getCourse().getCredit()
                                + "|Semester:" + steprint.getSemester()+"|");
            }
        }
    }

    public ArrayList update(ArrayList e, ArrayList s, ArrayList c){
        System.out.print("Enter ID of enrollment you want to update:");
        Scanner scanner = new Scanner(System.in);
        var ide = scanner.nextInt() - 1;
        StudentEnrollMent ste;
        ste = (StudentEnrollMent) e.get(ide);

        System.out.print("Choose which one to update:"+"\n"
                +"1.Student"+"\n"
                +"2.Course"+"\n"
                +"3.Semester"+"\n"
                +"4.Go back"+"\n"
                +"Enter option: ");
        var choice = scanner.nextInt();
        if (choice==1) {
//            printStudent(s);
            PrintEnrollments printStudents = new PrintAllStudents();
            printStudents.print(s);
            System.out.print("Replace student:");
            var student = scanner.nextInt() - 1;
            Student student1;
            student1 = (Student) s.get(student);
            ste.setStudent(student1);

        }
        else if (choice==2)
        {
//            printCourse(c);
            PrintEnrollments printCourses = new PrintAllCourses();
            printCourses.print(c);
            System.out.print("Replace course:");
            var course = scanner.nextInt() - 1;
            Course course1;
            course1 = (Course) c.get(course);
            ste.setCourse(course1);
        }
        else if (choice == 3){
            System.out.println("Enter the semester option:1.2020A |2.2020B |3.2020C");
            Scanner scanner1 =new Scanner(System.in);
            String sem = scanner1.nextLine().toUpperCase();
            ste.setSemester(sem);
        }
        return e;
    }

}
