class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while(left<right)
        {
            mid = (left+right)/2;

            if (nums[mid] > nums[right]) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid;
            }
        }
        int pivot = left;

        if (target >= nums[pivot] && target <= nums[nums.length - 1]) 
        {
            left = pivot;
            right = nums.length - 1;
        }
        else 
        {
            left = 0;
            right = pivot - 1;
        }

        while (left <= right) 
        {

            mid = (left + right) / 2;

            if (nums[mid] == target) 
            {
                return mid;
            }

            if (nums[mid] < target) 
            {
                left = mid + 1;
            } else 
            {
                right = mid - 1;
            }
        }

        return -1;
    }
}
