import java.util.*;

class Result {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int size = matrix.size();
        int total = 0;

        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size / 2; j++) {
                total += Math.max(matrix.get(i).get(j), Math.max(matrix.get(i).get(size - j - 1),
                        Math.max(matrix.get(size - i - 1).get(j), matrix.get(size - i - 1).get(size - j - 1))));
            }
        }

        return total;
    }
}
