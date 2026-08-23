package CoreJavaAssignment.Assignment_01;

public class PartTimeEmployee extends Employee{
    public  int hoursWorked;

    public PartTimeEmployee(int hoursWorked,int empId, String empName, double salary) {
        super(empId, empName, salary);
        this.hoursWorked=hoursWorked;
    }

    @Override
    double calculateBonus() {
        return hoursWorked*100;
    }
}
