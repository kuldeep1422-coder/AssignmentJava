package Assignment_4;

/**
 * student
 */
public class Student {
private int rollNumber;
private String name;
private double percentage;
private static int studetcount;

public Student(){

}
 
{
System.out.println("my name init");
    studetcount++;
}

public Student(int rollNumber, String name, double percentage) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.percentage = percentage;
}



public void StudentCount(){
    System.out.println("this much student in class :" + studetcount);
}

@Override
public String toString() {
    return "Student [rollNumber=" + rollNumber + ", name=" + name + ", percentage=" + percentage + "]";
}


public int getRollNumber() {
    return rollNumber;
}
public void setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getPercentage() {
    return percentage;
}
public void setPercentage(double percentage) {
    this.percentage = percentage;
}


    
}