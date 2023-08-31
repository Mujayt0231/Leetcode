import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        ContainsDuplicate solution = new ContainsDuplicate();
        boolean answer = solution.containsDuplicateNumber(nums);
        boolean secondAnswer = solution.containsDuplicate(nums);
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

}