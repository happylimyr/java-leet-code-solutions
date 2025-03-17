import java.util.Arrays;

public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        int count = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

}

// HashMap solution
// HashMap<Integer, Integer> frequencyMap = new HashMap<>();

// for (int num : nums) {
// frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
// }

// for (int count : frequencyMap.values()) {
// if (count % 2 != 0) {
// return false;
// }
// }

// return true;

// public boolean divideArray(int[] nums) {
// int temp[] = new int[1000];
// for(int i : nums) temp[i]++;
// for(int i=0; i<temp.length; i++){
// if(temp[i]%2!=0){
// return false;
// }
// }
// return true;
// }