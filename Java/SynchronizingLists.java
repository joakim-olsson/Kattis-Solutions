import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 31/05/2020
 **/

public class SynchronizingLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int[] l1 = new int[n];
            int[] l2 = new int[n];

            for (int i = 0; i < n; i++) {
                l1[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                l2[i] = sc.nextInt();
            }
            int[] l1s = Arrays.copyOf(l1, l1.length);
            Arrays.sort(l1s);
            Arrays.sort(l2);
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                map.put(l1s[i], i);
            }
            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                int pos = map.get(l1[i]);
                ans[i] = l2[pos];
            }

            for (int i : ans)
                System.out.println(i);
            System.out.println();
            n = sc.nextInt();
        }
    }
}
