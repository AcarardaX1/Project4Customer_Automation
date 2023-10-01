public class CustomerManager {

    private Logger loggers;

    public CustomerManager (Logger loggers){
        this.logger = loggers;

    }

    public void add(Customer customer) {
        System.out.println("Custommer added" + customer.getFirstName());

        //this.logger.log(customer.getFirstName()); can be used just for one logger indication

        //for(Logger logger: loggers) {
            //logger.log(customer.getFirstName()); // In this way, we shall observe the multiple elements on Logger Array to complete multi-functional operations
        //}

        Utilizer.runLoggers(loggers, customer.getFirstName());//calling the first name under the Utilizer class

    }

    public void delete(Customer customer) {
        System.out.println("Custommer deleted" + customer.getFirstName());

        //this.logger.log(customer.getFirstName()); can be used just for one logger indication

        //for(Logger logger: loggers) {
            //logger.log(customer.getFirstName());
        //}

        Utilizer.runLoggers(loggers, customer.getLastName()); //Same at 20


    }


}
