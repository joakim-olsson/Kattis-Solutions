import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 25/05/2020
 **/

public class SumSquaredDigitsFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();

        for (int i = 0; i < P; i++) {
            int K = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = 0;

            while (n > 0) {
                int d = n % b;
                sum += d * d;
                n = (n - d) / b;
            }
            System.out.println(K + " " + sum);
        }
    }
}
