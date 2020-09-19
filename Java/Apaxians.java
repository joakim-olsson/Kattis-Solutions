import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class Apaxians {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] in = sc.next().toCharArray();
        StringBuilder ans = new StringBuilder();
        ans.append(in[0]);
        for (int i = 1; i < in.length; i++) {
            if (in[i] != in[i-1])
                ans.append(in[i]);
        }
        System.out.println(ans.toString());
    }
}
