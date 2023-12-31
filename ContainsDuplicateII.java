import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1 };
        int k = 3;

        System.out.println(containsNearbyDuplicateRecall(nums, k));
    }

    // this solution works but time complexity is O(n^2)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1)
            return false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    if (Math.abs(i - j) <= k)
                        return true;
                }
            }
        }
        return false;
    }

    /*
     * Given an integer array nums and an integer k, return true if there are two
     * distinct
     * indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <=
     * k.
     */

    public boolean containsNearbyDuplicateBetterSolution(int[] nums, int k) {
        if (nums.length <= 1)
            return false;

        Map<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int currentNumber = nums[i];

            if (valueToIndex.containsKey(currentNumber)) {

                int previousIndex = valueToIndex.get(currentNumber);

                if (Math.abs(i - previousIndex) <= k)
                    return true;
            }
            valueToIndex.put(currentNumber, i);
        }
        return false;
    }

    // 09/03/2023
    public static boolean containsNearbyDuplicateRecall(int[] nums, int k) {

        if (nums.length <= 1 || nums == null)
            return false;

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (hashMap.containsKey(currentNumber)) {
                if (Math.abs(hashMap.get(currentNumber) - i) <= k)
                    return true;
            }
            hashMap.put(currentNumber, i);
        }

        return false;

    }

}
