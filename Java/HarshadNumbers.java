import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 28/05/2020
 **/

public class HarshadNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        while (!(in % digitSum(in) == 0))
            in++;

        System.out.println(in);
        }

    public static int digitSum(int in) {
        int digitSum = 0;
        while (in > 0) {
            digitSum += in % 10;
            in /= 10;
        }
        return digitSum;
    }
}
