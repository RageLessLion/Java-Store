package User;

import java.util.ArrayList;
import CartLogic.Cart;
import CartLogic.CartItem;

public class User {
    private String name;

    private String status;

    private Cart cart;

    public User(String status,String name){
        this.name = name;
        this.status = status;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cart getCart() {
        return cart;
    }

    public void showCartContents() {
        for (CartItem item : this.cart.getCartItems()) {
            System.out.println(this.name + " has " + item.getQuantity() + " units of " + item.getName());
        }

    }
}
