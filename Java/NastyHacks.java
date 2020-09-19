import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class NastyHacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            int profit = e - c;
            if (profit > r)
                System.out.println("advertise");
            else if (profit < r)
                System.out.println("do not advertise");
            else
                System.out.println("does not matter");
        }
    }
}
