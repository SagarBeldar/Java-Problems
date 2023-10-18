import java.util.Arrays;

public class JugFilling {
    public static void main(String[] args) {
        int L = 10; // Jug capacity in liters
        int[] cups = {5, 3, 2, 1}; // Array of cup capacities

        Arrays.sort(cups); // Sort the cup capacities in descending order

        int[] result = fillJug(L, cups);

        if (result[0] == -1) {
            System.out.println("Jug cannot be filled as per the specifications.");
        } else {
            System.out.println("The Jug can be filled with the following cup counts:");
            for (int i = 0; i < cups.length; i++) {
                if (result[i] > 0) {
                    System.out.println(cups[i] + "L Cup: " + result[i] + " times");
                }
            }
        }
    }

    public static int[] fillJug(int L, int[] cups) {
        Arrays.sort(cups); // Sort the cup capacities in ascending order
        int n = cups.length;
        int[] counts = new int[n]; // Array to store the counts of each cup

        int remainingCapacity = L;
        int maxCupIndex = n - 1;

        while (remainingCapacity > 0 && maxCupIndex >= 0) {
            int cup = cups[maxCupIndex];

            int maxCupsToFit = remainingCapacity / cup;
            counts[maxCupIndex] = maxCupsToFit;

            remainingCapacity -= maxCupsToFit * cup;
            maxCupIndex--;
        }

        if (remainingCapacity == 0) {
            return counts;
        } else {
            int[] errorResult = {-1};
            return errorResult;
        }
    }
}
