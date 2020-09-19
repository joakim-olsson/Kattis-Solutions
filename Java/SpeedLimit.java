import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 20/05/2020
 **/

public class SpeedLimit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1)
                return;

            int ans = 0;
            int tPrev = 0;

            for (int i = 0; i < n; i++) {
                int s = sc.nextInt();
                int t = sc.nextInt();
                ans += s * (t - tPrev);
                tPrev = t;
            }
            System.out.println(ans + " miles");
        }
    }
}

