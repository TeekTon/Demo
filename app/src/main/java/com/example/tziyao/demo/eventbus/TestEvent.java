package com.example.tziyao.demo.eventbus;

/**
 * Created by tziyao on 16/7/12.
 */
public class TestEvent {
    private String message;

    public TestEvent(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
