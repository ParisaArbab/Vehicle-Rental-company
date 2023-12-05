package Q2;

public class Individual extends Customer implements Reportable {
    private int age;
    private String state;
    private String zip;

    public Individual(int id, String name, double discountRate, int age, String state, String zip) {
        super(id, name, discountRate);
        this.age = age;
        this.state = state;
        this.zip = zip;
    }

    public int getAge() {
        return age;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public String generateReport() {
        String report = "Individual Customer Report\n" +
                "--------------------------\n" +
                "ID: " + getCustomerID() + "\n" +
                "Name: " + getName() + "\n" +
                "Discount Rate: " + getDiscountRate() + "\n" +
                "State: " + state + "\n" +
                "Zip Code: " + zip + "\n" +
                "Order History: \n";
        for (RentalOrder order : getOrderHistory()) {
            report += "------------------\n" + order.generateReport();
        }
        return report;
    }
}
