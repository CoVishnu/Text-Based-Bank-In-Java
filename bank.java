import java.util.*;

public class bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;

        int size = 0;
        double[] accountBalance = new double[100];
        String[] accountName = new String[100];
        for (; true;) {
            System.out.println("----------------------------------");
            System.out.println("Bank Admin Menu");
            System.out.println("Please Enter A Menu option:- ");
            System.out.println("(1): Add Customer In The Bank");
            System.out.println("(2): Change Customer Name");
            System.out.println("(3): Check Account Balance");
            System.out.println("(4): Modify Account Balance");
            System.out.println("(5): Summary Of All Accounts");
            System.out.println("(-1): Quit");
            System.out.println("----------------------------------");

            userInput = input.nextInt();
            if (userInput == 1) {
                System.out.println("----------------------------------");
                System.out.println("Bank Add Customer Menu");
                System.out.println("Enter The Account Balance:- ");
                double balance = input.nextDouble();
                accountBalance[size] = balance;
                System.out.println("Enter The Account Name:- ");
                input.nextLine();
                String name = input.nextLine();
                accountName[size] = name;

                System.out.println("Account Id:- " + size);
                size++;
                System.out.println("----------------------------------");

            } else if (userInput == 2) {
                System.out.println("----------------------------------");
                System.out.println("Bank Change Name Menu");
                System.out.println("Please Enter A Customer ID To Change Their Name:- ");
                int index = input.nextInt();
                System.out.println("Please Enter New Name:");
                accountName[index] = input.nextLine();
                System.out.println("----------------------------------");
            } else if (userInput == 3) {
                System.out.println("----------------------------------");
                System.out.println("Bank Check Balance Menu");
                System.out.println("Please Enter A Customer ID To Check Balance:- ");
                int index = input.nextInt();
                System.out.println("Your Balance Is Rs." + accountBalance[index]);
                System.out.println("----------------------------------");
            } else if (userInput == 4) {
                System.out.println("----------------------------------");
                System.out.println("Bank Modify Balance Menu");
                System.out.println("Please Enter A Customer ID To Modify Account Balance:- ");
                int index = input.nextInt();
                System.out.println("Please Enter The New Balace");
                accountBalance[index] = input.nextDouble();
                System.out.println("----------------------------------");
            } else if (userInput == 5) {
                System.out.println("----------------------------------");
                System.out.println("Bank Account Summary Menu");
                double total = 0;
                for (int i = 0; i < size; i++) {
                    total += accountBalance[i];
                    System.out.println(accountName[i] + " Has Rs." + accountBalance[i] + " In Their Account");
                }
                System.out.println("In Toatal, there is Rs." + total + " in the bank");
                System.out.println("----------------------------------");
            } else if (userInput == -1) {
                System.exit(-1);
            } else {
                System.out.println("----------------------------------");
                System.out.println("Please Enter The Correct Option");
                System.out.println("----------------------------------");
            }
        }
    }
}