package com.example.tziyao.demo.notifier;

import java.lang.reflect.Method;

/**
 * Created by tziyao on 16/7/15.
 * Class for Event.Contains the entruser 、method and args;
 */
public class Event {

    private String mMethodName;
    private Object mEntruster;
    private Class[] mParamsType;

    public Event(Object entruster, String methodName, Class... args) {
        this.mEntruster = entruster;
        this.mMethodName = methodName;
        this.mParamsType = args;
    }

    public String getmMethodName() {
        return mMethodName;
    }

    public void setmMethodName(String mMethodName) {
        this.mMethodName = mMethodName;
    }

    public Object getmEntruster() {
        return mEntruster;
    }

    public void setmEntruster(Object mEntruster) {
        this.mEntruster = mEntruster;
    }

    public Class[] getmParamsType() {
        return mParamsType;
    }

    public void setmParamsType(Class[] mParamsType) {
        this.mParamsType = mParamsType;
    }

    public void invoke(Object... params) throws Exception {
        Method method = mEntruster.getClass().getMethod(mMethodName, mParamsType);
        if (method == null) {
            throw new IllegalStateException("No method" + mMethodName + "in" + mEntruster.getClass().getName());
        }
        method.invoke(mEntruster, params);
    }
}
