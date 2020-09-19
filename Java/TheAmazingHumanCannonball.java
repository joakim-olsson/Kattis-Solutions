import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 24/05/2020
 **/

public class TheAmazingHumanCannonball {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double v0 = sc.nextDouble();
            double degree = sc.nextDouble() / 180 * Math.PI;
            double x1 = sc.nextDouble();
            double h1 = sc.nextDouble() + 1;
            double h2 = sc.nextDouble() - 1;

            double t = x1 / (Math.cos(degree)*v0);
            double yPos = v0*t*Math.sin(degree)-0.5*9.81*t*t;
            System.out.println(yPos >= h1 && yPos <= h2 ? "Safe" : "Not Safe");
        }
    }
}
