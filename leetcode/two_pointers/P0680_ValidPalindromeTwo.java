package leetcode.two_pointers;

public class P0680_ValidPalindromeTwo {

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindromeRange(s, left + 1, right) || isPalindromeRange(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindromeRange(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        P0680_ValidPalindromeTwo solver = new P0680_ValidPalindromeTwo();
        String s = "abca";

        System.out.println(solver.validPalindrome(s));
        // Expected output: true
    }
}
