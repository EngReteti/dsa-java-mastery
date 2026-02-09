package searching;

/**
 * Linear Search: The baseline search method.
 * Logic: Check every element one by one until a match is found.
 */
public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] data = {10, 50, 30, 70, 80, 20, 90, 40}; // Works on unsorted data!
        int target = 20;
        int result = search(data, target);
        System.out.println("Element found at index: " + result);
    }
}
