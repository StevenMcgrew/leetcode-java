class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int sum =  0;

        while (head != null) {
            if (head.val == 0 && sum != 0) {
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0;
            } else {
                sum += head.val;
            }
            head = head.next;
        }

        return dummyHead.next;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
