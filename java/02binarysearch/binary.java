import java.lang.Math;
import java.util.Arrays;

class binary{
    public static void main (String [] args){
        //find the target Num
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; // len 20 index 19
        int targetNum = 17;
        int middleIndex;

        while(true){
            middleIndex = (int)Math.floor(nums.length / 2);
            if(nums[middleIndex] < targetNum){
               nums =  Arrays.copyOfRange(nums, middleIndex, nums.length);
            }
            else if( targetNum < nums[middleIndex]) {
               nums =  Arrays.copyOfRange(nums, 0, middleIndex);

            }else if(nums[middleIndex] == targetNum){
                System.out.println(nums[middleIndex]);
                break;
            }
        }

    }
}
