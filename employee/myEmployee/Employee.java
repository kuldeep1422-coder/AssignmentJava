package employee.myEmployee;

public class Employee {
    int emp_Id;
    String name;


    static String company = "mindcraft";

    static int employeeCount =0;

    static{
        System.out.println("employees system management system started ");
    }

     {

        System.out.println("new employee object is being craeted");

    }

    Employee(int emp_Id,String name){
        this.emp_Id = emp_Id;
        this.name = name ;

        System.out.println("paramrterized constructor called");

        employeeCount ++;
    }

    public void display(){
        System.out.println("employee_id : " + emp_Id);
        System.out.println("employee name :" + name);
        System.out.println("company : " + company);
    }

    
    public void display(String department){
        System.out.println("employee_id : " + emp_Id);
        System.out.println("employee name :" + name);
        System.out.println("department:  " + department);
        System.out.println("company : " + company);
    }

      public void display(String department,double salary){
        System.out.println("employee_id : " + emp_Id);
        System.out.println("employee name :" + name);
        System.out.println("department:  " + department);
        System.out.println("salary:  " + salary);
        System.out.println("company : " + company);
    }

    public static void employeeCount(){
        System.out.println(employeeCount);
    }

}
