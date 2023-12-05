package Q2;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements Reportable {
    private int inventoryID;
    private VehicleType type;
    private List<Vehicle> vehicles;

    public Inventory(int inventoryID, VehicleType type) {
        setInventoryID(inventoryID);
        setType(type);
        vehicles = new ArrayList<>();
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle.getType() == getType()) {
            vehicles.add(vehicle);
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Inventory ID: ").append(inventoryID).append("\n");
        report.append("Vehicle Type: ").append(type).append("\n");
        report.append("Number of Vehicles: ").append(vehicles.size()).append("\n");
        for (Vehicle vehicle : vehicles) {
            report.append(vehicle.generateReport()).append("\n");
        }
        return report.toString();
    }
}
