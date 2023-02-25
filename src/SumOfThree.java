import java.util.Arrays;
import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of numbers : ");
        int[] arr = new int[sc.nextInt()];
        System.out.print("Enter numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int distinctCount = 0;
        for (int k = 0; k < arr.length - 2; k++) {
            if(k>0 && arr[k]==arr[k-1])
                continue;
            int findSum = -arr[k];
            int i = k + 1, j = arr.length - 1;
            while (i < j) {
                if (arr[i] + arr[j] == findSum) {
                    System.out.println(arr[k] + ", " + arr[i] + ", " + arr[j]);
                    i++;
                    j--;
                    distinctCount++;
                } else if (arr[i] + arr[j] > findSum) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        System.out.println("No of distinct triplets = " + distinctCount);
    }
}
