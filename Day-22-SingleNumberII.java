class Solution {
    public int singleNumber(int[] nums) {
        // Sorting the array
        Arrays.sort(nums);
		
        if(nums.length == 1) return nums[0];
		
		// In case the first number is unique -> 1,2,2,2,3,3,3
        if(nums[0] != nums[1]) return nums[0];
		
        for(int i=1; i<nums.length-1; i=i+3)
        {
			// The number at an index "i" would either be equal to the number on its left or right
			// If not, the number at index "i" is the unique number! -> 1,1,1,2,3,3,3,4,4,4
            if( nums[i] != nums[i-1])
            {
                return nums[i-1];   
            }
        }
		// In case the last number is unique -> 1,1,1,2,2,2,3
        return nums[nums.length-1];
    }
}
