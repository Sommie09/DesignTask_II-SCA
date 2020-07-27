package com.example.designtaskii_sca;

import android.graphics.drawable.Drawable;

public class Car {
    private double rating;
    private String deals;
    private String carName;
    private String price;
    private int imageResource;

    private String carBrand;
    private String carDoors;
    private Drawable backgroundColourStar5;
    private Drawable backgroundColourStart4;
    private String peopleRating;

    public Car(double rating, String deals, String carName, String price, int imageResource) {
        this.rating = rating;
        this.deals = deals;
        this.carName = carName;
        this.price = price;
        this.imageResource = imageResource;
    }

    public Car(String carName, int imageResource, String carBrand, String carDoors, int backGroundColourStar5,int backGroundColourStar4, String peopleRating) {
        this.carName = carName;
        this.imageResource = imageResource;
        this.carBrand = carBrand;
        this.carDoors = carDoors;
        this.backgroundColourStar5 = backgroundColourStar5;
        this.backgroundColourStart4 = backgroundColourStart4;
        this.peopleRating = peopleRating;
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

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarDoors() {
        return carDoors;
    }



    public String getPeopleRating() {
        return peopleRating;
    }

    public Drawable getBackgroundColourStar5() {
        return backgroundColourStar5;
    }

    public Drawable getBackgroundColourStar4() {
        return backgroundColourStart4;
    }
}
