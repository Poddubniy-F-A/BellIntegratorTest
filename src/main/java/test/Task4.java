package test;

import static java.lang.Math.*;

public class Task4 {

    public static int[][] createMatrix(int n) {
        final int size = 2 * (n + 1);

        int[][] res = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                res[i][j] = n - min(
                        min(i, abs(size - 1 - i)),
                        min(j, abs(size - 1 - j))
                );
            }
        }
        return res;
    }
}
