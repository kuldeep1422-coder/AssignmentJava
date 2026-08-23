package mindcraft.Assignment_11;

public class MarketingExecutive extends Employee{

    private int KillominterTravel;
    private int ToutAllowance;
    private int telephoneAllowance;

    Employee employee=new Employee();


     public double calculateNetSalary(){
            return calculateGrossSalary()-employee.getBasicSalary();
        }

        public int calculateGrossSalary(){
            return (int)employee.getBasicSalary()+KillominterTravelCount()+TelephoneCount()+TourTravelCount();
        }

    public MarketingExecutive() {
        KillominterTravel=5/100;
        ToutAllowance=5/100;
        telephoneAllowance=2000;
    }




    public MarketingExecutive(int killominterTravel, int toutAllowance, int telephoneAllowance) {
        KillominterTravel = killominterTravel;
        ToutAllowance = toutAllowance;
        this.telephoneAllowance = telephoneAllowance;
    }

    public int KillominterTravelCount(){ 
        return (int)employee.getBasicSalary() * 5 / 100;
    }

     public int TourTravelCount(){ 
        return (int)employee.getBasicSalary() * 5 / 100;
    }

      public int TelephoneCount(){ 
        return (int)employee.getBasicSalary() + 2000;
    }  
}
