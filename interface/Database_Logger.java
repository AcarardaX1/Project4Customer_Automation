import java.security.MessageDigestSpi;

public class Database_Logger implements logger{
    @Override
    public void log(String message) {

        System.out.println("Database Logged: " + message);

    }
}
