
package CartLogic;

import java.util.ArrayList;
import CartLogic.CartItem;
import java.util.List;

public class Cart {
    private ArrayList<CartItem> cartItems;

    private Integer quantity;

    private Integer price;

    public Cart() {
        quantity = 0;
        price = 0;
        cartItems = new ArrayList<>();
    }

    public Integer getQuantity() {
        return quantity;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public ArrayList<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void addCartItem(CartItem cartItem) {
        if (cartItem.getQuantity() > cartItem.getAvailableQuantity()) {
            System.out.println("Product is not available in the selected quantity ");
        } else {
            if (cartItems.contains(cartItem)) {
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                setQuantity(this.getQuantity() + 1);
            } else {
                cartItems.add(cartItem);
                setQuantity(this.getQuantity() + cartItem.getQuantity());
            }
            this.setPrice(this.getPrice() + cartItem.getPrice());
        }
    }

    public void removeCartItem(CartItem cartItem){
        if(cartItems.contains(cartItem)){
            cartItems.remove(cartItem);
            this.setQuantity(this.getQuantity() - 1);
            this.setPrice(this.getPrice() - cartItem.getPrice());
        } else {
            System.out.println("Cart Item is not available");
        }
    }

    public void updateQuantity(CartItem cartItem,Integer newQuantity){
        if(cartItems.contains(cartItem)){
            cartItem.setQuantity(newQuantity);
        } else {
            System.out.println("Cart Item is not available");
        }
    }


}
