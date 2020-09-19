import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 31/05/2020
 **/

public class MixedFractions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A == 0 && B == 0)
                return;
            System.out.println(A/B + " " + A%B + " / " + B);
        }
    }
}
