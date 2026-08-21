package Assignment_3;

/**
 * acccountHolder
 */
public class AccountHolder {

    private int accountNumber;
    private String accountHoldername;
    private double accountbalance;
    
    public int getaccountNumber() {
        return accountNumber;
    }
    public  AccountHolder(int accountNumber, String accountHoldername, double accountbalance) {
        this.accountNumber = accountNumber;
        this.accountHoldername = accountHoldername;
        this.accountbalance = accountbalance;
    }
    public void setaccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public String toString() {
        return "acccountHolder [accountNumber=" + accountNumber + ", accountHoldername=" + accountHoldername
                + ", accountbalance=" + accountbalance + "]";
    }
    public String getaccountHoldername() {
        return accountHoldername;
    }
    public void setaccountHoldername(String accountHoldername) {
        this.accountHoldername = accountHoldername;
    }
    public double getaccountbalance() {
        return accountbalance;
    }
    public void setaccountbalance(double accountbalance) {
        this.accountbalance = accountbalance;
    }

    public void withdraw(double amount){
        if (amount < 0 && accountbalance > 0) {
            accountbalance-=amount; 
            System.out.println("withdraw acount " + amount);
        }else{
            System.out.println("invalide ammount ");
        }
    }
    
       public void deposite(double amount){
        if (amount < 0) {
            accountbalance+=amount; 
            System.out.println("deposite acount " + amount);
        }else{
            System.out.println("invalide ammount ");
        }
    }
    
}