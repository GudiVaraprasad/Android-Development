package com.example.foodapp;

public class Food {

    int image;
    String name, text;

    public Food(int image, String name, String text) {
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
