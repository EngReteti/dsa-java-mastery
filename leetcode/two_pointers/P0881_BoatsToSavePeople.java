package leetcode.two_pointers;

import java.util.Arrays;

public class P0881_BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            boats++;
        }

        return boats;
    }

    public static void main(String[] args) {
        P0881_BoatsToSavePeople solver = new P0881_BoatsToSavePeople();
        int[] people = {3, 2, 2, 1};
        int limit = 3;

        System.out.println(solver.numRescueBoats(people, limit));
        // Expected output: 3
    }
}
