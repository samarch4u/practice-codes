package sam.array.and.strings.i.two.pointers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] result = sortedSquares(nums);

        String output = Arrays.stream(result).mapToObj(Integer::toString).collect(Collectors.joining(","));
        System.out.println("com.sam.array.arrays.SquaresOfSortedArray result: " + output);

    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int writePos = right;

        while (left <= right) {
            if (squared(nums[left]) > squared(nums[right])) {
                result[writePos] = squared(nums[left]);
                writePos--;
                left++;
            } else if (squared(nums[left]) < squared(nums[right])) {
                result[writePos] = squared(nums[right]);
                writePos--;
                right--;
            } else {
                result[writePos] = squared(nums[left]);
                if (writePos > 0) {
                    result[writePos - 1] = squared(nums[right]);
                }
                writePos -= 2;
                left++;
                right--;
            }
        }

        return result;
    }

    static int squared(int num) {
        return num * num;
    }

}
