import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 31/05/2020
 **/

public class Railroad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(Y % 2 == 0 ? "possible" : "impossible");
    }
}
