package Enum;

public enum UserStatus {
    CUSTOMER("Customer"),
    ADMIN("Admin");

    private final String displayStatus;

    UserStatus(String displayStatus){
        this.displayStatus = displayStatus;
    }
}
