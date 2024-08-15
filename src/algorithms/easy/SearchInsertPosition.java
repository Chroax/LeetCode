/*
 * @Link Problem : https://leetcode.com/problems/search-insert-position
 * @Contributor  : Chroax
 * @Created at   : 12 August 2024, 04:41 PM
 * @Problem      : Given a sorted array in ascending order of distinct integers and a target value, return the index if the
 *                 target is found. If not, return the index where it would be if it were inserted in order. You must write
 *                 an algorithm with O(log n) runtime complexity.
 * @Explanation  : Binary search algorithm.
 * */

package algorithms.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] == target || target < nums[0])
            return 0;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}
