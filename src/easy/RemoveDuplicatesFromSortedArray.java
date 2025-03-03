package easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i : nums) {
            if (k == 0 || i > nums[k - 1]) {
                nums[k] = i;
                k++;
            }
        }
        return k;
    }
}
