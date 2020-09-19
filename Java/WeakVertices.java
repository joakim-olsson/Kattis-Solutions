import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 30/05/2020
 **/

public class WeakVertices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1)
                return;
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (matrix[i][k] == 1 && matrix[i][j] == 1 && matrix[j][k] == 1 && i != k && i != j && j != k) {
                            flag = false;
                        }
                    }
                }
                if (flag)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
