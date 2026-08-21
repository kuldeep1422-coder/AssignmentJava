package Assignment_3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        AccountHolder[] accountHolderArr=new AccountHolder[10];

        Scanner sc=new Scanner(System.in);
       int choice,accountCount=0;

        while(true) {
			System.out.println("\n--- Menu ---");
            System.out.println("1. Add record for account holder");
            System.out.println("2. Display details of all account holders");
            System.out.println("3. Deposit an amount into a particular account");
            System.out.println("4. Withdraw an amount from a particular account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            
    
    switch (choice) {
        case 1: {
            // 1. Add record for account holder
            if (accountCount < accountHolderArr.length) {
                System.out.println("enter the account number :");
                int acountNumber=sc.nextInt();
                sc.nextLine();
                 System.out.println("enter the account holder number :");
                String accountHoldername=sc.next();
                sc.nextLine();
                 System.out.println("enter the inticile account balance :");
                double accountbalance=sc.nextDouble();
                // sc.nextLine();
                  AccountHolder newAccount=new AccountHolder(acountNumber, accountHoldername, accountbalance);
                     accountHolderArr[accountCount++]=newAccount;
                     System.out.println("Account is created....");
                break;
            }else{
                System.out.println("no any account found");
                 
            }
            break;

    } case 2:{
            	//2. Display details of all account holders
            	if(accountCount==0) {
            		System.out.println("No Account found...");
                    break;
            	}else {
            		for(int i=0;i<accountCount;i++) {
                        System.out.println(accountHolderArr[i]);
            			accountHolderArr[i].toString();
            			System.out.println("------------------------");
            		}
            	}
            	break;
            } case 3 : {
        // 3. Deposit an amount into a particular account
       	System.out.println("Enter account number for deposit ammount:");
            	int accountNumber=sc.nextInt();
        for (int i = 0; i < accountHolderArr.length; i++) {
            if (accountHolderArr[i].getaccountNumber()==accountNumber) {
                System.out.print("Enter amount to withdraw: ");
                        double damount = sc.nextDouble();
                accountHolderArr[i].deposite(damount);
                break;
            }else{
                System.out.println("account number is wrong");
                break;
            }
        }
    }             case 4:{
            	//4. Withdraw an amount from a particular account
            	System.out.println("Enter account number for withdraw ammount:");
            	int accountNumber=sc.nextInt();
            	boolean found=false;
            	for(int i=0;i<accountCount;i++) {
            		if(accountHolderArr[i].getaccountNumber()==accountNumber) {
            			System.out.print("Enter amount to withdraw: ");
                        double wamount = sc.nextDouble();
                        accountHolderArr[i].withdraw(wamount);
                        found = true;
                        break;
            		}
            	}
            	if(!found) {
            		System.out.println("Account Not found...");
            	}
            	break;
            } case 5:{
            	//Exit
            	System.out.println("Exiting...");
            	sc.close();
            	return;
            }
            default: {
                System.out.println("Invalid choice. Please try again.");
                break;
            }
        }
    }
}
}