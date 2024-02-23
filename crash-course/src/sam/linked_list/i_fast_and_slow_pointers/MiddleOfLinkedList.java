package sam.linked_list.i_fast_and_slow_pointers;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);

        ListNode two = new ListNode(2);
        head.next = two;

        ListNode three = new ListNode(3);
        two.next = three;

        ListNode four = new ListNode(4);
        three.next = four;

        ListNode five = new ListNode(5);
        four.next = five;

        ListNode six = new ListNode(6);
        five.next = six;

        System.out.println("The middle node -> " + middleNode(head).val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}
