public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = -1;
        int end = nums.length;
        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }

        }

        return start + 1;

    }
}
