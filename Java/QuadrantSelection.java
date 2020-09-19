import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class QuadrantSelection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0)
            System.out.println(1);
        else if (x < 0 && y > 0)
            System.out.println(2);
        else if (x < 0 && y < 0)
            System.out.println(3);
        else
            System.out.println(4);
    }
}
