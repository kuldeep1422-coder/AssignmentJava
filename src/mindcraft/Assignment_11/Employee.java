package mindcraft.Assignment_11;

public class Employee {
    private int empid;
    private String name;
    private int  BasicSalary;

    

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + ", BasicSalary=" + BasicSalary + "]";
    }
    
    public Employee() {
        super();
        empid = 101;
        name = "kuldeep";
        BasicSalary = 10000;
    }


    public Employee(int empid, String name, int basicSalary) {
        super();
        this.empid = empid;
        this.name = name;
        BasicSalary = basicSalary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        BasicSalary = basicSalary;
    }

    public double CalPF(){
        double cal = 12.5 / 100;
        return   cal*BasicSalary;
    }

}
