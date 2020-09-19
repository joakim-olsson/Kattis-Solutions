import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 07/06/2020
 **/

public class Ptice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] in = sc.next().toCharArray();
        int[] A = new int[]{'A', 'B', 'C'};
        int[] B = new int[]{'B', 'A', 'B', 'C'};
        int[] C = new int[]{'C', 'C', 'A', 'A', 'B', 'B'};
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < N; i++) {
            if (A[i % 3] == in[i])
                a++;
            if (B[i % 4] == in[i])
                b++;
            if (C[i % 6] == in[i])
                c++;
        }

        int max = Math.max(a, Math.max(b, c));
        System.out.println(max);

        if (max == a)
            System.out.println("Adrian");
        if (max == b)
            System.out.println("Bruno");
        if (max == c)
            System.out.println("Goran");
    }
}
