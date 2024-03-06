import java.util.Scanner; // Unused import

public class BadCodeExample {

    public static void main(String[] args) {
        int x = 5; // Unused variable

        try {
            // Code that may throw an exception
        } catch (Exception e) {
            // Empty catch block
        }

        String password = "mySecretPassword"; // Hardcoded password

        for (int i = 0; i < 10; i++) { // Inefficient loop
            // Code that can be optimized
        }

        if (true) { // Complex nested logic
            if (true) {
                if (true) {
                    // Code block
                }
            }
        }

        duplicateMethod(); // Code duplication
        duplicateMethod(); // Code duplication

        try {
            // Code that may throw an exception
        } catch (Exception e) {
            // Ignoring the exception without logging or handling
        }
    }

    public static void duplicateMethod() {
        // Duplicate code block
    }

}
