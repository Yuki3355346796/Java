package com.HJK.hello;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numOfStudents < students.length) {
            students[numOfStudents] = student;
            numOfStudents++;
        } else {
            // Handle the case when the array is full
            System.out.println("The course has reached its maximum capacity.");
        }
    }

    public String[] getStudents() {
        // Return a copy of the students array to prevent external modifications
        String[] studentCopy = new String[numOfStudents];
        System.arraycopy(students, 0, studentCopy, 0, numOfStudents);
        return studentCopy;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numOfStudents; i++) {
            if (students[i] != null && students[i].equals(student)) {
                // Move the last element to the position of the element to be removed
                students[i] = students[numOfStudents - 1];
                // Reduce the number of students
                numOfStudents--;
                // No need to shift elements as we've already replaced the element to be removed
                break;
            }
        }
    }
}