package CoreJavaAssignment.Assignment_01;

public class FullTimeEmployee extends  Employee {

    public double annualBonus;

    @Override
    double calculateBonus() {
        return annualBonus;
    }

    public FullTimeEmployee(double annualBonus,int empId, String empName, double salary) {
        super(empId, empName, salary);
        this.annualBonus =annualBonus;
    }
}
