class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length - 1] < target){
                return nums.length;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return 0;
    }
}