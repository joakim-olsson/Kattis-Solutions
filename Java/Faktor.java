import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 22/05/2020
 **/

public class Faktor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int I = sc.nextInt();
        System.out.println(A * (I-1) + 1);
    }
}
