package com.example.tziyao.demo.notifier;

/**
 * Created by tziyao on 16/7/15.
 */
public class Notifer {
    private EventHandler handler;

    public Notifer() {
        handler = new EventHandler();
    }

    public void addEventListener(Object entruster, String methodName, Class... params) {
        handler.addEvent(entruster, methodName, params);
    }

    public void removeEventListener(Object entruster){
        handler.removeEvent(entruster);
    }

    public void sendNotify(Object... params) {
        handler.sendNotify(params);
    }
}
