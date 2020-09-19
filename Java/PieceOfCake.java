import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class PieceOfCake {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        if (n/2 >= h)
            h = n - h;
        if (n/2 >= v)
            v = n - v;
        System.out.println(h*v*4);
    }
}
