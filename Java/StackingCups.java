import java.util.*;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 25/05/2020
 **/

public class StackingCups {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeMap<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            if (sc.hasNextInt()) {
                int rad = sc.nextInt() / 2;
                map.put(rad, sc.next());
            } else {
                String color = sc.next();
                map.put(sc.nextInt(), color);
            }
        }
        for (Map.Entry<Integer, String> color : map.entrySet())
            System.out.println(color.getValue());
    }
}
