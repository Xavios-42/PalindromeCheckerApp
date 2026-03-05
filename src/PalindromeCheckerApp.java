import java.util.Random;

public class PalindromeCheckerApp {

    public static boolean isPalindromeReverse(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static boolean isPalindromeTwoPointer(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String s) {
        return checkRecursive(s, 0, s.length() - 1);
    }

    private static boolean checkRecursive(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return checkRecursive(s, left + 1, right - 1);
    }

    public static long measureTime(Runnable algorithm) {
        long start = System.nanoTime();
        algorithm.run();
        long end = System.nanoTime();
        return end - start;
    }

    public static String generateRandomPalindrome(int length) {
        Random rand = new Random();
        char[] chars = new char[length];
        for (int i = 0; i < length / 2; i++) {
            char c = (char) ('a' + rand.nextInt(26));
            chars[i] = c;
            chars[length - 1 - i] = c;
        }
        if (length % 2 == 1) {
            chars[length / 2] = (char) ('a' + rand.nextInt(26));
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "racecar",
                "madam",
                "hello",
                "level",
                generateRandomPalindrome(1000),
                generateRandomPalindrome(10000)
        };

        System.out.println("=== Palindrome Performance Comparison ===");

        for (String test : testStrings) {
            System.out.println("\nTest String Length: " + test.length());

            long timeReverse = measureTime(() -> isPalindromeReverse(test));
            long timeTwoPointer = measureTime(() -> isPalindromeTwoPointer(test));
            long timeRecursive = measureTime(() -> isPalindromeRecursive(test));

            System.out.println("Reverse Method:   " + timeReverse + " ns");
            System.out.println("Two-Pointer:      " + timeTwoPointer + " ns");
            System.out.println("Recursive Method: " + timeRecursive + " ns");
        }
    }
}