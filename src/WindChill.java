import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter t : ");
        double t = sc.nextDouble();
        System.out.println("Enter v : ");
        double v = sc.nextDouble();
        double windChill = 35.74 + (0.6215 * t) + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind Chill = " + windChill);

    }
}
