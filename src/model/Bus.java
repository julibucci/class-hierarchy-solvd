package model;

public class Bus extends Vehicle
{
    private int seatingCapacity;
    private int numberOfDoors;
    private boolean hasAirConditioning;
    private int length; // in meters
    private String fuelType; // e.g., Diesel, CNG, Electric

    public Bus(String brand, String model, int year, int seatingCapacity, int numberOfDoors, boolean hasAirConditioning, int length, String fuelType) {
        super(brand, model, year);
        this.seatingCapacity = seatingCapacity;
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioning = hasAirConditioning;
        this.length = length;
        this.fuelType = fuelType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println("The bus is starting.");
    }
}
