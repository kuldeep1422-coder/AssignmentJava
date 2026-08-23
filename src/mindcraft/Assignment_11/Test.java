package mindcraft.Assignment_11;

public class Test {
    public static void main(String[] args) {
    
        Employee e1=new Employee();
        Manager m1=new Manager();

        System.out.println("your pf : "+ m1.CalPF());
        System.out.println(m1.getBasicSalary());
        System.out.println();
        System.out.println("your FoodAllowanceCount : "+m1.FoodAllowanceCount());
        System.out.println();
        System.out.println("your OtherAllowanceCount : "+m1.OtherAllowanceCount());
        System.out.println();
        System.out.println("your calculateGrossSalary : "+m1.calculateGrossSalary());
        System.out.println();
        System.out.println("your calculateNetSalary : "+m1.calculateNetSalary());
        System.out.println();
        System.out.println("your petrolAllowanceCount : "+m1.petrolAllowanceCount());

        System.out.println("==========================================================");


        MarketingExecutive marketingExecutive=new MarketingExecutive();
        System.out.println(marketingExecutive.getBasicSalary());
        System.out.println("your pf : "+marketingExecutive.CalPF());
        System.out.println();
        System.out.println("your KillominterTravelCount : "+marketingExecutive.KillominterTravelCount());
        System.out.println();
        System.out.println("your TelephoneCount : "+marketingExecutive.TelephoneCount());
        System.out.println();
        System.out.println("your TourTravelCount : "+marketingExecutive.TourTravelCount());
        System.out.println();
        System.out.println("your calculateGrossSalary : "+marketingExecutive.calculateGrossSalary());
        System.out.println();
        System.out.println("your calculateNetSalary : "+marketingExecutive.calculateNetSalary());

    
    }
    
}
