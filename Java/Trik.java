import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 24/05/2020
 **/

public class Trik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] moves = sc.next().toCharArray();
        int pos = 1;

        for (int i = 0; i < moves.length; i++) {
            if (moves[i] == 'A') {
                if (pos == 1)
                    pos = 2;
                else if (pos == 2)
                    pos = 1;
            }
            else if (moves[i] == 'B') {
                if (pos == 2)
                    pos = 3;
                else if (pos == 3)
                    pos = 2;
            }
            else {
                if (pos == 1)
                    pos = 3;
                else if (pos == 3)
                    pos = 1;
            }
        }
        System.out.println(pos);
    }
}
