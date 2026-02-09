package sorting;

import java.util.Arrays;

/**
 * Iterative Sorting: Selection Sort
 * Logic: Find the smallest element in the unsorted part and swap it to the front.
 */
public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the first unsorted element is the minimum
            int minIdx = i;

            // Search the rest of the array for a smaller value
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum with the first unsorted element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {29, 10, 14, 37, 13};
        sort(data);
        System.out.println("Selection Sort Result: " + Arrays.toString(data));
    }
}
