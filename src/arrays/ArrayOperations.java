import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // 1. TRAVERSE
        System.out.println("Original: " + Arrays.toString(numbers));

        // 2. SEARCH (Linear Search)
        int target = 30;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found " + target + " at index: " + i);
            }
        }

        // 3. INSERTION (At the end)
        // Since arrays are fixed size, we create a new one with size + 1
        int[] newArray = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        newArray[newArray.length - 1] = 60; // Inserting 60
        System.out.println("After Insertion: " + Arrays.toString(newArray));

        // 4. DELETION (Removing index 1 - the value 20)
        int[] afterDelete = new int[newArray.length - 1];
        int skipIndex = 1;
        for (int i = 0, k = 0; i < newArray.length; i++) {
            if (i == skipIndex) continue;
            afterDelete[k++] = newArray[i];
        }
        System.out.println("After Deletion: " + Arrays.toString(afterDelete));
    }
}
