import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        ContainsDuplicate solution = new ContainsDuplicate();
        boolean answer = solution.containsDuplicateNumber(nums);
        boolean secondAnswer = containsDuplicateRecall(nums);
        System.out.println(answer);
        System.out.println(secondAnswer);
    }

    /* this is successful but time complexity is to high O(n2) */
    public boolean containsDuplicateNumber(int[] nums) {

        if (nums.length <= 1)
            return false;

        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j])
                    return true;
            }

        }
        return false;

    }

    /*
     * this is a better way of doing it => time complexity is O(n), HashSet is
     * suitable for this particular problem because we don't need to worry about the
     * orders, and we can quickly search the Set.
     * 
     * Uniqueness: The properties of a set inherently mean that we cannot have
     * duplicate elements.
     */
    public boolean containsDuplicate(int[] nums) {

        if (nums.length <= 1)
            return false;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    // 09/03/2023
    public static boolean containsDuplicateRecall(int[] nums) {

        if (nums.length <= 1 || nums == null)
            return false;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i]))
                return true;

            set.add(nums[i]);
        }

        return false;

    }

    public static boolean containsDup(int[] nums) {

        if (nums.length < 2 || nums == null)
            return false;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (hashSet.contains(nums[i]))
                return true;

            hashSet.add(nums[i]);

        }

        return false;
    }

}