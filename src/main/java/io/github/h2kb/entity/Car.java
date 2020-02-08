package io.github.h2kb.entity;

public class Car {

    private String concern;

    private String model;

    private int year;

    private Long odometer;

    public Car(String concern, String model, int year, Long odometer) {
        this.concern = concern;
        this.model = model;
        this.year = year;
        this.odometer = odometer;
    }

    public void setConcern(String concern) {
        this.concern = concern;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOdometer(Long odometer) {
        this.odometer = odometer;
    }

    public String getConcern() {
        return concern;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Long getOdometer() {
        return odometer;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %s", concern, model, year, odometer);
    }
}
