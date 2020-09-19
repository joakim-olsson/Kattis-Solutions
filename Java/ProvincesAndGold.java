import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class ProvincesAndGold {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int G = sc.nextInt();
        int S = sc.nextInt();
        int C = sc.nextInt();
        int sum = 0;
        sum += G * 3;
        sum += S * 2;
        sum += C;

        if (sum < 2) {
            System.out.println("Copper");
            return;
        }

        if (sum >= 8)
            System.out.print("Province");
        else if (sum >= 5)
            System.out.print("Duchy");
        else if (sum >= 2)
            System.out.print("Estate");

        if (sum >= 6)
            System.out.print(" or Gold");
        else if (sum >= 3)
            System.out.print(" or Silver");
        else
            System.out.print(" or Copper");
    }
}
