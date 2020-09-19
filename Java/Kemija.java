import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 27/05/2020
 **/

public class Kemija {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] in = sc.nextLine().toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < in.length; i++) {
            sb.append(in[i]);
            if (vowels.contains(in[i])) {
                i += 2;
            }
        }
        System.out.println(sb.toString());
    }
}
