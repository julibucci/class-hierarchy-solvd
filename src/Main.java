import model.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creating an instance of Car
        Car car = new Car("Toyota", "Corolla", 2020, 4);

        //Starting the car
        car.start(); // calls the method

        car.accelerate();  // The car is accelerating.
        car.accelerate(110);  // The car is accelerating to 120 km/h.

        // Using setters to modify car details
        car.setDoors(5);
        System.out.println("Updated My Car Doors: " + car.getDoors());

        System.out.println("Car model: " + car.getModel());
    }
}