package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] arr) {
        if (arr.length < 2) return; // Base Case: Array of size 1 is already sorted

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursive Step: Sort the two halves
        sort(left);
        sort(right);

        // Combine: Merge the sorted halves
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] data = {38, 27, 43, 3, 9, 82, 10};
        sort(data);
        System.out.println("Merge Sort Result: " + Arrays.toString(data));
    }
}
