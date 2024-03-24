import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ar.size(); i++) {
            int sock = ar.get(i);
            map.put(sock, map.getOrDefault(sock, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            pairs += set.getValue() / 2;
        }

        return pairs;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
