package test;

import static java.lang.Math.min;

public class Task3 {

    public static int getMinElement(int[][] table) {
        final int size = table.length;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size / 2; i++) {
            min = min(min, table[i][size - 1 - i]);
        }
        for (int i = (size + 1) / 2; i < size; i++) {
            min = min(min, table[i][size - 1 - i]);
        }
        return min;
    }
}
