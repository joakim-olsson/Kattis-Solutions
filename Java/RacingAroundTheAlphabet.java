import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 01/06/2020
 **/

public class RacingAroundTheAlphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";
        int N = sc.nextInt();
        sc.nextLine();

        while (N-- > 0) {
            char[] in = sc.nextLine().toCharArray();
            double ans = 0;
            int prev = alpha.indexOf(in[0]);

            for (int i = 1; i < in.length; i++) {
                int curr = alpha.indexOf(in[i]);
                int dist = Math.abs(prev - curr);
                ans += Math.min(dist, alpha.length()-dist);
                prev = curr;
            }
            System.out.println(Math.PI * ans / 7 + in.length);
        }
    }
}
