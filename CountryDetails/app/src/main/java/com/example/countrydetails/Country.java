package com.example.countrydetails;

public class Country {

    int image;
    String name, text;

    public Country(int image, String name, String text) {
        this.image = image;
        this.name = name;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}

