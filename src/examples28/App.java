package examples28;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager();
        customerManager.addCustomer();
        customerManager.deleteCustomer();
        customerManager.updateCustomer();
    }

}