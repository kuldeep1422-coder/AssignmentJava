package mindcraft.Assignment_15;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Employee Menu =====");
            System.out.println("1. Insert Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    Employee employee = new Employee();
                    employee.accept(sc);
                    employees.add(employee);
                    break;
                }
                case 2: {
                    System.out.println("enter the id for update employee");
                    int id = sc.nextInt();
                    boolean flag=false;
                    if (!employees.isEmpty()) {
                        for (Employee e : employees)
                            if (e.getEmpId() == id) {
                                System.out.println("enter the new name:  ");
                                e.setName(sc.next());

                                System.out.println("enter the new salary of employee");
                                e.setSalary(sc.nextInt());

                                flag = true;
                                System.out.println("update done");

                                break;
                            } else if (!flag){
                                System.out.println("this id is not in employees");
                                break;
                            }
                    }
                }
                case 3: {

                    if (employees.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {

                        for (Employee emp : employees) {
                            System.out.println(emp.toString());
                        }
                    }

                    break;
                }
                case 4: {
                    System.out.println("Program exited.");
                    return;
                }
                default:
                    System.out.println("Invalid choice.");
            }
        }while (choice != 4);
    }
}
