package Practice_que_DSA;

public class seclargeElement {
    public static void main(String[] args) {
        int numbers[] = { 12, 39, 84, 5, 7, 3, 10, 12 };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // Second largest value
                // if(numbers[i]<numbers[j])

                // second min. value
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(numbers[1]);
    }
}
