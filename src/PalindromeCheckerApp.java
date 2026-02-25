public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String phrase = "A man a plan a canal Panama";
        System.out.println("Checking phrase: " + phrase);
        String normalized = phrase.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = checkPalindrome(normalized);
        if (isPalindrome) {
            System.out.println("Result: \"" + phrase + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("Result: \"" + phrase + "\" is NOT a palindrome.");
        }
    }
    static boolean checkPalindrome(String word) {
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