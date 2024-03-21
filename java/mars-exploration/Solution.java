import java.io.*;

class Result {
    public static int marsExploration(String s) {
        char[] chars = s.toLowerCase().toCharArray();

        int wrongVals = 0;

        for (int i = 0; i < chars.length; i += 3) {
            if (chars[i] != 's')
                wrongVals++;
            if (chars[i + 1] != 'o')
                wrongVals++;
            if (chars[i + 2] != 's')
                wrongVals++;
        }

        return wrongVals;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
