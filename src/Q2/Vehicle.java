package Q2;

public class Vehicle {
    private int vehicleID;
    private String make;
    private String model;
    private int year;
    private int mileage;
    private VehicleType type;
    private boolean available;
    private double dailyRate;

    public Vehicle(int vehicleID, String make, String model, int year, int mileage, VehicleType type, double dailyRate) {
        setVehicleID(vehicleID);
        setMake(make);
        setModel(model);
        setYear(year);
        setMileage(mileage);
        setType(type);
        setAvailable(true);
        setDailyRate(dailyRate);
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Vehicle ID: ").append(vehicleID).append("\n");
        report.append("Make: ").append(make).append("\n");
        report.append("Model: ").append(model).append("\n");
        report.append("Year: ").append(year).append("\n");
        report.append("Mileage: ").append(mileage).append("\n");
        report.append("Type: ").append(type).append("\n");
        report.append("Available: ").append(available).append("\n");
        report.append("Daily Rate: ").append(dailyRate).append("\n");
        return report.toString();
    }
}
