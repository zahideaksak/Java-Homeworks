package examples42_43;

public class Main {
    public static void main(String[] args) {
        ICustomerDAL customerDAL = new MySqlCustomerDAL();
        CustomerManager customerManager = new CustomerManager(customerDAL);
        customerManager.add();
    }
}