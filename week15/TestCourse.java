package com.HJK.hello;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 =new Course("Data Structures");
        Course course2 =new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "+ course1.getNumOfStudents());
        String[] students = course1.getStudents();
        for(int i=0;i<course1.getNumOfStudents();i++)
            System.out.println(students[i]+", ");

        System.out.println();
        System.out.println("Number of students in course2: "+ course2.getNumOfStudents());
    }
}
