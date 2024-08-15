/*
 * @Link Problem : https://leetcode.com/problems/merge-two-sorted-lists
 * @Contributor  : Chroax
 * @Created at   : 12 August 2024, 11:30 AM
 * @Problem      : Given the heads of two sorted linked lists list1 and list2. Merge the two lists into one sorted list. The list
 *                 should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.
 * @Explanation  : Create two new ListNode to serve as starting pointer for the merged list and build the new list. Then, we will iterate
 *                 through both input list to compare the current node of each list. It appends the smaller node to the merge list and
 *                 advances the pointer of the corresponding smaller node list. Once one of the list is exhausted, it appends the
 *                 remaining node of the other list to the merge list.
 * */

package algorithms.easy;

public class Merge2SortedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        ListNode iterate = newList;

        while(list1 != null && list2  != null) {
            if(list1.val < list2.val) {
                iterate.next = list1;
                list1 = list1.next;
            }
            else {
                iterate.next = list2;
                list2 = list2.next;
            }
            iterate = iterate.next;
        }

        iterate.next = (list1 != null) ? list1 : list2;

        return newList.next;
    }
}
