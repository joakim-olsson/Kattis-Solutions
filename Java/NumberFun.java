import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class NumberFun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
            if (a + b == c ||
            Math.abs(a - b) == c ||
            a * b == c ||
            a / b == c ||
            b / a == c)
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
    }
}
