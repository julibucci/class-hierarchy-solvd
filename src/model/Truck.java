package model;

public class Truck extends Vehicle {
    // Attributes
    private int loadCapacity;
    private int numberOfAxles;
    private boolean hasTrailer;
    private String fuelType; // Diesel, Electric
    private int cabinSize; // number of seats

    // Constructor
    public Truck(String brand, String model, int year, int loadCapacity, int numberOfAxles, boolean hasTrailer, String fuelType, int cabinSize) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
        this.hasTrailer = hasTrailer;
        this.fuelType = fuelType;
        this.cabinSize = cabinSize;
    }

    // Getter y setter
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCabinSize() {
        return cabinSize;
    }

    public void setCabinSize(int cabinSize) {
        this.cabinSize = cabinSize;
    }

    @Override
    public void start() {
        System.out.println("The truck is starting.");
    }
}
