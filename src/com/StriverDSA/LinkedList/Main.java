package com.StriverDSA.LinkedList;

import static com.StriverDSA.LinkedList.LinkedList.printLinkedList;
import static com.StriverDSA.LinkedList.LinkedListMedium.*;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst(9);
        list.addFirst(9);
        list.addLast(9);
        list.addLast(9);
        list.addLast(9);
//
//        LinkedList list2 = new LinkedList(1);
//        list2.addLast(1);
//        list2.addLast(5);
//        list2.addLast(5);
//
//       ListNode sortedHead = new ListNode();
//        sortedHead = mergeTwoSortedLists(list.getHead() ,list2.getHead());
//        printLinkedList(sortedHead);

        ListNode resultHead = addOneToLL(list.getHead());
        printLinkedList(resultHead);
    }
}
