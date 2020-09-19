import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 28/05/2020
 **/

public class EncodedMessage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            StringBuilder res = new StringBuilder();
            char[] in = sc.next().toCharArray();
            int dim = (int) Math.sqrt(in.length);
            char[][] matrix = new char[dim][dim];
            int index = 0;
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    matrix[k][j] = in[index];
                    index++;
                }
            }
            for (int j = matrix.length-1; j >= 0; j--) {
                for (int k = 0; k < matrix.length; k++) {
                    res.append(matrix[j][k]);
                }
            }
            System.out.println(res);
        }
    }
}
