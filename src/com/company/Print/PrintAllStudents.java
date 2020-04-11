package com.company.Print;

import java.util.ArrayList;

public class PrintAllStudents implements PrintEnrollments {
    private PrintStudent printStudent = new PrintStudent();

    @Override
    public void print(ArrayList s) {
        printStudent.print(s);
    }
}
