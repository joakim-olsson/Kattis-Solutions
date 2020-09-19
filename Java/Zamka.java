import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 24/05/2020
 **/

public class Zamka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();

        for (int i = L; i <= D; i++) {
            if (numSum(i) == X) {
                System.out.println(i);
                break;
            }
        }
        for (int i = D; i >= L; i--) {
            if (numSum(i) == X) {
                System.out.println(i);
                return;
            }
        }
    }

    public static int numSum(int num) {
        int numSum = 0;
        while (num > 0) {
            numSum += num % 10;
            num /= 10;
        }
        return numSum;
    }
}
