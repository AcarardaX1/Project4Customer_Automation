public class Email_Logger  implements Logger{

    @Override
    public void log(String e_mail) { //Automatically sends the mail
        System.out.println("E-mail sent: " + e_mail);
    }
}
