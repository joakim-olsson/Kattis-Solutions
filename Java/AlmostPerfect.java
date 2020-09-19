import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 16/06/2020
 **/

public class AlmostPerfect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int[] divisors = factors(num);
            int sum = 0;
            for (int s : divisors)
                sum += s;
            if (sum == num)
                System.out.println(num + " perfect");
            else if (sum >= num - 2 && sum <= num + 2)
                System.out.println(num + " almost perfect");
            else
                System.out.println(num + " not perfect");
        }
    }

    private static int[] factors(int a) {
        if (isPrime(a))
            return new int[]{1};
        else {
            Set<Integer> nums = new HashSet<>();
            nums.add(1);
            for (int x = 2; x <= Math.sqrt(a); x++)
                if (a % x == 0) {
                    nums.add(x);
                    nums.add(a / x);
                }
            int[] arr = new int[nums.size()];
            int i = 0;
            for (int s : nums)
                arr[i++] = s;
            return arr;
        }
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
