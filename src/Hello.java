import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hello {
    public static void main(String[] args) {
        // Display a greeting message
        System.out.println("Hello, GitHub! This is my first uploaded Java program.");

        // Get and format the current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Current Date and Time: " + now.format(formatter));
    }
}
