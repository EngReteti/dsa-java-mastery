package sorting;

import java.util.Arrays;

/**
 * Advanced Sorting: Quick Sort (Divide and Conquer)
 * Logic: Pick a 'pivot' and partition the array around it.
 */
public class QuickSort {
    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            // partitionIdx is the index where the pivot is now in its correct place
            int partitionIdx = partition(arr, low, high);

            // Recursively sort elements before and after partition
            sort(arr, low, partitionIdx - 1);
            sort(arr, partitionIdx + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] data = {10, 80, 30, 90, 40, 50, 70};
        sort(data, 0, data.length - 1);
        System.out.println("Quick Sort Result: " + Arrays.toString(data));
    }
}
