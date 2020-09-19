import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class Planina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(Math.round(Math.pow((Math.pow(2, N) + 1), 2)));
    }
}
