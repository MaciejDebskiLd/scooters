package com.scooter.utils;

public enum Rates {

    WORKDAY (1),
    RUSH_HOUR (2),
    WEEKEND (0.5);

    private double pricePerMinute;

    Rates(double pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }
    public double getPricePerMinute(){
        return pricePerMinute;
    }
}
