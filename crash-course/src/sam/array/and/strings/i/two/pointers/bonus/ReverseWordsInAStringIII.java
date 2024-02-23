package sam.array.and.strings.i.two.pointers.bonus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsInAStringIII {

    public static void main(String[] args) {
        String inputString = "I love u";
        System.out.println(reverseWords(inputString));
    }

    public static String reverseWords(String s) {
        List<char[]> reversedCharArrays = new ArrayList<>();

        int left = 0;
        int right = 0;
        char[] tempCharArray;
        int innerLeft = 0;
        int innerRight = 0;

        while (right < s.length()) {
            while (right < s.length() && s.charAt(right) != ' ') {
                right++;
            }
            tempCharArray = new char[right - left];
            reversedCharArrays.add(tempCharArray);

            innerLeft = 0;
            innerRight = tempCharArray.length - 1;

            int nextLeft = right + 1;
            while (left <= right - 1) {
                tempCharArray[innerLeft] = s.charAt(right - 1);
                tempCharArray[innerRight] = s.charAt(left);
                innerLeft++;
                innerRight--;
                left++;
                right--;
            }

            left = right = nextLeft;
        }

        return reversedCharArrays.stream().map(String::new).collect(Collectors.joining(" "));

    }
}
