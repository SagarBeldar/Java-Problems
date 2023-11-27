package tc;

import java.util.Scanner;

public class main {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] data = new int[size];
        int[] data1 = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
            data1[i] = data[i];
        }
        bubbleSort_descend(data, size);
        bubbleSort_ascend(data1, size);
        if (count_desc > count_asc)
            System.out.println(count_asc);
        else
            System.out.println(count_desc);
    }
    
    static int count_desc = 0;
    static int count_asc = 0;    

    public static void bubbleSort_descend(int[] array, int size) {
        for (int step = 0; step < size - 1; ++step) {
            for (int i = 0; i < size - step - 1; ++i) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count_desc++;
                }
            }
        }
    }

    public static void bubbleSort_ascend(int[] array, int size) {
        for (int step = 0; step < size - 1; ++step) {
            for (int i = 0; i < size - step - 1; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count_asc++;
                }
            }
        }
    }

   
}


