import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayPractice {
    public static void main (String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        ArrayList<String> words = new ArrayList<>();
        words.add("Bobby");
        words.add("cat");
        words.add("Baby");
        words.add("fives");

        for (int i: integerArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitSentence = sentence.split("\\.");
        System.out.println(Arrays.toString(splitSentence));

        System.out.println(ArrayListPractice.sumEven(nums));
        System.out.println(ArrayListPractice.findFiveLetter(words));

    }
}
