class Solution {
    public int singleNumber(int nums[], int n) {
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}