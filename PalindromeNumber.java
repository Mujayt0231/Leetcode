public class PalindromeNumber {

    public static void main(String[] args) {

        int x = 1012;
        int y = x % 10;

        System.out.println(y);

    }

    /*
     * Example 1:
     * 
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     * Example 2:
     * 
     * Input: x = -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it
     * becomes 121-. Therefore it is not a palindrome.
     * Example 3:
     * 
     * Input: x = 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */

    public boolean isPlaindrome(int x) {

        if (x < 0)
            return false;

        if (x != 0 && x % 10 == 0)
            return false;

        int reversed = 0;
        int original = x;

        while (x != 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }

        return original == reversed;
    }

}
