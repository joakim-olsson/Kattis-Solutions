import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 06/06/2020
 **/

public class OneChickenPerPerson {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N - M == 1)
            System.out.println("Dr. Chaz needs " + (N-M) + " more piece of chicken!");
        else if (M - N == 1)
            System.out.println("Dr. Chaz will have " + (M-N) + " piece of chicken left over!");
        else if (N < M)
            System.out.println("Dr. Chaz will have " + (M-N) + " pieces of chicken left over!");
        else
            System.out.println("Dr. Chaz needs " + (N-M) + " more pieces of chicken!");
    }
}
