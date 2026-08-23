package mindcraft.Assignment_15;

import java.util.Scanner;

public class Employee {
    private  int EmpId;
    private double Salary;
    private String Name;

    public Employee() {
        EmpId = 101;
        Name = "kuldeep";
        Salary = 10000;
    }

    public Employee(int empId, String name, int salary) {
        EmpId = empId;
        Name = name;
        Salary = salary;
    }

    void accept(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        EmpId = sc.nextInt();

        sc.nextLine(); // consume enter

        System.out.print("Enter Employee Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Salary: ");
        Salary = sc.nextDouble();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("EmpId=").append(EmpId);
        sb.append(", Salary=").append(Salary);
        sb.append(", Name='").append(Name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
