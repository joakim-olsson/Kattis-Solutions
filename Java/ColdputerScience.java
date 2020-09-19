import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 23/05/2020
 **/

public class ColdputerScience {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() < 0)
                ans++;
        }
        System.out.println(ans);
    }
}
