package com.StudentRecordManagement;
//student class
public class Student {
    //create attributes of rollnumber, name, age, grade and next pointer of student class
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    //create constructor of the student class
    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}