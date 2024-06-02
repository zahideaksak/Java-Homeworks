package examples42_43;

public class OracleCustomerDAL implements ICustomerDAL{
    @Override
    public void add() {
        System.out.println("Added to Oracle database.");
    }
}