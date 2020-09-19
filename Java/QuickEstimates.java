import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class QuickEstimates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.valueOf(sc.nextLine());
        while (N > 0) {
            System.out.println(sc.nextLine().length());
            N--;
        }
    }
}
