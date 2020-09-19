import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class SimonSays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            String[] in = sc.nextLine().split(" ");
            if (in.length > 2 && in[0].equals("Simon") && in[1].equals("says")) {
                for (int j = 2; j < in.length; j++)
                    System.out.print(in[j] + " ");
                System.out.println();
            }
        }
    }
}
