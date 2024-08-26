import Classes.*;
import Exceptions.InvalidYearException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle airplane = null;
        Vehicle bus = null;
        VehicleFileManager fileManager = new VehicleFileManager();

        try {
            airplane = new Airplane("Boeing", "747", 2022, 0, 900, 300, "Jet Fuel", true);
            bus = new Bus("Mercedes", "Sprinter", 2020, 20, 2, true, 12, "Diesel");

            // Save details to file
            fileManager.saveVehicleDetails(airplane, "airplane_details.txt");
            fileManager.saveVehicleDetails(bus, "bus_details.txt");

            // Load details from file
            fileManager.loadVehicleDetails("airplane_details.txt");
            fileManager.loadVehicleDetails("bus_details.txt");

        } catch (InvalidYearException e) {
            System.out.println("An error occurred while creating a vehicle: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("A runtime error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

    }
}


