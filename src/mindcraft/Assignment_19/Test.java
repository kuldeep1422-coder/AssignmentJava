package mindcraft.Assignment_19;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account(20000);

        System.out.println("Current Balance: " + account.getBalance());

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();

        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();

        try {

            account.withdraw(withdrawAmount);

        } catch (OverLimitException e) {

            System.out.println("OverLimit Exception: " + e.getMessage());

        } catch (InsufficientBalanceException e) {

            System.out.println(
                    "InsufficientBalance Exception: " + e.getMessage()
            );
        }

        sc.close();
    }
}