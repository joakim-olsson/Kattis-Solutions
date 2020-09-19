import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class JudgingMoose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        if (left == 0 && right == 0)
            System.out.println("Not a moose");
        else if (left == right)
            System.out.println("Even " + left * 2);
        else {
            System.out.println("Odd " + (right > left ? right * 2 : left * 2));
        }
    }
}
