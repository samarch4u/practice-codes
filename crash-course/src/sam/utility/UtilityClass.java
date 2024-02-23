package sam.utility;

import sam.linked_list.i_fast_and_slow_pointers.ListNode;

public class UtilityClass {

    public static void printLinkList(ListNode head){
        while (head != null) {
            System.out.print(head.getVal() + (head.getNext() != null ? " --> " : ""));
            head = head.getNext();
        }
    }
}
