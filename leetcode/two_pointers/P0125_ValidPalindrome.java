package leetcode.two_pointers;

public class P0125_ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        P0125_ValidPalindrome solver = new P0125_ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";

        System.out.println(solver.isPalindrome(s));
        // Expected output: true
    }
}
