import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (Integer val : arr) {
            if (val < 0) {
                negativeCount++;
            } else if (val > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.printf("%.6f\n", (double) positiveCount / arr.size());
        System.out.printf("%.6f\n", (double) negativeCount / arr.size());
        System.out.printf("%.6f\n", (double) zeroCount / arr.size());
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        @SuppressWarnings("unused")
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
