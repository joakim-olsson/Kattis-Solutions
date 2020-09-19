import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class Spavanac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (M < 45) {
            if (H == 0)
                System.out.println(23 + " " + (60-45+M));
            else
                System.out.println((H-1) + " " + (60-45+M));
        } else {
            if (H == 0)
                System.out.println(23 + " " + (60-45-M));
            else
                System.out.println(H + " " + (M-45));

        }
    }
}
