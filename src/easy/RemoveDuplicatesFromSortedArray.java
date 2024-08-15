/*
 * @Link Problem : https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * @Contributor  : Chroax
 * @Created at   : 12 August 2024, 04:10 PM
 * @Problem      : Remove duplicates from a sorted integer array nums in-place so that each unique element appears only once.
 *                 Modify the array nums such that the first k elements contain the unique elements in their original order.
 *                 The remaining elements in the array are not important. Return the number k, which represents the count of
 *                 unique elements.
 * @Explanation  : Start by initializing an index variable to one, which will track the position where the next unique element
 *                 should be placed. Then iterate element from second element because first element always new element. For
 *                 each element, will be compared with the previous element. If the element is different, then we will modify
 *                 the current element to index position and increment the index by one. This process continues until the end
 *                 of the array
 * */

package easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
