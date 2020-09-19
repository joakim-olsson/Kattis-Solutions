import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 20/05/2020
 **/

public class Tarifa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += X;
            ans -= sc.nextInt();
        }
        System.out.println(ans+X);
    }
}
