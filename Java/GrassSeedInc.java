import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 22/05/2020
 **/

public class GrassSeedInc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        int L = sc.nextInt();
        double ans = 0;

        for (int i = 0; i < L; i++) {
            ans += sc.nextDouble() * sc.nextDouble();
        }
        System.out.println(ans * c);
    }
}
