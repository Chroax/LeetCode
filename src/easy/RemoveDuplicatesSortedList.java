/*
 * @Link Problem : https://leetcode.com/problems/remove-duplicates-from-sorted-list
 * @Contributor  : Chroax
 * @Created at   : 15 August 2024, 10:01 AM
 * @Problem      : Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 *                 Return the linked list sorted as well.
 * @Explanation  : Starts by checking if the input head is null, in which case it returns null immediately. If the list is not empty,
 *                 it initializes a pointer, iterate, to traverse the list from the head. As it iterates compares the current node's
 *                 value with the value of the next node. If these values are equal, skips over the duplicate node by setting the
 *                 next reference of the current node to the node after the duplicate. If the values are different, moves the iterate
 *                 pointer to the next node.
 * */
package easy;

public class RemoveDuplicatesSortedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode iterate = head;
        while (iterate.next != null) {
            if(iterate.val == iterate.next.val)
                iterate.next = iterate.next.next;
            else
                iterate = iterate.next;
        }
        return head;
    }

}
