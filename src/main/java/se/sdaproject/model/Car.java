package se.sdaproject.model;

public class Car {

    private final int topSpeed;
    private int speed;
    private String licensePlate;
    private String color;
    private String brand;

    public Car(int topSpeed, String licensePlate, String color, String brand) {
        this.topSpeed = topSpeed;
        this.speed = 0;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void gas(int force) {
        speed += force;
    }
}
