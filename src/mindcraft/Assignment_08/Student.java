package Assignment_7;

import java.util.Scanner;

public class Student {
    private int RollNumber;
    private String Name;
    private Date BirthOfDate;

    private static int counter = 100;

    // Default Constructor
    public Student() {
        RollNumber = ++counter;
    }

      public Student(String name,Date BirthOfDatedate) {
        RollNumber = ++counter;
        this.Name=name;
        this.BirthOfDate = BirthOfDatedate;
    }

    @Override
    public String toString() {
        return "student [RollNumber=" + RollNumber + ", Name=" + Name + "]";
    }

        public void accept() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Birth Day: ");
        int day = sc.nextInt();

        System.out.print("Enter Birth Month: ");
        int month = sc.nextInt();

        System.out.print("Enter Birth Year: ");
        int year = sc.nextInt();

        BirthOfDate = new Date(day, month, year);
    }
    
}
 