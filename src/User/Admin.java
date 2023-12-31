package User;

import Data.Data;
import Enum.UserStatus;
import CartLogic.Cart;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class Admin extends User {

    private final Data data;

    public Admin(UserStatus status, String name, Data data){
        super(status,name);
        this.data = data;
    }

    public void addCustomer(Customer customer) {
        data.getCustomers().add(customer);
    }

    public void addCart(Cart cart){
        data.getCarts().add(cart);
    }

    public void removeCustomer(Customer customer){
        data.getCustomers().remove(customer);
    }

    public void traverseCustomers(){
        for(Customer customer : data.getCustomers()){
            System.out.print(customer.getName() + " " + customer.getCart().getQuantity() + " ");
        }
    }

    public void sortCustomersByCartQty(){
        Comparator <Customer> cartQty = Comparator.comparingInt(customer -> customer.getCart().getQuantity());
        Collections.sort(data.getCustomers(),cartQty);
    }




}
