import java.util.*;

public class Solution {
    public static String[] splitByUppercase(String word) {
        return word.split("(?=[A-Z])");
    }
    
    public static String joinWordSpaceToUppercase(String word) {
        String[] words = word.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
        }

        String ret = String.join("", words);

        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            String[] lineSegment = line.split(";");
            String camelCaseResult = lineSegment[2];

            if (lineSegment[0].equals("S")) {
                if (lineSegment[1].equals("M")) {
                    camelCaseResult = camelCaseResult.replace("()", "");
                }

                camelCaseResult = String.join(" ", splitByUppercase(camelCaseResult));
                camelCaseResult = camelCaseResult.toLowerCase();
            } else if (lineSegment[0].equals("C")) {
                camelCaseResult = joinWordSpaceToUppercase(camelCaseResult);
                
                if (lineSegment[1].equals("M")) {
                    camelCaseResult = camelCaseResult + "()";
                }

                if (lineSegment[1].equals("M") || lineSegment[1].equals("V")) {
                    camelCaseResult = Character.toLowerCase(camelCaseResult.charAt(0)) + camelCaseResult.substring(1);
                }
            }

            System.out.println(camelCaseResult);
        }

        scanner.close();
    }
}
