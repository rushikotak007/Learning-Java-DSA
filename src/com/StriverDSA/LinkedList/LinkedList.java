package com.StriverDSA.LinkedList;

public class LinkedList {

    private ListNode head;

    LinkedList(int val){
             head = new ListNode(val);
    }

    LinkedList(){
        ListNode head;
    }

    ///*Common Methods*///
    public void printLinkedList() {
        ListNode temp = head;

        if(temp == null){
            System.out.println("LinkedList is empty");
        }

        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.val + " -> ");
            }else{
                System.out.print(temp.val);
            }
            temp = temp.next;
        }
    }

    public ListNode getHead() {
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode temp = head;

        if(temp == null){
            System.out.println("LinkedList is empty");
        }

        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.val + " -> ");
            }else{
                System.out.print(temp.val);
            }
            temp = temp.next;
        }
    }

    public void addLast(int val){

        if(head == null) head = new ListNode(val);

        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new ListNode(val);
    }

    public void addFirst(int val){

        ListNode temp = new ListNode(val);
        temp.next = head;
        head = temp;
    }
}
