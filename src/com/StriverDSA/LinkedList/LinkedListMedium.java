package com.StriverDSA.LinkedList;


import java.util.ArrayList;

import static com.StriverDSA.LinkedList.LinkedList.printLinkedList;

public class LinkedListMedium {

    public static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1, null);

        ListNode temp = dummy;
        ListNode t1 = l1;
        ListNode t2 = l2;

        while (t1 != null && t2 != null) {

            if (t1.val <= t2.val) {
                temp.next = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }

//        attach remaining nodes
        if (t1 != null) {
            temp.next = t1;
        } else {
            temp.next = t2;
        }

        return dummy.next;
    }

    public static ListNode findMiddle(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    ///* It is going to use recursion and backtracking just like the mergeSort for arrays and we will have a helper function for merging two sorted linkedlists*///
    public static ListNode mergeSortLinkedList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode mid = findMiddle(head);

        ListNode leftHead = head;
        ListNode rightHead = mid.next;
        mid.next = null; // broke the bond between two linkedlist to divide them into half

        leftHead = mergeSortLinkedList(leftHead);
        rightHead = mergeSortLinkedList(rightHead);

        return mergeTwoSortedLists(leftHead, rightHead);
    }

    //In this function we have to sort a LL of 0s, 1s and 2s without changing values(By changing the links)
    public static ListNode sortZeroOneTwo(ListNode head) {
        ListNode dummy = new ListNode(-1, null);
        ListNode tempSorted = dummy;

        for (int i = 0; i <= 2; i++) {
            ListNode tempOriginal = head;
            ListNode prev = null;

            while (tempOriginal != null) {
                if (tempOriginal.val == i) {
                    //Extract the node from original linked list by changing links
                    //Linking sorted LL 
                    tempSorted.next = tempOriginal;

                    if (prev != null) {
                        prev.next = tempOriginal.next;
                        tempOriginal = prev.next;
                    } else {
                        head = tempOriginal.next;
                        tempOriginal = tempOriginal.next;
                    }
                    tempOriginal.next = null;
                }
                prev = tempOriginal;
            }
        }

        return dummy.next;
    }

    //Iterativ approach
    public static void addOneToListValue(ListNode head) {

        ListNode temp = head;
        ArrayList list = new ArrayList<>();

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        int currNumber = 0;

        for (int i = list.size(); i > 0 ; i--) {
            int curr = (int) list.get(i);
        }



        System.out.println(list);
    }

    public static int countMultiplicator(int n){
        int result = 1;
        while(n!=0){
            result *= 10;
            n--;
        }
        return result;
    }

    public static boolean isSameLength(int first, int second) {
        int countFirst = 0;
        while (first != 0) {
            first /= 10;
            countFirst++;
        }

        int countSecond = 0;
        while (second != 0) {
            second /= 10;
            countSecond++;
        }

        if (countFirst == countSecond) {
            return true;
        } else return false;
    }


    //Reversing LL by recursion
    public static ListNode reverseLL(ListNode head){

        //Base Case
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = reverseLL(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    //Reversing LinkedList by using optimal approach by changing bonds
    public static ListNode reverseLLOptimal(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!= null){
            ListNode front = curr.next;

            curr.next = prev;
            prev = curr;
            curr = front;
        }

        return prev;
    }

    //Consider the Linkedlist as number and add one to it
    public static ListNode addOneToLL(ListNode head){
        head = reverseLLOptimal(head);

        ListNode temp = head;
        int carry = 1;
        ListNode lastNode = null;
        while(temp!=null){
            int sum = carry + temp.val;
            carry = sum/10;

            temp.val = sum%10;
            if(temp.next == null){
                lastNode = temp;
            }
            temp = temp.next;
        }
        if(carry>0){
            lastNode.next = new ListNode(carry);
        }

        head = reverseLLOptimal(head);

        return head;
    }

}
