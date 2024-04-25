import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    Scanner scnr = new Scanner(System.in);
    private Bank bank = new Bank();

    public void displayMenu(){
        while(true){
            String selection;
            System.out.printf("\n%s Please make a selection: %s\n","*".repeat(9),"*".repeat(9));
            System.out.print(
                    "1) Access Account\n" +
                    "2) Open a New Account\n" +
                    "3) Close All Accounts\n" +
                    "4) Exit\n" +
                    ">> ");
            selection = scnr.nextLine();
            if(selection.equals("1")){
                accessAccount();
            } else if (selection.equals("2")) {
                openNewAccount();
            } else if (selection.equals("3")) {
                closeAllAccounts();
            } else if (selection.equals("4")) {
                System.out.println("Exiting...");
                break;
            }else {
                System.out.println("Invalid entry.");
            }
        }
    }
    private void accessAccount() {
        System.out.print("Enter your PIN: ");
        int pin = scnr.nextInt();
        Customer customer = bank.getCustomer(pin);
        if (customer == null) {
            System.out.println("PIN is not valid.");
            return;
        }
        System.out.println(customer.getAllAccounts(pin));
        System.out.print("Enter the account number you want to access: ");
        int accountNumber = scnr.nextInt();
        Account account = customer.getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account number invalid.");
        }
    }
    private void openNewAccount(){
        System.out.print("Are you a new customer? (yes/no): ");
        String isNewCustomer = scnr.next();
        if (isNewCustomer.equalsIgnoreCase("yes")) {
            Customer customer = getCustomer();
            if (customer != null) {
                System.out.print("Enter deposit amount for new account: ");
                double initialDeposit = scnr.nextDouble();
                Account account = new Account(initialDeposit);
                customer.addAccount(account);
                System.out.println("New Account Opened: " + account.getAccountNumber());
            }
        } else if (isNewCustomer.equalsIgnoreCase("no")) {
            System.out.print("Enter your PIN: ");
            int pin = scnr.nextInt();
            Customer customer = bank.getCustomer(pin);
            if (customer == null) {
                System.out.println("PIN is not valid.");
                return;
            }
            System.out.print("Enter deposit amount for new account: ");
            double initialDeposit = scnr.nextDouble();
            Account account = new Account(initialDeposit);
            customer.addAccount(account);
            System.out.println("New Account Opened: " + account.getAccountNumber());
        } else {
            System.out.println("Invalid entry. Please enter 'yes' or 'no'.");
        }
    }
    private void closeAllAccounts(){
        System.out.print("Enter your PIN: ");
        int pin = scnr.nextInt();
        Customer customer = bank.getCustomer(pin);
        if (customer == null) {
            System.out.println("PIN is not valid.");
            return;
        }
        bank.removeCustomer(customer);
        System.out.println("Customer removed from bank registry.");
    }
    private Customer getCustomer() {
        return null;
    }
}
