//RentalOrder class represents a rental transaction
package Q2;
public class RentalOrder {
    private double totalCost;
    private Customer customer;
    private Vehicle vehicle;
    private int rentalLength;

//The RentalOrder class should also have multiple constructors:
    //1- RentalOrder  rents a vehicle for one day by default
    public RentalOrder(Customer customer, Vehicle vehicle) {

        this(customer, vehicle, 1);
    }


    // 2- rents a vehicle for a specified number of days
    public RentalOrder(Customer customer, Vehicle vehicle, int rentalLength) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalLength = rentalLength;
        calculateTotalCost();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getRentalLength() {
        return rentalLength;
    }

    public void calculateTotalCost() {
        double baseRate = vehicle.getDailyRate() * rentalLength;
        double discount = baseRate * customer.getDiscountRate()/100;
        totalCost = baseRate - discount;
    }
//completeOrder() add the order to the orderHistory of the customer
// and the office and make the vehicle unavailable for rent
    public void completeOrder() {
        customer.addOrder(this);
        vehicle.setAvailable(false);
        RentalOffice.getInstance(1,"60604").addOrder(this);
    }

    public String generateReport() {
        String report = "Rental Order Report\n" +
                "--------------------------\n" +
                "Customer ID: " + customer.getCustomerID() + "\n" +
                "Customer Name: " + customer.getName() + "\n" +
                "Vehicle ID: " + vehicle.getVehicleID() + "\n" +
                "Vehicle Type: " + vehicle.getType() + "\n" +
                "Rental Length: " + rentalLength + " days\n" +
                "Daily Rental Rate: $" + vehicle.getDailyRate() + "\n" +
                "Discount Rate: " + customer.getDiscountRate() / 100 + "%\n" +
                "Total Rental Cost: $" + totalCost + "\n";
        return report;
    }
}