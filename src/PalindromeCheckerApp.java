public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "rotor";
        System.out.println("Checking word: " + word);
        boolean isPalindrome = checkPalindrome(word, 0, word.length() - 1);
        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
    static boolean checkPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true; // base condition
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return checkPalindrome(word, start + 1, end - 1); // recursive call
    }
}