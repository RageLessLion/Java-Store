package Data;

import User.Customer;

import java.util.ArrayList;

public class Data {
    private ArrayList <Customer> Customers;

    public Data(){
        Customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return Customers;
    }


}
