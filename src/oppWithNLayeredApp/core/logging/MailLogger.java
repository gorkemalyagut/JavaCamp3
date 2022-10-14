package oppWithNLayeredApp.core.logging;

public class MailLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("Logged to email: "+ message);
    }
}
