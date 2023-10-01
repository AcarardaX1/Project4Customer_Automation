public class Utilizer {

    public static void runLoggers(Logger[] loggers, String message_) {

        for(Logger logger: loggers) {
            logger.log(message_); //Attribution to top in case of change in message_
        }

    }
}

