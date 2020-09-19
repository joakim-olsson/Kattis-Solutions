import org.w3c.dom.ls.LSOutput;

import java.util.*;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class PokerHand {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            char rank = sc.next().charAt(0);
            map.put(rank, map.getOrDefault(rank, 0) + 1);
        }

        int max = 0;
        for (char key : map.keySet())
            max = Math.max(map.get(key), max);

        System.out.println(max);
    }
}
