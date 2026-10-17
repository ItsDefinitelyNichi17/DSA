
class main{
    public static void main (String [] args){

        //find the largest num
        int nums[] = {5, 8, 6, 3, 20, 12}; // len 6 index 5

        int largestNum = nums[0];

        for(int i = 0; i < nums.length ; i++){

            int nextNum = i < nums.length - 1 ? i + 1 : i;

            if(largestNum < nums[nextNum]){
                largestNum = nums[nextNum];
            }
        }
        System.out.println(largestNum);
    }
}
