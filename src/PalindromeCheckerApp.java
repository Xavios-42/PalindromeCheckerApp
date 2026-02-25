public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "deified";
        System.out.println("Checking word: " + word);
        PalindromeChecker checker = new PalindromeChecker();
        boolean isPalindrome = checker.checkPalindrome(word);
        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}
class PalindromeChecker {
    public boolean checkPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}