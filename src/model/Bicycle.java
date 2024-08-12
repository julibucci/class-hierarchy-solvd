package model;

public class Bicycle extends Vehicle
{
    private boolean hasGear;
    private int numberOfGears;
    private String type; // Road, Mountain
    private boolean hasSuspension;
    private String frameMaterial; // Steel, Aluminum, Carbon Fiber

    public Bicycle(String brand, String model, int year, boolean hasGear, int numberOfGears, String type, boolean hasSuspension, String frameMaterial) {
        super(brand, model, year);
        this.hasGear = hasGear;
        this.numberOfGears = numberOfGears;
        this.type = type;
        this.hasSuspension = hasSuspension;
        this.frameMaterial = frameMaterial;
    }

    public boolean hasGear() {
        return hasGear;
    }

    public void setHasGear(boolean hasGear) {
        this.hasGear = hasGear;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasSuspension() {
        return hasSuspension;
    }

    public void setHasSuspension(boolean hasSuspension) {
        this.hasSuspension = hasSuspension;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    @Override
    public void start() {
        System.out.println("The bicycle is ready to ride.");
    }
}
