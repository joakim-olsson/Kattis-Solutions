import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 11/06/2020
 **/

public class AnotherCandies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            sc.nextLine();
            int numChildren = sc.nextInt();
            BigInteger sum = BigInteger.ZERO;

            for (int i = 0; i < numChildren; i++)
                sum = sum.add(BigInteger.valueOf(sc.nextLong()));
            System.out.println(BigInteger.ZERO.equals(sum.mod(BigInteger.valueOf(numChildren))) ? "YES" : "NO");
        }
    }
}
