import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 18/05/2020
 **/

public class Pot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < N; i++) {
            int nextNum = sc.nextInt();
            int power = nextNum % 10;
            int num = nextNum / 10;
            ans += Math.pow(num, power);
        }
        System.out.println(ans);
    }
}
