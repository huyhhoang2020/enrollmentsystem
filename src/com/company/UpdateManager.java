package com.company;

public class UpdateManager implements Manager {
    StudentEnrollMent update;
    AllManager manager = AllManager.getInstance();
    public UpdateManager(StudentEnrollMent enrollment) {
        this.update = enrollment;
    }

    @Override
    public void run() {
        manager.updateStudentEnrollment(update);
    }
    @Override
    public void remove() {
        manager.updateStudentEnrollment(update);
        System.out.println("Remove Done");
    }
}
