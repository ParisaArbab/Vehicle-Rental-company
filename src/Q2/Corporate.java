package Q2;

public class Corporate extends Customer implements Reportable {
    private String country;
    private String taxID;

    public Corporate(int id, String name, double discountRate, String country, String taxID) {
        super(id, name, discountRate);
        this.country = country;
        this.taxID = taxID;
    }

    public String getCountry() {
        return country;
    }

    public String getTaxID() {
        return taxID;
    }

    @Override
    public String generateReport() {
        String report = "Corporate Customer Report\n" +
                "--------------------------\n" +
                "ID: " + getCustomerID() + "\n" +
                "Name: " + getName() + "\n" +
                "Discount Rate: " + getDiscountRate() + "\n" +
                "Country: " + country + "\n" +
                "Tax ID: " + taxID + "\n" +
                "Order History: \n";
        for (RentalOrder order : getOrderHistory()) {
            report += "------------------\n" + order.generateReport();
        }

        return report;
    }
}