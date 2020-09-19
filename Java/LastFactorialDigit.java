import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class LastFactorialDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int ans = 1;
            for (int j = N; j > 0; j--) {
                ans *= j;
            }
            System.out.println(ans % 10);
        }
    }
}
