package Array;

public class maxarraysum {

    public static void maxsubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                 currSum = 0;
                for (int k = i; k <= j; k++) {
                 currSum=currSum+numbers[k];              
                }
                System.out.print(currSum+" ");
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Total maxSum array is "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxsubarraySum(numbers);
    }
}
