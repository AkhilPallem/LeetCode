public class Solution {
    public double majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null; 
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate; // Returning an Integer as double 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        double majorityElement = solution.majorityElement(nums); // Storing the result in a double
        System.out.println("Majority element: " + majorityElement);
    }
}

    // Given an array nums of size n, return the majority element.
    // The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
