package com.example.recyclerviewactivity.model;

public class CarModel {
    String Name;
    String Price;
    String Model;
    String Discription;
    int Image;

    public CarModel(String name, String price,String model, String discription, int image) {
        Name = name;
        Price = price;
        Discription = discription;
        Model = model;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
