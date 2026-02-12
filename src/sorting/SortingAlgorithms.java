import java.util.Arrays;

public class SortingAlgorithms {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
                }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIdx]) minIdx = j;
            int temp = arr[minIdx]; arr[minIdx] = arr[i]; arr[i] = temp;
        }
    }

    // Note: To keep this slow and clear, we will demonstrate 
    // Bubble and Selection first as per the primary list.
    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        System.out.println("Original: " + Arrays.toString(arr1));
        bubbleSort(arr1);
        System.out.println("Sorted (Bubble): " + Arrays.toString(arr1));
    }
}
