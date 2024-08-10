/*
* @Link Problem : https://leetcode.com/problems/two-sum
* @Contributor  : Chroax
* @Created at   : 09 August 2024, 04:31 PM
* */

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