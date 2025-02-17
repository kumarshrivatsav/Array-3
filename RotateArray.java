// # Time Complexity:  O(n) where n is the length
// #  Space Complexity:  O(1)
// #  Did this code successfully run on Leetcode : Yes
// #  Any problem you faced while coding this : No
class Solution {
    public void rotate(int[] nums, int k) {
        // reverse nums
        k = k % nums.length; 
        reverse(0, nums.length -1, nums);
        reverse(0, k-1, nums);
        reverse(k, nums.length -1, nums);

        
    }

    public void reverse(int start, int end, int[] nums) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}