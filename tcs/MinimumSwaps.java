import java.util.*;

public class MinimumSwaps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of elements in the array
        int number = scanner.nextInt();
        // Input: Array of integers
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate minimum swap operations
        int swaps = calculateMinSwaps(arr);

        // Output: Minimum swap operations required
        System.out.println(swaps);

        scanner.close();
    }

    private static int calculateMinSwaps(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        // Create a copy of the original array and sort it
        int[] sortedArr = Arrays.copyOf(arr, n);
        Arrays.sort(sortedArr);

        // Create a map to store the indices of elements in the original array
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        // Iterate through the original array and perform swaps
        for (int i = 0; i < n; i++) {
            // If the element is not in its correct position
            if (arr[i] != sortedArr[i]) {
                swaps++;

                // Swap the elements in the original array
                int correctValue = sortedArr[i];
                int currentIndex = indexMap.get(correctValue);

                // Update the map
                indexMap.put(arr[i], currentIndex);
                indexMap.put(correctValue, i);

                // Swap elements in the original array
                swap(arr, i, currentIndex);
            }
        }

        return swaps;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
