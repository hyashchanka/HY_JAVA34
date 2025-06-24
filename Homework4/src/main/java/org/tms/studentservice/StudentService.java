package org.tms.studentservice;

public class StudentService {
    public int countStudentsByGroup(Student[] students, String group) {
        int count = 0;
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                count++;
            }
        }
        return count;
    }
}


