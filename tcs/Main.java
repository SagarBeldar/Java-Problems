import java.util.Scanner;

public class Main {
    public static int minSwapsToBeautiful(int[] arr, int n) {
        int as = 0, des = 0, temp;

        int[] ascArr = new int[n];
        int[] desArr = new int[n];
        for (int i = 0; i < n; i++) {
            ascArr[i] = arr[i];
            desArr[i] = arr[i];
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascArr[j] > ascArr[j + 1]) {
                    as++;
                    temp = ascArr[j];
                    ascArr[j] = ascArr[j + 1];
                    ascArr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (desArr[j] < desArr[j + 1]) {
                    des++;
                    temp = desArr[j];
                    desArr[j] = desArr[j + 1];
                    desArr[j + 1] = temp;
                }
            }
        }

        return (as < des) ? as : des;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = minSwapsToBeautiful(arr, N);
        System.out.println(result);
    }
}

