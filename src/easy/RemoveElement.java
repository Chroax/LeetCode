/*
 * @Link Problem : https://leetcode.com/problems/remove-element
 * @Contributor  : Chroax
 * @Created at   : 12 August 2024, 04:29 PM
 * @Problem      : Modify an integer array nums by removing all occurrences of a specific integer val. The goal is to rearrange the
 *                 array so that the first k element don't include val, where k represent the count of elements in the array that are
 *                 not equal to val. The order of these k elements does not matter. The remaining elements in the array beyond the
 *                 first k can be ignored. The function should return the value of k.
 * @Explanation  : Start by initializing an index variable to zero, which will track the position where the next element that not equal
 *                 to val should be placed. Then iterate the elements, where each element, will be compared with val. If the element is
 *                 different, then we will modify the current element to index position and increment the index by one. This  process
 *                 continues until the end of the array
 * */

package easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
