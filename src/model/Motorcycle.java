package model;

public class Motorcycle extends Vehicle
{
    // Attributes
    private int engineCapacity;
    private String type; //Cruiser, Sport, Touring
    private boolean hasWindshield;
    private String color;
    private boolean hasABS;


    public Motorcycle(String brand, String model, int year, int engineCapacity, String type, boolean hasWindshield, String color, boolean hasABS) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
        this.type = type;
        this.hasWindshield = hasWindshield;
        this.color = color;
        this.hasABS = hasABS;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasWindshield() {
        return hasWindshield;
    }

    public void setHasWindshield(boolean hasWindshield) {
        this.hasWindshield = hasWindshield;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasABS() {
        return hasABS;
    }

    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }

    @Override
    public void start() {
        System.out.println("The motorcycle is starting.");
    }

}
