import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 22/05/2020
 **/

public class Flip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reversedA = reverseInt(sc.nextInt());
        int reversedB = reverseInt(sc.nextInt());

        System.out.println(reversedA > reversedB ? reversedA : reversedB);
    }

    public static int reverseInt(int i) {
        int reversed = 0;
        while (i > 0) {
            reversed = reversed * 10 + i % 10;
            i /= 10;
        }
        return reversed;
    }
}
