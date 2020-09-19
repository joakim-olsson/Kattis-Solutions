import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 30/05/2020
 **/

public class ToLower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int T = sc.nextInt();
        int ans = 0;
        while (P-- > 0) {
            int temp = T;
            boolean higher = false;
            while (temp-- > 0) {
                char[] in = sc.next().toCharArray();
                for (int i = 1; i < in.length; i++) {
                    if (in[i] < 'a') {
                        higher = true;
                        break;
                    }
                }
            }
            if (!higher)
                ans++;
        }
        System.out.println(ans);
    }
}
