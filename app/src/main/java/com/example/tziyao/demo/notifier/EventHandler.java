package com.example.tziyao.demo.notifier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by tziyao on 16/7/15.
 * This class is the handler of all event.Notifer invoke this class to notify all the entruster.
 */
public class EventHandler {
    private List<Event> mEvents = new ArrayList<>();

    public void addEvent(Object entruser, String methodName, Class... args) {
        Event event = new Event(entruser, methodName, args);
        mEvents.add(event);
    }


    public void sendNotify(Object... mParams) {
        try {
            for (Event event : mEvents) {
                event.invoke(mParams);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeEvent(Object entruster) {
        Iterator<Event> iterator = mEvents.iterator();
        while (iterator.hasNext()) {
            Event next = iterator.next();
            if (next.getmEntruster() == entruster) {
                iterator.remove();
                break;
            }
        }
    }
}
