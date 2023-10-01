import java.util.logging.Logger;

public class Customer_Manager {
    public void add() {

        System.out.println("Customer Added");
        Database_Logger logger = new Database_Logger();
        logger.log();


    }
}
