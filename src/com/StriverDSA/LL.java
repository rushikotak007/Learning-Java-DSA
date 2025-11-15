package com.StriverDSA;

import java.util.*;

// ✅ Generic Node class
class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}

public class LL <T>{

    private Node<T> head;

    //Add First Operation
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLastNode(String data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else{
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        return;
    }

    //Delete the First Element
    public void deleteFist(){
        head = head.next;
        return;
    }

    //Delete Last Element
    public void deleteLast(){

        Node currNode = head;
        Node secondLast = head;

        while(currNode.next != null){
            secondLast = currNode;
            currNode = currNode.next;
        }

        secondLast.next = null;
    }

    //Find A Node With The Element
    public int findNode(String s) {
        Node curr = head;
        int count = 0;

        while (curr != null) {   // ✅ check all nodes, including last
            if (curr.data.equals(s)) {
                return count;
            }
            curr = curr.next;
            count++;
        }

        return -1; // not found
    }

    //Find the length of the loop in LinkedList (Optimal approach using tortoise-rabbit algorithm)
    public static int lengthOfLoop(Node head){

        Node rabbit = head;
        Node tortoise = head;
        int count = 1;

        while(rabbit != null && rabbit.next != null){

            tortoise = tortoise.next;
            rabbit = rabbit.next.next;


            if(rabbit == tortoise){
                rabbit = rabbit.next;
                while(rabbit != tortoise){
                    rabbit = rabbit.next;
                    count++;
                }
                return count;
            }
        }

        return -1;
    }

    public static <T> boolean isPalindrome(Node<T> head) {

        Stack<T> stack = new Stack<>();
        Node<T> curr = head;

        while(curr != null){
            stack.push(curr.data);
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            T temp = stack.pop();
            if(temp != curr.data){
                return false;
            }
            curr = curr.next;
        }

        return true;
    }

    public static <T>Node reverseLL(Node<T> head, Node<T> lastNode ){

        Node<T> prev = null;
        Node<T> curr = head;

        while(curr != null){
            Node<T> fwd = curr.next;

            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        return prev;
    }


    //Print the Linked List
    public static void printLL(Node head) {
        if (head == null) {
            System.out.println("null / No nodes in LinkedList");
            return;
        }
        Node curr = head;  // ✅ use temp node
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }




    public static void main(String args[]) {
//        LL list = new LL();
        Node head = new Node("1");
        Node second = new Node("2");
        Node third = new Node("3");
        Node fourth = new Node("4");
        Node fifth = new Node("5");

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // This creates a loop
        printLL(head);
        head = reverseLL(head);
        printLL(head);
//        System.out.print(isPalindrome(head));
    }
}
