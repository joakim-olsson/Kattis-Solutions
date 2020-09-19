import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 20/05/2020
 **/

public class Sibice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();
        double limit = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));

        for (int i = 0; i < N; i++) {
            if (sc.nextInt() <= limit)
                System.out.println("DA");
            else
                System.out.println("NE");
        }
    }
}
