import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 30/05/2020
 **/

public class TransitWoes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int n = sc.nextInt();
        int[] d = new int[n+1];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i <= n; i++) {
            d[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int curr = s;

        for (int i = 0; i < d.length-1; i++) {
            curr += d[i];
            while (curr % c[i] != 0)
                curr++;
            curr += b[i];
        }
        curr += d[d.length-1];
        System.out.println(curr <= t ? "yes" : "no");
    }
}
