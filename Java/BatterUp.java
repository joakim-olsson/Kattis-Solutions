import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 24/05/2020
 **/

public class BatterUp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bases = 0;
        int numBats = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num != -1) {
                bases += num;
                numBats++;
            }
        }
        System.out.println((double) bases / numBats);
    }
}
