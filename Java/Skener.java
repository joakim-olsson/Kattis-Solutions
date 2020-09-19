import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 06/06/2020
 **/

public class Skener {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int Zr = sc.nextInt();
        int Zc = sc.nextInt();
        sc.nextLine();
        while (R-- > 0) {
            char[] in = sc.nextLine().toCharArray();
            for (int i = 0; i < Zr; i++) {
                for (int j = 0; j < in.length; j++) {
                    for (int k = 0; k < Zc; k++)
                        System.out.print(in[j]);
                }
                System.out.println();
            }
        }

    }
}
