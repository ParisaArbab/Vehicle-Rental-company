package Q2;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer implements Reportable {
    private String name;
    private int CustomerID;
    private double discountRate;
    private List<RentalOrder> orders;

    public Customer(int ID, String name, double discountRate) {

        this.CustomerID = ID;
        this.name = name;
        this.discountRate = discountRate;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void addOrder(RentalOrder order) {
        orders.add(order);
    }
    public void removeOrder(RentalOrder order) {
        orders.remove(order);
    }


    public List<RentalOrder> getOrderHistory() {
        return orders;
    }

    public abstract String generateReport() ;

}
