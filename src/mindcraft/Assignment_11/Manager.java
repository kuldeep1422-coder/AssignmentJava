package mindcraft.Assignment_11;

public class Manager extends Employee {
        private int PetrolAllowance;
        private int FoodAllowance;
        private int OtherAllowance;

        Employee employee=new Employee();

    public Manager() {
        super();
    }

        public Manager(int petrolAllowance, int foodAllowance, int otherAllowance,int empid, String name , int basicSalary) {
            super(empid,name,basicSalary);
            PetrolAllowance = petrolAllowance;
            FoodAllowance = foodAllowance;
            OtherAllowance = otherAllowance;
        }

         public double calculateNetSalary(){
            return calculateGrossSalary()-employee.CalPF();
        }

        public int calculateGrossSalary(){
            return (int)employee.getBasicSalary()+petrolAllowanceCount()+FoodAllowanceCount()+OtherAllowanceCount();
        }

        public int  petrolAllowanceCount(){
           return (int)employee.getBasicSalary() * 8 / 100;
        }

        public int  FoodAllowanceCount(){
           return (int)employee.getBasicSalary() * 12/ 100;
        }
          public int  OtherAllowanceCount(){
           return (int)employee.getBasicSalary() * 4 / 100;
        }



}
