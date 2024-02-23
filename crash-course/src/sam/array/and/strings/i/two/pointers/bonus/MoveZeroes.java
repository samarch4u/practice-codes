package sam.array.and.strings.i.two.pointers.bonus;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes obj = new MoveZeroes();
        int[] nums = {0};
        obj.moveZeroes(nums);

        String output = Arrays.stream(nums)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(","));
        System.out.println("com.sam.array.arrays.MoveZeroes result: " + output);

    }

    public void moveZeroes(int[] nums) {
        int writeLoc = 0;
        int readLoc = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[readLoc] != 0){
                nums[writeLoc] = nums[readLoc];
                writeLoc++;
                readLoc++;
            }else{
                readLoc++;
            }
        }

        for(; writeLoc < nums.length; writeLoc++){
            nums[writeLoc] = 0;
        }
    }
}
