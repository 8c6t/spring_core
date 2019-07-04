package com.hachicore.demospring51;

import org.springframework.context.ApplicationEvent;

// public class MyEvent extends ApplicationEvent {
public class MyEvent {

    private int data;

    private Object source;

    public MyEvent(Object source, int data) {
        // super(source);
        this.source = source;
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
