class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListHead = null;
        ListNode resultListLastNode = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int newDigit = sum % 10;

            ListNode newNode = new ListNode(newDigit);
            if (resultListHead == null) {
                resultListHead = newNode;
            } else {
                resultListLastNode.next = newNode;
            }
            resultListLastNode = newNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            resultListLastNode.next = new ListNode(carry);
        }

        return resultListHead;
    }
}
