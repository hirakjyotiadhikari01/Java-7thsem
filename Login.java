// Write a program in java which will create a login page which will allowed incorrect user ID and password maximum 3 times
import java.util.Scanner;

public class Login {
    private static final String USERNAME = "Hirak";
    private static final String PASSWORD = "1234";
    private static int attempts = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (attempts < 3) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                System.out.println("Login successful!");
                return;
            } else {
                attempts++;
                System.out.println("Invalid username or password. Attempts remaining: " + (3 - attempts));
            }
        }

        System.out.println("Maximum attempts reached. Login failed.");
    }
}