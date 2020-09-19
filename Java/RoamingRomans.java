import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class RoamingRomans {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double roman = 1000.0*(5280.0/4854.0);
        System.out.println(Math.round(sc.nextDouble()*roman));
    }
}
