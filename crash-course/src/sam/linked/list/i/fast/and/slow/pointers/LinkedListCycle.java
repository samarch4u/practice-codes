package sam.linked.list.i.fast.and.slow.pointers;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        ListNode third = new ListNode();
        ListNode fourth = new ListNode();
        ListNode fifth = new ListNode();
        ListNode sixth = new ListNode();
        ListNode seventh = new ListNode();
        ListNode eighth = new ListNode();

        ListNode head = first;

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = third;

        System.out.println("Linked List " + (hasCycle(head) ? "has" : "doesn't have") + " a cycle");
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(fastNode == slowNode){
                return true;
            }
        }

        return false;
    }

}
