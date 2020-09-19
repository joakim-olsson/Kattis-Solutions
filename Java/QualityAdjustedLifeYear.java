import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class QualityAdjustedLifeYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double ans = 0;
        for (int i = 0; i < N; i++) {
            ans += sc.nextDouble() * sc.nextDouble();
        }
        System.out.println(ans);
    }
}
