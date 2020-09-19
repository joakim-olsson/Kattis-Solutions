import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 09/06/2020
 **/

public class JohnnyApplesack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = Double.valueOf(sc.nextInt());
        int K = sc.nextInt();
        int ans = 1;

        while (N > K) {
            ans++;
            N -= Math.ceil(N/K);
        }

        ans += N;
        System.out.println(ans);
    }
}
