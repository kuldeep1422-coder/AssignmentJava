package com.mindCarft.pack1;

public class Student {
 private int RollNumber;
 private String StudentName;

 @Override
public String toString() {
    return "student [RollNumber=" + RollNumber + ", StudentName=" + StudentName + "]";
}

 public int getRollNumber() {
    return RollNumber;
}

 public void setRollNumber(int rollNumber) {
    RollNumber = rollNumber;
 }

 public String getStudentName() {
    return StudentName;
 }

 public void setStudentName(String studentName) {
    StudentName = studentName;
 }

 public Student(int rollNumber, String studentName) {
    RollNumber = rollNumber;
    StudentName = studentName;
 }
 
}
