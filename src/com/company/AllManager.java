package com.company;

import java.util.ArrayList;
import java.util.List;

public class AllManager implements StudentEnrollmentManager {

    private List<StudentEnrollMent> studentEnrollmentList = new ArrayList<>();
    private static AllManager instance = new AllManager();
    private AllManager(){
    }
    public static AllManager getInstance() {
        return instance;
    }

    @Override
    public void createStudentEnrollment(StudentEnrollMent newEnrollment) {
    }

    @Override
    public void updateStudentEnrollment(StudentEnrollMent enrollMent) {


    }

    @Override
    public void deleteStudentEnrollment(StudentEnrollMent enrollment) {

    }

    @Override
    public List<StudentEnrollMent> getAllEnrollments() {
        return this.studentEnrollmentList;
    }

}

