import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static int lonelyinteger(List<Integer> a) {
        int ret = 0;

        for (int i = 0; i < a.size(); i++) {
            boolean is_lonely = true;

            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) == a.get(j) && i != j) {
                    is_lonely = false;
                    break;
                }
            }

            if (is_lonely) {
                ret = a.get(i);
                break;
            }
        }

        return ret;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        @SuppressWarnings("unused")
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
