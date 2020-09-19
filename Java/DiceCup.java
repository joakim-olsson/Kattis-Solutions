import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 23/05/2020
 **/

public class DiceCup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N == M) {
            System.out.println((N + M) / 2 + 1);
            return;
        }

        int upper = Math.max(N, M) + 1;
        int lower = Math.min(N, M) + 1;

        for (int i = lower; i <= upper; i++) {
            System.out.println(i);
        }
    }
}
