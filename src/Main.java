
import CartLogic.Cart;
import CartLogic.CartItem;
import User.User;
import User.Customer;
import Data.Data;
import User.Admin;

public class Main {
    public static void main(String[] args) {
        Data data  = new Data();
        Admin admin = new Admin("admin","administrator",data);
        String section = "users";
        switch (section) {
            case "users":
                //todo: use enum for status
                admin.addCustomer(new Customer("customer","client1"));
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