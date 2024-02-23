package sam.array_and_strings.i_two_pointers.bonus;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String inputString = "?6C40E";
        String expected = "?6E40C";

        System.out.println(reverseOnlyLetters(inputString));
        System.out.println(reverseOnlyLetters(inputString).equals(expected));
    }

    public static String reverseOnlyLetters(String s) {

        int left = 0;
        int right = s.length() - 1;
        char temp;
        char[] charArr = s.toCharArray();

        while (left < right) {
            while (left < s.length() && !Character.isAlphabetic(charArr[left])) {
                left++;
            }

            while (right >= 0 && !Character.isAlphabetic(charArr[right])) {
                right--;
            }

            if (0 <= left && left < s.length() && 0 <= right && right < s.length() && left < right) {
                temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
            }

            left++;
            right--;
        }

        return new String(charArr);
    }
}
