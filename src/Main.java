import Classes.*;
import Exceptions.ExceedingPassengerCapacityException;
import Exceptions.InvalidYearException;
import Exceptions.UnsupportedFuelTypeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Logger logger;
    public static void main(String[] args) {

        // Configuracion del logger
        File log4j2File = new File("C:\\Users\\julie\\OneDrive\\Escritorio\\Exercises - Solvd\\class hierarchy- solvd\\src\\resources\\log4j2.properties");
        System.setProperty("log4j2.configurationFile", log4j2File.toURI().toString());
        logger = LogManager.getLogger(Main.class);

        Vehicle airplane = null;
        Vehicle bus = null;
        Vehicle helicopter = null;
        Vehicle truck = null;
        Vehicle motorcycle = null;

        VehicleFileManager fileManager = new VehicleFileManager();

        try {
            airplane = new Airplane("Boeing", "747", 2022, 35000, 900, "Jet Fuel", new HashSet<>());
            ((Airplane) airplane).addPassenger("John Doe");
            ((Airplane) airplane).addPassenger("Jane Smith");

            bus = new Bus("Volvo", "B11R", 2021, 50, 2, "Diesel", new ArrayList<>());
            ((Bus) bus).setSeatingCapacity(45);
            ((Bus) bus).getRoutes().add("Route 1");
            ((Bus) bus).getRoutes().add("Route 2");

            // Uso de CustomLinkedList en lugar de LinkedList de Java
            CustomLinkedList<String> helicopterMaintenanceTasks = new CustomLinkedList<>();
            helicopterMaintenanceTasks.add("Check rotor blades");
            helicopterMaintenanceTasks.add("Change oil");

            helicopter = new Helicopter("Bell", "407", 2019, 1000, 6, 15000, "Aviation Gasoline", false, (Queue<String>) helicopterMaintenanceTasks);

            HashMap<String, Integer> initialCargo = new HashMap<>();
            initialCargo.put("Electronics", 500);
            initialCargo.put("Furniture", 200);
            truck = new Truck("Scania", "R450", 2020, 10000, 4, true, "Diesel", 2, initialCargo);

            ArrayList<String> initialAccessories = new ArrayList<>();
            initialAccessories.add("Saddlebags");
            initialAccessories.add("GPS");
            motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2018, 750, "Cruiser", true, "Black", true, initialAccessories);

            // Guardar detalles de vehiculos en archivos
            fileManager.saveVehicleDetails(airplane, "airplane_details.txt");
            fileManager.saveVehicleDetails(bus, "bus_details.txt");
            fileManager.saveVehicleDetails(helicopter, "helicopter_details.txt");
            fileManager.saveVehicleDetails(truck, "truck_details.txt");
            fileManager.saveVehicleDetails(motorcycle, "motorcycle_details.txt");

            // Cargar detalles de vehiculos desde archivos
            fileManager.loadVehicleDetails("airplane_details.txt");
            fileManager.loadVehicleDetails("bus_details.txt");
            fileManager.loadVehicleDetails("helicopter_details.txt");
            fileManager.loadVehicleDetails("truck_details.txt");
            fileManager.loadVehicleDetails("motorcycle_details.txt");

        } catch (InvalidYearException | ExceedingPassengerCapacityException e) {
            logger.error("An error occurred while creating a vehicle: " + e.getMessage(), e);
        } catch (RuntimeException e) {
            logger.warn("A runtime error occurred: " + e.getMessage(), e);
        } catch (Exception e) {
            logger.error("An unexpected error occurred: " + e.getMessage(), e);
        }
    }
}




