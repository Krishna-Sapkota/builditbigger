package com.udacity.gradle.builditbigger.backend;

/** The object model for the data we are sending through endpoints */

public class MyBean {

    private final String text;

    public MyBean(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}