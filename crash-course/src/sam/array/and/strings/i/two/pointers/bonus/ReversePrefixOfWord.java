package sam.array.and.strings.i.two.pointers.bonus;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "Sam";
        char ch = 'a';
        String expectedString = "aSm";
        System.out.println(reversePrefix(word, ch));
        System.out.println(reversePrefix(word, ch).equals(expectedString));
    }

    public static String reversePrefix(String word, char ch) {

        int left = 0;
        int right = 0;
        char[] charArray = word.toCharArray();

        for (; right < word.length(); right++) {
            if (charArray[right] == ch) {
                break;
            }
        }

        while (left != right && right < word.length() && left < right) {
            charArray[left] = (char) (charArray[left] + charArray[right]);
            charArray[right] = (char) (charArray[left] - charArray[right]);
            charArray[left] = (char) (charArray[left] - charArray[right]);

            left++;
            right--;
        }

        return new String(charArray);
    }
}
