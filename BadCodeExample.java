// TestProject.java
public class TestProject {
    public static void main(String[] args) {
        System.out.println("Welcome to Test Project!");
        
        // Create an instance of TestClass
        TestClass testInstance = new TestClass();
        
        // Call the method from TestClass
        testInstance.printMessage();
    }
}

// TestClass.java
public class TestClass {
    public void printMessage() {
        System.out.println("This is a message from TestClass.");
    }
}
