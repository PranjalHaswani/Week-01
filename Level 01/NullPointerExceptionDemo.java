public class NullPointerExceptionDemo {

    // Method to generate a NullPointerException
    public static void generateNullPointerException() {
        String text = null;  // Initializing the string variable to null
        
        // Trying to call a method on a null object will throw NullPointerException
        System.out.println(text.length());  // This will throw the exception
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;  // Initializing the string variable to null
        
        try {
            System.out.println(text.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot call method on null object.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in main method.");
        }

        System.out.println("\nDemonstrating handling of NullPointerException:");

        handleNullPointerException();
    }
}
