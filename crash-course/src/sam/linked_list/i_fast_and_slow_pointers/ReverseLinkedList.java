package sam.linked_list.i_fast_and_slow_pointers;

import static sam.utility.UtilityClass.printLinkList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);
        ListNode eighth = new ListNode(8);

        ListNode head = first;

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;

        printLinkList(reverseLinkedList(head));
    }

    public static ListNode reverseLinkedList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = current.next;

        while (next != null) {
            current.next = previous;
            previous = current;
            current = next;
            next = current.next;
        }
        current.next = previous;

        return current;
    }
}
