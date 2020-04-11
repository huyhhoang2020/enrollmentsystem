package com.company;

public class DropManager implements Manager {
    StudentEnrollMent delete;

    AllManager manager = AllManager.getInstance();

    public DropManager(StudentEnrollMent enrollment) {
        this.delete = enrollment;
    }

    @Override
    public void run() {
        manager.deleteStudentEnrollment(delete);
    }
    @Override
    public void remove() {
        manager.createStudentEnrollment(delete);
        System.out.println("Remove Done");
    }
}
