import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 21/05/2020
 **/

public class HissingMicrophone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        for (int i = 0; i < s.length-1; i++) {
            if (s[i] == 's' && s[i+1] == 's') {
                System.out.println("hiss");
                return;
            }
        }
        System.out.println("no hiss");


    }
}
