package User;

import Data.Data;

import java.util.ArrayList;

public final class Admin extends User {

    private final Data data;

    public Admin(String status, String name, Data data){
        super(status,name);
        this.data = data;
    }

    public void addCustomer(Customer customer) {
        data.getCustomers().add(customer);
    }

    public void traverseCustomers(){
        for(Customer customer : data.getCustomers()){
            System.out.println(customer.getName());
        }
    }


}
