import java.io.*;
import java.util.StringJoiner;

class Result {
    public static String timeConversion(String s) {
        String[] time = s.split(":");

        int hours = Integer.parseInt(time[0]);
        String minutes = time[1], seconds = time[2];
        String period = seconds.substring(seconds.length() - 2);
        seconds = seconds.substring(0, 2);

        if (period.equals("PM") && hours < 12) {
            hours += 12;
        } else if (period.equals("AM") && hours >= 12) {
            hours -= 12;
        }

        StringJoiner joiner = new StringJoiner(":");

        if (hours < 10) {
            joiner.add("0" + String.valueOf(hours));
        } else {
            joiner.add(String.valueOf(hours));
        }

        joiner.add(minutes);
        joiner.add(seconds);

        return joiner.toString();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
