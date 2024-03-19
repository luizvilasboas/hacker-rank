import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;
        long min = arr.get(0), max = arr.get(0);

        for (int n : arr) {
            total += n;

            if (n < min) {
                min = n;
            }

            if (n > max) {
                max = n;
            }
        }

        System.out.printf("%d %d\n", total - max, total - min);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
