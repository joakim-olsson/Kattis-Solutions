import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class SevenWonders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] in = sc.next().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < in.length; i++) {
            map.put(in[i], map.getOrDefault(in[i], 0) + 1);
        }
        for (char key : map.keySet())
            ans += map.get(key) * map.get(key);

        if (map.containsKey('C') && map.containsKey('T') && map.containsKey('G'))
            ans += Math.min(Math.min(map.get('C'), map.get('T')), map.get('G')) * 7;

        System.out.println(ans);
    }
}
