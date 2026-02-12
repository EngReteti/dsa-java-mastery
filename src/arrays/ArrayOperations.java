import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // 1. Traversal Logic (Printing every element)
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("1. Traversal: ");
        for(int i : arr) System.out.print(i + " ");
        System.out.println();

        // 2. Search Logic (Finding an index)
        int target = 30;
        int foundIndex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("2. Search: Found " + target + " at index " + foundIndex);

        // 3. Insertion Logic (Adding to the end)
        int[] insertedArr = new int[6];
        System.arraycopy(arr, 0, insertedArr, 0, 5);
        insertedArr[5] = 60;
        System.out.println("3. Insertion: Added 60 -> " + Arrays.toString(insertedArr));

        // 4. Deletion Logic (Removing an element)
        int[] deletedArr = {10, 30, 40, 50, 60}; 
        System.out.println("4. Deletion: Removed 20 -> " + Arrays.toString(deletedArr));
    }
}
