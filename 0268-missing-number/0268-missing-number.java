class Solution {
    public int missingNumber(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1 += nums[i];
        }
        int a = nums.length;
        
        sum2 = a*(a+1)/2;
        
        return sum2-sum1;
    }
}