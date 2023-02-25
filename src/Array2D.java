import java.util.Scanner;

public class Array2D  {

    private static void print2DArray(int[][] arr) {
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void takeInputIn2D(int[][] arr) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers in 2d array");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int m=sc.nextInt();
        System.out.print("Enter no of columns : ");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        takeInputIn2D(arr);
        print2DArray(arr);
    }
}
