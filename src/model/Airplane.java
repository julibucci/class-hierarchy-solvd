package model;

public class Airplane extends Vehicle
{
    private int altitude;
    private int maxSpeed;
    private int passengerCapacity;
    private String fuelType;
    private boolean hasWiFi;

    public Airplane(String brand, String model, int year, int altitude, int maxSpeed, int passengerCapacity, String fuelType, boolean hasWiFi) {
        super(brand, model, year);
        this.altitude = altitude;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
        this.fuelType = fuelType;
        this.hasWiFi = hasWiFi;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    @Override
    public void start() {
        System.out.println("The airplane is taking off.");
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "Airplane{" +
                "altitude=" + altitude +
                ", maxSpeed=" + maxSpeed +
                ", passengerCapacity=" + passengerCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", hasWiFi=" + hasWiFi +
                '}';
    }




}
