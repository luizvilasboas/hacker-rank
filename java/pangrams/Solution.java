package java.pangrams;

import java.io.*;
import java.util.*;

class Result {
    public static String pangrams(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                map.put(c, 0);
            }
        }

        return (map.size() == 26) ? "pangram" : "not pangram";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
