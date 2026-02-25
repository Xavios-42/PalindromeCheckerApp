public class Main {
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("   Welcome to PalindromeChecker App");
        System.out.println("   Version: 1.0");
        System.out.println("=======================================");

        // Flow control: program continues or exits
        System.out.println("Application started successfully...");
        System.out.println("Ready for next use case (Palindrome validation).");

        System.out.println("\n=======================================\n");

        String word = "madam";
        System.out.println("Checking word: " + word);
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }
        System.out.println("Program finished.");
    }
}