package com.example.designtaskii_sca;

public class Car {
    private double rating;
    private String deals;
    private String carName;
    private String price;
    private int imageResource;

    public Car(double rating, String deals, String carName, String price, int imageResource) {
        this.rating = rating;
        this.deals = deals;
        this.carName = carName;
        this.price = price;
        this.imageResource = imageResource;
    }

    public double getRating() {
        return rating;
    }

    public String getDeals() {
        return deals;
    }

    public String getCarName() {
        return carName;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResource() {
        return imageResource;
    }
}
