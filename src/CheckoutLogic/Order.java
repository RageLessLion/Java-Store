package CheckoutLogic;

import ProductLogic.Product;
import User.Customer;
import CartLogic.CartItem;

import java.util.ArrayList;
import Enum.OrderStatus;

public class Order {
    private Customer customer;

    private OrderStatus status;
    private ArrayList <String> products;

    private Integer total;

    public Order(Customer customer){
        this.customer = customer;
        this.products = new ArrayList<>();
        for(CartItem cartItem : customer.getCart().getCartItems()) {
            this.products.add(cartItem.getProduct());
            this.total = cartItem.getProductPrice() * cartItem.getQuantity();
        }
        this.total = 0;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<String> getProducts() {
        return products;
    }
}
