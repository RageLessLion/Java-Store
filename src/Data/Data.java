package Data;

import User.Customer;
import CartLogic.Cart;

import java.util.ArrayList;
import CheckoutLogic.Order;

public class Data {
    private ArrayList <Customer> Customers;

    private ArrayList <Cart> Carts;

    private ArrayList <Order> Orders;

    public Data(){
        Customers = new ArrayList<>();
        Carts = new ArrayList<>();
        Carts = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return Customers;
    }

    public ArrayList<Cart> getCarts(){return Carts;}

}
