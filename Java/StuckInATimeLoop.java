import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 20/05/2020
 **/

public class StuckInATimeLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++)
            System.out.println(i + " Abracadabra");
    }
}
