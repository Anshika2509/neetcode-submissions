class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int result = len;
        for(int i = 0; i<len;i++){
            result^=i^nums[i];
        }
        return result;
    }
}
