package com.mindCarft.pack2;

public class Batch {
 private String CourseName;
 private int batchStreath;



 @Override
public String toString() {
   return "Batch [CourseName=" + CourseName + ", batchStreath=" + batchStreath + "]";
}
 public Batch(String courseName, int batchStreath) {
    CourseName = courseName;
    this.batchStreath = batchStreath;
}
 public String getCourseName() {
    return CourseName;
 }
 public void setCourseName(String courseName) {
    CourseName = courseName;
 }
 public int getBatchStreath() {
    return batchStreath;
 }
 public void setBatchStreath(int batchStreath) {
    this.batchStreath = batchStreath;
 }  

}
