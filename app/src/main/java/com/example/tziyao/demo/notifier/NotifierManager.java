package com.example.tziyao.demo.notifier;

/**
 * Created by tziyao on 16/7/15.
 */
public class NotifierManager {

    private Notifer testNotifer = new Notifer();

    private static NotifierManager instance = new NotifierManager();


    public static NotifierManager getInstance() {
        return instance;
    }

    public Notifer getTestNotifer() {
        return testNotifer;
    }

    public void setTestNotifer(Notifer testNotifer) {
        this.testNotifer = testNotifer;
    }
}
