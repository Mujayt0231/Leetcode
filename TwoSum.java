
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order. */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i <= nums.length; i++) {
            // nums[0]
            for (int j = i + 1; j <= nums.length - 1; j++) {
                // nums[1]
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public int[] twoSumGPT4(int[] nums, int target) {
        // Initialize a HashMap to store the elements and their indices
        Map<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array once to populate the HashMap and find the solution
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists, return its index along with the current index
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            // Otherwise, put the current element in the HashMap
            numMap.put(nums[i], i);
        }

        // If no solution exists, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum twosum = new TwoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twosum.twoSumRecall1(nums, target)));
    }

    // 9/3/2023
    public int[] twoSumRecall1(int[] nums, int target) {

        /*
         * for (int i = 0; i < nums.length; i++) {
         * for (int j = i + 1; j < nums.length - 1; j++) {
         * if (nums[i] + nums[j] == target)
         * return new int[] { i, j };
         * }
         * }
         * 
         * return new int[0];
         */

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (hashMap.containsKey(complement))
                return new int[] { hashMap.get(complement), i };

            hashMap.put(nums[i], i);
        }

        return new int[0];

    }

}
