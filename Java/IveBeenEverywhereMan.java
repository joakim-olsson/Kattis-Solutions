import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 27/05/2020
 **/

public class IveBeenEverywhereMan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            Set<String> set = new HashSet<>();
            int ans = 0;
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                String in = sc.next();
                if (!set.contains(in))
                    ans++;
                set.add(in);
            }
            System.out.println(ans);
        }
    }
}
