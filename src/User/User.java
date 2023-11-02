package User;

import java.util.ArrayList;
import CartLogic.Cart;
import CartLogic.CartItem;

public class User {
    private String name;

    private String status;

    public User(String status,String name){
        this.name = name;
        this.status = status;
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
}
