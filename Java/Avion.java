import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 27/05/2020
 **/

public class Avion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean output = false;

        for (int i = 0; i < 5; i++) {
            char[] in = sc.next().toCharArray();
            for (int j = 0; j < in.length; j++) {
                if (in[j] == 'F' && j + 2 < in.length) {
                    if (in[j + 1] == 'B' && in[j + 2] == 'I') {
                        System.out.print(i+1 + " ");
                        output = true;
                    }
                }
            }
        }
        if (output == false)
            System.out.println("HE GOT AWAY!");
    }
}
