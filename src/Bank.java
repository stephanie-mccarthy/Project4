import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customerArrayList = new ArrayList<>();

    public void addCustomer(Customer customer){
        customerArrayList.add(customer);
    }
    public void removeCustomer(Customer customer){
        customerArrayList.remove(customer);
    }
    public ArrayList<Customer> getCustomerArrayList(){
        return customerArrayList;
    }
    public Customer getCustomer(int customerPin){
        Customer foundCustomer = null;
        for(Customer customer:customerArrayList){
            if(customer.getPin() == customerPin){
                foundCustomer = customer;
                break;
            }
        }
        return foundCustomer;
    }
}
