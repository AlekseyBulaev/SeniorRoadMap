package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoNymbersTest {

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        TwoNymbers test = new TwoNymbers();
        ListNode actual = test.addTwoNumbers(l1, l2);
        assertEquals(7, actual.val);
        assertEquals(0, actual.next.val);
        assertEquals(8, actual.next.next.val);
    }

    @Test
    void addTwoNumbers55() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        TwoNymbers test = new TwoNymbers();
        ListNode actual = test.addTwoNumbers(l1, l2);
        assertEquals(0, test.addTwoNumbers(l1, l2).val);
        assertEquals(1, test.addTwoNumbers(l1, l2).next.val);
    }

    @Test
    void addTwoNumbers199() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9, new ListNode(9));
        TwoNymbers test = new TwoNymbers();
        ListNode actual = test.addTwoNumbers(l1, l2);
        assertEquals(0, test.addTwoNumbers(l1, l2).val);
        assertEquals(0, test.addTwoNumbers(l1, l2).next.val);
        assertEquals(1, test.addTwoNumbers(l1, l2).next.next.val);
    }

    @Test
    void addTwoNumbers91999999999() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9))))))))));
        TwoNymbers test = new TwoNymbers();
        ListNode actual = test.addTwoNumbers(l1, l2);
        assertEquals(0, test.addTwoNumbers(l1, l2).val);
        assertEquals(0, test.addTwoNumbers(l1, l2).next.val);
        assertEquals(0, test.addTwoNumbers(l1, l2).next.next.val);
        assertEquals(0, test.addTwoNumbers(l1, l2).next.next.next.val);
        assertEquals(0, test.addTwoNumbers(l1, l2).next.next.next.next.val);
        assertEquals(0, test.addTwoNumbers(l1, l2).next.next.next.next.next.val);
        assertEquals(0, test.addTwoNumbers(l1, l2).next.next.next.next.next.next.val);
        assertEquals(0, test.addTwoNumbers(l1, l2).next.next.next.next.next.next.next.val);
        assertEquals(0, test.addTwoNumbers(l1, l2).next.next.next.next.next.next.next.next.val);
        assertEquals(0, test.addTwoNumbers(l1, l2).next.next.next.next.next.next.next.next.next.val);
        assertEquals(1, test.addTwoNumbers(l1, l2).next.next.next.next.next.next.next.next.next.next.val);
    }
}