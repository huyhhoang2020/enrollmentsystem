package com.company;

import java.util.List;

public interface StudentEnrollmentManager {
    public void createStudentEnrollment(StudentEnrollMent newEnrollment);
    public void updateStudentEnrollment(StudentEnrollMent enrollMent);
    public void deleteStudentEnrollment(StudentEnrollMent enrollment);
    public List<StudentEnrollMent> getAllEnrollments();
}