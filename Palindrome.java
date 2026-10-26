
public class Palindrome {

    public static boolean isPalindrome(String str) {
        boolean isEqual = false;
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) {
            isEqual = true;
        }
        return isEqual;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number to check");
            return;
        }
        String word = args[0];

        if (isPalindrome(word)) {
            System.out.println("the given word: " + word + " is a plaindrome");
        } else {
            System.out.println("The given word:" + word + " is not palindrome");
        }
    }
}
