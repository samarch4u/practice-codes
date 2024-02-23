package sam.array.and.strings.i.two.pointers;

public class ReverseString {
    public static void main(String[] args) {
        char[] inputString = "Samiran".toCharArray();
        System.out.println(reverseString(inputString));
    }

    public static char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char tempChar;

        while (left < right) {
            tempChar = s[left];
            s[left] = s[right];
            s[right] = tempChar;

            left++;
            right--;
        }
        return s;
    }
}
