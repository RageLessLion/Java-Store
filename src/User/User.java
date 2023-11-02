package User;

import java.util.ArrayList;
import CartLogic.Cart;
import CartLogic.CartItem;
import Enum.UserStatus;

public class User {
    private String name;

    private UserStatus status;

    public User(UserStatus status, String name){
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
