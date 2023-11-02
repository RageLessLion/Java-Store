
import CartLogic.Cart;
import CartLogic.CartItem;
import ProductLogic.Product;
import User.User;
import User.Customer;
import Data.Data;
import User.Admin;
import Enum.UserStatus;

public class Main {
    public static void main(String[] args) {
        Data data  = new Data();
        Admin admin = new Admin(UserStatus.ADMIN,"administrator",data);
        String section = "users";
        switch (section) {
            case "users":
                //todo: use enum for status
                Customer customer1 = new Customer(UserStatus.CUSTOMER,"client1");
                admin.addCustomer(customer1);
                Product product1 = new Product("product1",20,10);
                CartItem cartItem1 = new CartItem(product1,5);
                Product product2 = new Product("product2",20,10);
                CartItem cartItem2 = new CartItem(product2,8);
                Cart cart = new Cart();
                cart.addCartItem(cartItem1);
                cart.addCartItem(cartItem2);
                customer1.setCart(cart);


                Customer customer2 = new Customer(UserStatus.CUSTOMER,"client2");
                admin.addCustomer(customer2);
                Cart cart2 = new Cart();
                cart2.addCartItem(cartItem1);
                customer2.setCart(cart2);

                admin.sortCustomersByCartQty();
                admin.traverseCustomers();
                break;
            case "carts":

                System.out.println("cart");
                break;
            case "orders":
                System.out.println("order");
        }
    }
}