import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "level";
        System.out.println("Checking word: " + word);
        PalindromeStrategy strategy;
        strategy = new StackStrategy();
        boolean isPalindrome = strategy.checkPalindrome(word);
        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}
class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return word.equals(reversed);
    }
}
class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String word) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : word.toCharArray()) {
            deque.add(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}