class Solution {
    public void sortColors(int[] nums) {
        // this problem can be easily solved by using dutch national flag algorithm
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){
            switch(nums[mid]){
                case 0:
                    swap(nums, mid, low);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
