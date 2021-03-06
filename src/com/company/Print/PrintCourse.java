package com.company.Print;

import com.company.Course;
import com.company.Courses;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintCourse implements PrintEnrollments {

    @Override
    public void print(ArrayList s) {
        var id = 0;
        Iterator co = s.iterator();
        while (co.hasNext()) {
            Object obj = co.next();
            if (obj instanceof Course) {
                id++;
                Course cprint = (Course) obj;
                System.out.println("ID:" + id + "||" +cprint.getId()+ " " + cprint.getName() + " " + "Credit:"+ cprint.getCredit());
            }
        }
    }
}
