import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class R2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R1 = sc.nextInt();
        int S = sc.nextInt();
        System.out.println(S*2 - R1);
    }
}
