// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class Solution {
    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};

        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        int c = 0;
        for(int i=0; i<nums.length; i++){
            while(nums[i] > 0){
                //int r = nums[i]%10;
                c = c + 1;
                nums[i] = nums[i] / 10;
            }

            if(c%2 == 0){
                count++;
                c = 0;
            }
            c=0;
        }
        return count;
    }
}
