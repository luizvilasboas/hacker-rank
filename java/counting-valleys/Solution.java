import java.io.*;

class Result {
    public static int countingValleys(int steps, String path) {
        int level = 0;
        int valleys = 0;

        String[] vals = path.split("");

        for (String val : vals) {
            if (val.equals("D")) {
                level--;
            } else if (val.equals("U")) {
                level++;

                if (level == 0) {
                    valleys++;
                }
            }
        }

        return valleys;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
