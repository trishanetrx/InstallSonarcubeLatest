import java.util.Scanner;

public class GoodCodeExample {

    public static void main(String[] args) {
        int x = 5; // Variable used in the future

        try {
            // Code that may throw an exception
        } catch (Exception e) {
            e.printStackTrace(); // Proper exception handling
        }

        // Use environment variables or secure storage for passwords
        String password = getPasswordFromUser();

        // Use a more efficient loop if possible
        for (int i = 0; i < 10; i++) {
            // Code that can be optimized
        }

        // Simplify nested logic
        if (true) {
            if (true) {
                if (true) {
                    // Code block
                }
            }
        }

        duplicateMethod(); // Code reuse
    }

    // Define a method for reusable code
    public static void duplicateMethod() {
        // Duplicate code block
    }

    // Method to get password securely
    private static String getPasswordFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        return scanner.nextLine();
    }
}
