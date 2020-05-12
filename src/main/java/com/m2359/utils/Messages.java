package com.m2359.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class Messages {

    public final String swim;
    public final String fly;
    public final String walk;
    public final String sing;
    public final String silence;
    public final String cock_a_doodle_do;
    public final String joke;
    public final String joke2;
    public final String joke3;

    private static Messages messages = null;

    private static Locale defaultLocale = Locale.ENGLISH;

    public static Messages getMessages() {
        return Messages.getMessages(Messages.defaultLocale);
    }

    static Messages getMessages(Locale locale) {
        if (Messages.messages == null) {
            Messages.messages = new Messages(locale);
        }
        return Messages.messages;
    }

    private Messages(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        this.swim = bundle.getString("swim");
        this.fly = bundle.getString("fly");
        this.walk = bundle.getString("walk");
        this.sing = bundle.getString("sing");
        this.silence = bundle.getString("silence");
        this.cock_a_doodle_do = bundle.getString("cock-a-doodle-do");
        this.joke = bundle.getString("joke");
        this.joke2 = bundle.getString("joke2");
        this.joke3 = bundle.getString("joke3");
    }
}
