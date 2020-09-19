import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 10/06/2020
 **/

public class ThreeDPrintedStatues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        System.out.println((int) Math.ceil(Math.log(n) / Math.log(2)) + 1);
    }
}
