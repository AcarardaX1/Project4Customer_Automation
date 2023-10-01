public class SmsLogger {
    public class SmsLogger implements Logger {
        @Override

        public void log(String message) {
            System.out.println("SMS sent: " + message);

        }

    }

}
