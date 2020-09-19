import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 28/05/2020
 **/

public class CryptographersConundrum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] in = sc.next().toCharArray();
        int ans = 0;

        for (int i = 2; i < in.length; i+=3) {
            if (in[i] != 'R')
                ans++;
            if (in[i-1] != 'E')
                ans++;
            if (in[i-2] != 'P')
                ans++;
        }
        System.out.println(ans);
    }
}
