package model;

public class Car extends Vehicle
{
    // Attributes
    protected int doors;
    protected String color;
    private String fuelType;
    private boolean hasSunroof;
    private double engineCapacity;

    // Constructor
    public Car(String brand, String model, int year, int doors, String color, String fuelType, boolean hasSunroof, double engineCapacity) {
        super(brand, model, year);
        this.doors = doors;
        this.color = color;
        this.fuelType = fuelType;
        this.hasSunroof = hasSunroof;
        this.engineCapacity = engineCapacity;
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

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
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
                ", engineCapacity=" + engineCapacity +
                '}';
    }


}
