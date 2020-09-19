import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 30/05/2020
 **/

public class Beavergnaw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            double D = sc.nextDouble();
            double V = sc.nextDouble();

            if (D == 0 && V == 0)
                return;

            System.out.println(Math.pow(Math.pow(D,3) - 6*V/Math.PI, 1/3.0));
        }
    }
}
