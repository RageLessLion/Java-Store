package Enum;

public enum OrderStatus {
    PENDING("pending"),
    COMPLETED("completed"),
    CANCELED("canceled");

    private final String displayStatus;

    OrderStatus(String displayStatus){
        this.displayStatus = displayStatus;
    }
}
