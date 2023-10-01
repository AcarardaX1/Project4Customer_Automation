public class Main_1 {

        Logger[] loggers = {new SmsLogger(), new Email_Logger(), new FileLogger(), new Database_Logger()}; // Each element will be perfomed because it's been labelled as of their namesakes

        //CustomerManager customerManager = new CustomerManager(new SmsLogger());//Intended to demonstrate SmsLogger just for entering for the SMS to Customer Class
        //CustomerManager customerManager = new CustomerManager(new Database()); for an example for Database production
        //The running and compiling of the code depends which function or database/interface is indicated(Above, it is SmsLogger to utilize the SMS operations)
        Customer Arda = new Customer(1658, "ARDA", "ACAR"); //Sample for indicating the specs of the customer(s). Reitarates fundamentally.

        customerManager.add(Arda); //Second customer manager class function that methods and organizes the code.

}
