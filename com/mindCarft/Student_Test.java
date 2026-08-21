package com.mindCarft;

import com.mindCarft.pack1.Student;
import com.mindCarft.pack2.Batch;

public class Student_Test {
    public static void main(String[] args) {
        Student student=new Student(101, "kuldeep");
        Batch batch=new Batch("java", 100);
        System.out.println(student.toString());
        System.out.println(batch.toString());
    }
}
