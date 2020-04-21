package com.example.myfirstapp.entity;

public class ListData {
    private int image;
    private String title;
    public ListData(int image, String title) {
        this.setImage(image);
        this.setTitle(title);
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
