import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 08/06/2020
 **/

public class ADifferentProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong())
            System.out.println(Math.abs(sc.nextLong() - sc.nextLong()));
    }
}
