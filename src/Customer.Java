public class Customer {
    private String name;
    private int customerId;

    public Customer(String name, int id) {
        this.name = name;
        this.customerId = id;
    }

    public void display() {
        System.out.println("Customer Name: " + name + ", ID: " + customerId);
    }
}