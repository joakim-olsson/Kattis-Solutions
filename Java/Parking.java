import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 26/05/2020
 **/

public class Parking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            int dist = 0;

            for (int j = 1; j < list.size(); j++) {
                dist += Math.abs(list.get(j) - list.get(j-1));
            }
            dist += list.get(list.size()-1) - list.get(0);
            System.out.println(dist);
        }
    }
}
