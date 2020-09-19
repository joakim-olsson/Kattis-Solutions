import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 28/05/2020
 **/

public class DetailedDifferences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            StringBuilder sb = new StringBuilder();
            char[] s1 = sc.next().toCharArray();
            char[] s2 = sc.next().toCharArray();

            for (int i = 0; i < s1.length; i++) {
                if (s1[i] == s2[i])
                    sb.append('.');
                else
                    sb.append('*');
            }
            System.out.println(new String(s1));
            System.out.println(new String(s2));
            System.out.println(sb);
            System.out.println();
        }
    }
}
