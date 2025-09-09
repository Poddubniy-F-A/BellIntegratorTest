package web;

public class Task3 {

    public static int getMinElement(int[][] table) {
        int size = table.length, min = Integer.MAX_VALUE;
        for (int i = 0; i < size / 2; i++) {
            min = Math.min(min, table[i][size - 1 - i]);
        }
        for (int i = (size + 1) / 2; i < size; i++) {
            min = Math.min(min, table[i][size - 1 - i]);
        }
        return min;
    }
}
