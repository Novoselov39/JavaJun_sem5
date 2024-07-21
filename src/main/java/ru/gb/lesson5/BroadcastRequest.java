package ru.gb.lesson5;

public class BroadcastRequest extends AbstractRequest {


    public static final String TYPE = "BroadcastMessage";

    private String message;

    public BroadcastRequest() {
        setType(TYPE);
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
