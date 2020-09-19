import java.util.Scanner;

/**
 * @Author: Joakim Olsson <lomo133>
 * @Date: 07/06/2020
 **/

public class Cudoviste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        int[] squashes = new int[5];
        char[][] spaces = new char[R][C];
        for (int i = 0; i < R; i++) {
            char[] in = sc.nextLine().toCharArray();
            spaces[i] = in;
        }

        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (spaces[i][j] != '#' && spaces[i-1][j] != '#' && spaces[i][j-1] != '#' && spaces[i-1][j-1] != '#') {
                    int temp = 0;
                    if(spaces[i][j] == 'X')
                        temp++;
                    if(spaces[i-1][j-1] == 'X')
                        temp++;
                    if(spaces[i][j-1] == 'X')
                        temp++;
                    if(spaces[i-1][j] == 'X')
                        temp++;
                    squashes[temp]++;
                }
            }
        }
        for (int i : squashes)
            System.out.println(i);
    }
}
