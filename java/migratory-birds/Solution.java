import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> birds = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            birds.put(arr.get(i), birds.getOrDefault(arr.get(i), 0) + 1);
        }

        return birds.entrySet().stream()
                .min(Map.Entry.<Integer, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry::getKey))
                .get().getKey();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        @SuppressWarnings("unused")
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
