public class SearchAlgorithms {
    
    // Linear Search: Scans every element. O(n)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search: Divide and Conquer. O(log n)
    // Requires a sorted array.
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50}; 
        int target = 40;

        System.out.println("Target Value: " + target);
        System.out.println("--- Execution ---");
        System.out.println("Linear Search Found at Index: " + linearSearch(data, target));
        System.out.println("Binary Search Found at Index: " + binarySearch(data, target));
    }
}
