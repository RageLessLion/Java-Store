package CartLogic;

import ProductLogic.Product;

public class CartItem extends Product {
    private Integer quantity;

    public CartItem(Product product,Integer quantity){
        super(product.getName(),product.getPrice(),product.getAvailableQuantity());
        this.quantity = quantity;
    }

    public String getProduct(){
        return super.name;
    }

    public Integer getProductPrice() { return super.price;}


    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void cartItemData(){
        System.out.println( "CartItem = " + this.name + " with the quantity of "  + quantity);
    }
}
