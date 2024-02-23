package sam.utility;

import sam.linked.list.i.fast.and.slow.pointers.ListNode;

public class UtilityClass {

    public static void printLinkList(ListNode head){
        while (head != null) {
            System.out.print(head.getVal() + (head.getNext() != null ? " --> " : ""));
            head = head.getNext();
        }
    }
}
