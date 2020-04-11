package com.company;

public class EnrollManager implements Manager {
    StudentEnrollMent enrollment;

    AllManager manager = AllManager.getInstance();

    public EnrollManager(StudentEnrollMent enrollment) {
        this.enrollment = enrollment;
    }

    @Override
    public void run() {
        manager.createStudentEnrollment(enrollment);
    }
    @Override
    public void remove() {
        manager.getAllEnrollments().remove(enrollment);
        System.out.println("Remove Done");
    }
}
