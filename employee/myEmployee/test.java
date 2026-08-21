package employee.myEmployee;

public class test {
    public static void main(String[] args) {
        Employee e1=new Employee(101, "kuldeep");
        e1.display();
        e1.display("it");
        e1.display("it", 50000);
        Employee.employeeCount();
    }
    
}
