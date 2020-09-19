import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 08/06/2020
 **/

public class AListGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int ans = 0;

        while (X % 2 == 0) {
            X /= 2;
            ans++;
        }

        for (int i = 3; i <= Math.sqrt(X); i += 2) {
            while (X % i == 0) {
                X /= i;
                ans++;
            }
        }

        if (X > 2)
            ans++;

        System.out.println(ans);
    }
}
