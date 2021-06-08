package arraysListsBoxing.autoboxingChallenge;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> listOfCustomers;


    //add new customer
    public void addCustomer(Customer customer) {
        listOfCustomers.add(customer);
    }

    //show list of customers
    public void showListOfCustomers() {
        for(Customer c : listOfCustomers) {
            System.out.println(c);
        }
    }
}
