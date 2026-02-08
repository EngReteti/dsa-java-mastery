public class ArrayOperations {
    public static void main(String[] args) {
        // 1. Traverse: Printing all elements
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("--- Array Traversal ---");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 2. Search: Linear Search logic
        int target = 30;
        System.out.println("\n\n--- Searching for " + target + " ---");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found " + target + " at index: " + i);
            }
        }
    }
}

