/*
 * @Link Problem : https://leetcode.com/problems//merge-sorted-array
 * @Contributor  : Chroax
 * @Created at   : 15 August 2024, 09:42 AM
 * @Problem      : You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 *                 representing the number of elements in nums1 and nums2 respectively. Merge nums1 and nums2 into a single array
 *                 sorted in non-decreasing order. The final sorted array should not be returned by the function, but instead be
 *                 stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote
 *                 the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length
 *                 of n.
 * @Explanation  : Creates two ArrayLists, list1 and list2, to store the elements of nums1 and nums2, respectively. It then uses
 *                 two pointers, index1 and index2, to traverse these lists and merge them into the first array nums1. It compares
 *                 elements from list1 and list2, inserting the smaller element into the appropriate position in nums1. If there are
 *                 remaining elements in either list after the initial merge process, those elements are copied to the end of nums1.
 * */
package easy;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            list1.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            list2.add(nums2[i]);
        }

        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1) <= list2.get(index2)) {
                nums1[index1 + index2] = list1.get(index1);
                index1++;
            } else {
                nums1[index1 + index2] = list2.get(index2);
                index2++;
            }
        }

        while (index1 < list1.size()) {
            nums1[index1 + index2] = list1.get(index1);
            index1++;
        }

        while (index2 < list2.size()) {
            nums1[index1 + index2] = list2.get(index2);
            index2++;
        }
    }
}
