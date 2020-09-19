import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class Ladder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        System.out.println((int) Math.ceil(h / Math.sin(Math.PI * v / 180)));
    }
}
