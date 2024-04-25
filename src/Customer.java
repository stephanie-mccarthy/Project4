import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private int pin;
    private List<Account> accounts;

    public Customer(String firstName, String lastName, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getPin() {
        return pin;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void removeAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                break;
            }
        }
    }
    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
    public Account getAllAccounts(int accountNumber){
        for(Account account : accounts) {
            return account;
        }
        return null;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%s\nCredits: %d\n", firstName, lastName, pin);
    }
}


