package CoreJavaAssignment.Assignment_01;

public class Test {
    public static void main(String[] args) {
        Employee partEmployee=new PartTimeEmployee(100,101,"kuldeep",50000);
        Employee fullEmployee=new FullTimeEmployee(5000,102,"raju",40000);

        System.out.println(partEmployee.calculateBonus());
        System.out.println(partEmployee.toString());
        System.out.println(fullEmployee.calculateBonus());
        System.out.println(fullEmployee.toString());

    }
}
