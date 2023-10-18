import java.util.*;

public class tcs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the distinct natural numbers
        System.out.print("Enter distinct natural numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        int q = Integer.MAX_VALUE;
        int p = 2; // Starting with the smallest prime number

        // Find the smallest natural number (q)
        for (String num : numbers) {
            int currentNum = Integer.parseInt(num);
            if (currentNum < q) {
                q = currentNum;
            }
        }

        // Check for the smallest prime (p) satisfying the condition
        while (true) {
            boolean satisfiesCondition = true;

            for (String num : numbers) {
                int currentNum = Integer.parseInt(num);
                if (currentNum != q && p % currentNum != q) {
                    satisfiesCondition = false;
                    break;
                }
            }

            if (satisfiesCondition) {
                break;
            }

            p++; // Try the next prime number
        }

        System.out.println("The smallest prime number (p) is: " + p);
    }
}