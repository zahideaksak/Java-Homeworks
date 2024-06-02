package examples42_43;

public class CustomerManager {
    ICustomerDAL customerDAL;

    public CustomerManager(ICustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }

    public void add() {
        customerDAL.add();
    }
}
