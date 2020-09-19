import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 07/06/2020
 **/

public class Relocation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N+1];

        for (int i = 1; i <= N; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < Q; i++) {
            int t = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (t == 1)
                arr[a] = b;
            else
                System.out.println(Math.abs(arr[a] - arr[b]));
        }
    }
}
