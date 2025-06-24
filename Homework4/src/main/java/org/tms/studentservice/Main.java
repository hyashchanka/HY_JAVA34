package org.tms.studentservice;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        Student student1 = new Student();
        student1.setName("Jack");
        student1.setAge(20);
        student1.setGroup("Group 1");
        students[0] = student1;

        Student student2 = new Student();
        student2.setName("Jim");
        student2.setAge(19);
        student2.setGroup("Group 2");
        students[1] = student2;

        Student student3 = new Student();
        student3.setName("Alex");
        student3.setAge(21);
        student3.setGroup("Group 3");
        students[2] = student3;

        StudentService studentService = new StudentService();

        String targetGroup = "Group 1";
        int count = studentService.countStudentsByGroup(students, targetGroup);

        System.out.println("Number of students in  " + targetGroup + ": " + count);



    }

}
