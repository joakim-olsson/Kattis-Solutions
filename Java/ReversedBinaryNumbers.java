import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 31/05/2020
 **/

public class ReversedBinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(sc.nextInt()));
        System.out.println(Integer.valueOf(sb.reverse().toString(), 2));
    }
}
