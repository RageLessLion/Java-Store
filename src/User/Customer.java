package User;

import CartLogic.Cart;

public class Customer extends User{
    public Customer(String status,String name){
        super(status,name);
    }

    public void showCartContents(){
        super.showCartContents();
    }

}
