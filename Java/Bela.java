import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 23/05/2020
 **/

public class Bela {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() * 4;
        char B = sc.next().charAt(0);
        int ans = 0;

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            char num = s.charAt(0);
            char suit = s.charAt(1);
            switch (num) {
                case 'A':
                    ans += 11;
                    break;
                case 'K':
                    ans += 4;
                    break;
                case 'Q':
                    ans += 3;
                    break;
                case 'J':
                    ans += suit == B ? 20 : 2;
                    break;
                case 'T':
                    ans += 10;
                    break;
                case '9':
                    ans += suit == B ? 14 : 0;
                    break;
            }
        }
        System.out.println(ans);
    }
}
