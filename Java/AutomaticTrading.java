import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 11/06/2020
 **/

public class AutomaticTrading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray();
        HashMap<String, Integer> dict = new HashMap<>();
        int cases = sc.nextInt();
        sc.nextLine();
        while (cases-- > 0) {
            String z = sc.nextLine();
            if (dict.containsKey(z)) {
                System.out.println(dict.get(z));
                continue;
            }
            String[] line = z.split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int count = 0;
            for (; b < arr.length && arr[a] == arr[b]; a++, b++)
                count++;
            dict.put(z, count);
            System.out.println(count);
        }
    }
}
