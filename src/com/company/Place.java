package com.company;

public class Place {
    private String location;
    private int maxCapacity;

    public Place(String location) {
        this.location = location;
        this.maxCapacity = 15;
    }

    public void setMaxCapacity(int manualMax) {
        this.maxCapacity = manualMax;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }
}
