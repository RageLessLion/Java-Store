
import CartLogic.Cart;
import CartLogic.CartItem;
import ProductLogic.Product;
import User.User;
import User.Customer;
import Data.Data;
import User.Admin;
import Enum.UserStatus;
import CheckoutLogic.Order;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //initialising data and admin (starting point)
        Data data  = new Data();
        Admin admin = new Admin(UserStatus.ADMIN,"administrator",data);
        //customer
        Customer customer1 = new Customer(UserStatus.CUSTOMER,"client1");
        admin.addCustomer(customer1);
        //product + cartItem
        Product product1 = new Product("product1",20,10);
        CartItem cartItem1 = new CartItem(product1,11);
        //product + cartItem
        Product product2 = new Product("product2",20,10);
        CartItem cartItem2 = new CartItem(product2,8);
        //cart + associating cartItems
        Cart cart = new Cart();
        admin.addCart(cart);
        cart.addCartItem(cartItem1);
        cart.addCartItem(cartItem2);
        customer1.setCart(cart);


        Customer customer2 = new Customer(UserStatus.CUSTOMER,"client2");
        admin.addCustomer(customer2);
        Cart cart2 = new Cart();
        admin.addCart(cart2);
        cart2.addCartItem(cartItem1);
        customer2.setCart(cart2);

        Order order = new Order(customer1);
        System.out.print(order.getProducts());



//        admin.sortCustomersByCartQty();
//        admin.traverseCustomers();
//        for(Cart cartIndex : data.getCarts()){
//            System.out.println(cartIndex.getCartItems());
//        }
    }
}