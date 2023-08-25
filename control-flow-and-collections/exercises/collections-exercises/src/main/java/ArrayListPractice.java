import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList findFiveLetter(ArrayList<String> str) {
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        for (String string : str) {
            if (string.length() == 5) {
                fiveLetterWords.add(string);
            }
        }
        return fiveLetterWords;
    }


}
