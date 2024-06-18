package homeworks.b3;

public class Main {
    public static boolean isPalindrome(String input) {
        // Preprocess the string: convert to lowercase and remove non-alphanumeric characters
        String processedString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int length = processedString.length();
        MyQueue queue1 = new MyQueue(length);
        MyQueue queue2 = new MyQueue(length);

        // Add characters to both queues
        for (char ch : processedString.toCharArray()) {
            queue1.enqueue(String.valueOf(ch));
            queue2.enqueue(String.valueOf(ch));
        }

        // Compare elements from the start of queue1 and end of queue2
        for (int i = 0; i < length; i++) {
            if (!queue1.peek(i).equals(queue2.peek(length - 1 - i))) {
                return false; // If any pair of elements is not equal, it's not a palindrome
            }
        }

        return true; // If all pairs are equal, it's a palindrome
    }
    public static void main(String[] args) {
        String testString = "Able was I ere I saw Elba";
        if (isPalindrome(testString)) {
            System.out.println("\"" + testString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testString + "\" is not a palindrome.");
        }
    }
}
