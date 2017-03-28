package com.ba2364.inclassassignment08_benjamina;

import java.io.Serializable;

public class City implements Serializable {
    private String city;
    private String state;
    private int pop;
    private boolean big;

    public City() {
    } //Empty constructor required for data read from Firebase

    public City(String city, String state, int pop, boolean big) {
        this.city = city;
        this.state = state;
        this.pop = pop;
        this.big = big;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPop() {
        return pop;
    }

    public boolean big() {
        return big;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public void setPlaying(boolean big) {
        this.big = big;
    }

    @Override
    public String toString() {
        return city + " " + state + " " + pop + " " + big;
    }
}