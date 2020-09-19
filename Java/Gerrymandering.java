import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 31/05/2020
 **/

public class Gerrymandering {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int[][] arr = new int[d][2];
        while (p-- > 0) {
            int district = sc.nextInt() - 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[district][0] += a;
            arr[district][1] += b;
        }
        int totalA = 0;
        int totalB = 0;
        double votes = 0;
        for (int x = 0; x < d; x++) {
            int a = arr[x][0];
            int b = arr[x][1];
            int min = (a + b) / 2 + 1;
            votes += a + b;
            if (a > b) {
                System.out.println("A " + (a - min) + " " + b);
                totalA += a - min;
                totalB += b;
            } else {
                System.out.println("B " + a + " " + (b - min));
                totalA += a;
                totalB += b - min;
            }
        }
        System.out.println(Math.abs(totalA - totalB) / votes);
    }
}
