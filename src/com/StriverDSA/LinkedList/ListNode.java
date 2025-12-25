package com.StriverDSA.LinkedList;

public class ListNode {
    int val;
    ListNode next;

    ///*Constructors*///
    ListNode() {
        this.val = 0;
        this.next = null;
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(ListNode prev) {
        this.next = prev.next;
        this.val = prev.val;
    }


}
