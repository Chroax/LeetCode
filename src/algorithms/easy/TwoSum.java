/*
* @Link Problem : https://leetcode.com/problems/two-sum
* @Contributor  : Chroax
* @Created at   : 09 August 2024, 04:31 PM
* @Problem      : Given an array of integers nums and an integer target, return indices of the
*                 two numbers such that they add up to target. Each input would have exactly one solution,
*                 and can't use the same element twice.
* @Explanation  : Solves the problem by using a HashMap to find two distinct indices in an array
*                 where the sum of the elements at those indices equals a given target.
*                 The algorithm first populates the HashMap with each element in the array as a key
*                 and its corresponding index as the value. Then, it iterates through the array again,
*                 calculating the difference between the target and the current element. If this difference
*                 exists in the HashMap and its index is different from the current index, the function
*                 returns the pair of indices.
* */

package algorithms.easy;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        HashMap<Integer, Integer> indexingNum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexingNum.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];

            if(indexingNum.containsKey(remain) && indexingNum.get(remain) != i)
                return new int[] {i, indexingNum.get(remain)};
        }

        return null;
    }
}