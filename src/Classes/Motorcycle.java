package Classes;

import java.util.Objects;

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

    // method toString
    @Override
    public String toString() {
        return super.toString() + " Motorcycle [engineCapacity=" + engineCapacity + ", type=" + type +
                ", hasWindshield=" + hasWindshield + ", color=" + color + ", hasABS=" + hasABS + "]";
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineCapacity, type, color, hasABS);
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        // Primero, verifica si el objeto es el mismo que el objeto comparado
        if (this == obj) return true;

        // Verifica si el objeto es null o si las clases no coinciden
        if (obj == null || getClass() != obj.getClass()) return false;

        // Realiza el casting seguro a la clase Motorcycle
        Motorcycle motorcycle = (Motorcycle) obj;

        // Compara los atributos específicos de Motorcycle
        return engineCapacity == motorcycle.engineCapacity &&
                hasWindshield == motorcycle.hasWindshield &&
                hasABS == motorcycle.hasABS &&
                Objects.equals(type, motorcycle.type) &&
                Objects.equals(color, motorcycle.color);
    }
}
