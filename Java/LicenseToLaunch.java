import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class LicenseToLaunch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < min) {
                min = num;
                minIndex = i;
            }
        }
        System.out.println(minIndex);
    }
}
