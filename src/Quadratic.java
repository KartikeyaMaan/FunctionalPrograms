import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        int delta = b * b - 4 * b * c;
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Root 1 of x = " + root1);
        System.out.println("Root 2 of x = " + root2);
    }
}
