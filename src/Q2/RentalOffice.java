package Q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RentalOffice implements Reportable {
    private static RentalOffice instance = null;
    private int officeID;
    private String locationZip;
    private Map<String, Inventory> inventories = new HashMap<>();
    private ArrayList<RentalOrder> orderHistory = new ArrayList<>();

    public RentalOffice(int officeID, String locationZip) {
        this.officeID = officeID;
        this.locationZip = locationZip;
    }

    public static RentalOffice getInstance(int officeID, String locationZip) {
        if (instance == null) {
            instance = new RentalOffice(officeID, locationZip);
        }
        return instance;
    }

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }

    public String getLocationZip() {
        return locationZip;
    }

    public void setLocationZip(String locationZip) {
        this.locationZip = locationZip;
    }

    public void addInventory(Inventory inventory) {
        VehicleType type = inventory.getType();
        if (!inventories.containsKey(type)) {
            inventories.put(String.valueOf(type), inventory);
        }
    }

    public void removeInventory(String type) {
        inventories.remove(type);
    }

    public ArrayList<Inventory> getInventories() {
        return new ArrayList<>(inventories.values());
    }

    public ArrayList<RentalOrder> getOrderHistory() {
        return orderHistory;
    }

    public void addOrder(RentalOrder order) {
        orderHistory.add(order);
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Rental Office Information:\n");
        report.append("Office ID: ").append(officeID).append("\n");
        report.append("Location Zip: ").append(locationZip).append("\n");
        report.append("Inventory:\n");
        for (Inventory inventory : inventories.values()) {
            report.append(inventory.generateReport()).append("\n");
        }
        report.append("Order History:\n");
        for (RentalOrder order : orderHistory) {
            report.append(order.generateReport()).append("\n");
        }
        return report.toString();
    }
}
