package oppWithNLayeredApp.core.logging;

public class ConsoleLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("Logged to console: "+ message);
    }
}
