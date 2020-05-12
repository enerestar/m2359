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

    private static Messages en_messages = null;
    private static Messages zh_messages = null;
    private static Locale defaultLocale = Locale.ENGLISH;

    public static void setLocale(Locale locale) {
        Messages.defaultLocale = locale;
    }

    public static Messages getMessages() {
        return Messages.getMessages(Messages.defaultLocale);
    }

    static Messages getMessages(Locale locale) {
        if(locale.equals(Locale.ENGLISH)) {
            if (Messages.en_messages == null) {
                Messages.en_messages = new Messages(locale);
            }
            return Messages.en_messages;
        } else if (locale.equals(Locale.SIMPLIFIED_CHINESE)){
            if (Messages.zh_messages == null) {
                Messages.zh_messages = new Messages(locale);
            }
            return Messages.zh_messages;
        } else {
            throw new Error("Locale language "+ locale.getLanguage() + " not setup");
        }
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
