import java.util.*;

public class AddEmUp {
    static Map<Integer, Integer> turned;
    static int n, s;
    static int[] normal, flippedNumbers;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        normal = new int[n];
        flippedNumbers = new int[n];
        turned = Map.of(
                0, 0,
                1, 1,
                2, 2,
                3, -1,
                4, -1,
                5, 5,
                6, 9,
                7, -1,
                8,8,
                9,6
        );
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            Set<Integer> set = map.get(a);
            if (set == null)
                map.put(a, set = new HashSet<>());
            set.add(i);
            normal[i] = a;
            int flipped = flip(a);
            flippedNumbers[i] = flipped;
            if (flipped != -1 && flipped != a) {
                set = map.get(flipped);
                if (set == null)
                    map.put(flipped, set = new HashSet<>());
                set.add(i);
            }
        }
        for (int i = 0; i < n; i++) {
            int a = normal[i];
            int flipped = flippedNumbers[i];
            int need = s - a;
            Set<Integer> set = map.get(need);
            if (set != null) {
                set = new HashSet<>(set);
                set.remove(i);
                if (set.size() > 0) {
                    System.out.println("YES");
                    return;
                }
            }
            if (flipped != -1) {
                need = s - flipped;
                set = map.get(need);
                if (set != null) {
                    set = new HashSet<>(set);
                    set.remove(i);
                    if (set.size() > 0) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }

    static int flip(int in) {
        int ret = 0;
        while (in > 0) {
            int d = in % 10;
            if (turned.get(d) == -1)
                return -1;
            ret = turned.get(d) + ret * 10;
            in /= 10;
        }
        return ret;
    }
}