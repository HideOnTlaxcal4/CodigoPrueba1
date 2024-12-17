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

            // La creación del nodo se hará en el siguiente paso
        }

        return resultListHead;
    }
}
