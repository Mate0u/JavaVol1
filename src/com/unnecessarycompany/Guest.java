package com.unnecessarycompany;

import com.sun.security.jgss.GSSUtil;

public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public void diplayGuestInformation(){
        System.out.println("imię " + name);
        System.out.println("posiłek " + meal);
        System.out.println("telefon " + phoneNumber);
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("vege " + isVeganString);
    }
}
