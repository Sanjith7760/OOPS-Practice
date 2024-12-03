import java.util.*;

public class Main {
    private static final String password = "KodNest2024";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password: ");
        String input = sc.nextLine();

        if (input.equals(password)) {
            BankAccount myAccount = new BankAccount("123456", 1000);

            System.out.println("Initial balance: $" + myAccount.getBalance());
            System.out.println("Account number: " + myAccount.getAccountNumber());

            System.out.println("Choose an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the amount to Deposit: ");
                    double depositAmount = sc.nextDouble();
                    myAccount.deposit(depositAmount);
                    System.out.println("Current balance: $" + myAccount.getBalance());
                    System.out.println("Account number: " + myAccount.getAccountNumber());
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    System.out.println("Current balance: $" + myAccount.getBalance());
                    System.out.println("Account number: " + myAccount.getAccountNumber());
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } else {
            System.out.println("Incorrect password.");
        }
    }
}

/*import java.util.Scanner;
if(userPassword.equals(Main.password))
{
 System.out.print("Please enter your choice : ");
 int choice = scan.nextInt();
 
 switch (choice) 
 {
case 1: 
// If user selects option 1 : 
   // Ask user how much money they need to Deposit
   System.out.print("Enter the money you need to deposit : ");
   double amount = scan.nextDouble();
// Deposit that much money.
   myAccount.deposit(amount);
   // Show current balance after depositing money
   System.out.println("Balance after depositing : " + myAccount.getBalance());
//Get account Number
   System.out.println("Account Number : " + myAccount.getAccountNumber());

   break;
   
case 2:
// If user selects option 2 : 
   // Ask user how much money they need to Withdraw
System.out.print("Enter the money you need to withdraw : ");
   double withdrawAmount = scan.nextDouble();
// Withdraw that much money.
   myAccount.withdraw(withdrawAmount);
   // Show current balance after withdrawing money.
   System.out.println("Balance after withdrawal : " + myAccount.getBalance());
   // Get account Number
   System.out.println("Account Number : " + myAccount.getAccountNumber());
break;
default:
}
}
else {
 System.out.println("Incorrect Password");
}
 
}
}*/