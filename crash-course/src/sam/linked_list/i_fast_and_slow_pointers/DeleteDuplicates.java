package sam.linked_list.i_fast_and_slow_pointers;

import static sam.utility.UtilityClass.printLinkList;

public class DeleteDuplicates {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(2);
        ListNode fifth = new ListNode(2);
        ListNode sixth = new ListNode(3);
        ListNode seventh = new ListNode(3);
        ListNode eighth = new ListNode(4);

        ListNode head = first;

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;

        printLinkList(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;

        if (node == null) {
            return node;
        }

        while (node.next != null) {
            if (node.val != node.next.val) {
                node = node.next;
            } else {
                node.next = node.next.next;
            }
        }

        return head;
    }
}
