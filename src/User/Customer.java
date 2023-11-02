package User;

import CartLogic.Cart;
import CartLogic.CartItem;

public class Customer extends User{
    public Customer(String status,String name){
        super(status,name);
    }

    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Integer getCartQty(){
        return this.getCart().getCartItems().size();
    }

    public void showCartContents() {
        for (CartItem item : this.cart.getCartItems()) {
            System.out.println(this.getName() + " has " + item.getQuantity() + " units of " + item.getName());
        }

    }

}
