import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 27/05/2020
 **/

public class JobExpenses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num < 0)
                ans -= num;
        }
        System.out.println(ans);
    }
}
