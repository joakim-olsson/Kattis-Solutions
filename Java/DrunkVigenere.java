import java.util.List;
import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 11/06/2020
 **/

public class DrunkVigenere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] C = sc.next().toCharArray();
        char[] K = sc.next().toCharArray();
        List<Character> alphabet = List.of(
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        );
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < C.length; i++) {
            int currPos = alphabet.indexOf(C[i]);
            int moveIndex = alphabet.indexOf(K[i]);
            boolean odd = currPos % 2 != 0;
            if (odd)
                ans.append(alphabet.get(Math.abs(currPos - moveIndex)));
            else
                ans.append(alphabet.get((moveIndex + currPos) % 26));
        }
        System.out.println(ans);
    }
}
