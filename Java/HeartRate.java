import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class HeartRate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int b = sc.nextInt();
            double p = sc.nextDouble();
            double apm = 60*b/p;

            System.out.println(apm - 60/p + " " + apm + " " + (apm + 60/p));
        }
    }
}
