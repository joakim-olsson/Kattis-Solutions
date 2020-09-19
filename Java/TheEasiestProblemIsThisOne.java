import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 30/05/2020
 **/

public class TheEasiestProblemIsThisOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int in = sc.nextInt();
            if (in == 0)
                return;
            int i = 11;
            while (digitSum(in*i) != digitSum(in))
                i++;
            System.out.println(i);
        }
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
