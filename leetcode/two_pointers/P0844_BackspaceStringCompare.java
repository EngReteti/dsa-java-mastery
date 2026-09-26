package leetcode.two_pointers;

public class P0844_BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {
            i = findNextValidIndex(s, i);
            j = findNextValidIndex(t, j);

            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
            } else if (i >= 0 || j >= 0) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }

    private int findNextValidIndex(String s, int index) {
        int skip = 0;

        while (index >= 0) {
            if (s.charAt(index) == '#') {
                skip++;
                index--;
            } else if (skip > 0) {
                skip--;
                index--;
            } else {
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        P0844_BackspaceStringCompare solver = new P0844_BackspaceStringCompare();
        String s = "ab#c";
        String t = "ad#c";

        System.out.println(solver.backspaceCompare(s, t));
        // Expected output: true
    }
}
