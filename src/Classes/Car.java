package Classes;

import Interfaces.Convertible;

public class Car extends Vehicle implements Convertible
{
    // Attributes
    protected int doors;
    protected String color;
    private String fuelType;
    private boolean hasSunroof;
    private boolean isRoofOpen;


    // Constructor
    public Car(String brand, String model, int year, int doors, String color, String fuelType, boolean hasSunroof, boolean isRoofOpen) {
        super(brand, model, year);
        this.doors = doors;
        this.color = color;
        this.fuelType = fuelType;
        this.hasSunroof = hasSunroof;
        this.isRoofOpen = false; // By default the roof is close
    }

    // Getter y setter
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        isRoofOpen = roofOpen;
    }

    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    // Method overloading
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }

    public void accelerate(int speed) {
        System.out.println("The car is accelerating to " + speed + " km/h.");
    }

    // Method toString
    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "doors=" + doors +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", hasSunroof=" + hasSunroof +
                "isRoofOpen=" + isRoofOpen +
                '}';
    }

    // Interface implementation
    @Override
    public void openRoof() {
        if (hasSunroof && !isRoofOpen) {
            System.out.println("Opening the cars roof.");
            isRoofOpen = true;
        } else if (isRoofOpen) {
            System.out.println("The roof is already open.");
        } else {
            System.out.println("This car doesn't have a sunroof.");
        }
    }

    @Override
    public void closeRoof() {
        if (hasSunroof && isRoofOpen) {
            System.out.println("Closing the cars roof.");
            isRoofOpen = false;
        } else if (!isRoofOpen) {
            System.out.println("The roof is already closed.");
        } else {
            System.out.println("This car doesn't have a sunroof.");
        }
    }


}
