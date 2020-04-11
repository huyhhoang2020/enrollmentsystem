package com.company.Print;

import java.util.ArrayList;

public class PrintAllCourses implements PrintEnrollments {
    private PrintCourse printCourse = new PrintCourse();
    @Override
    public void print(ArrayList a) {
        printCourse.print(a);
    }
}
