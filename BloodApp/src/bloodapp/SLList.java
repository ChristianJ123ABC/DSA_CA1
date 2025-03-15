/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodapp;

import javax.swing.JOptionPane;

/**
 *
 * @author flips
 */
//Sources: Week 3 - SLL and PQ SinglyLinkedListApp Solution


public class SLList implements LinearListInterface {
    private SLLNode head;
    private int size;
    private SLLNode currNode;
    private SLLNode prevNode;

    public SLList() {
        head = null;
        size = 0;
        currNode = null;
        prevNode = null;
    }

    
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

   
    public int size() {
        return size;
    }

   
   //First add method that places them into a specific index / position
    public void add(int position, Object element) {
        if (position == 1) {
            SLLNode newNode = new SLLNode(element, head);
            head = newNode;
        } else {
            setCurrent(position);
            SLLNode newNode = new SLLNode(element, currNode);
            prevNode.setNext(newNode);
        }
        //Increases list size for new elements
        size++;
    }

    
    //Second add method that adds the element at the end of the list 
    public void add(Object element) {
        SLLNode newNode = new SLLNode(element, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(size);
            currNode.setNext(newNode);
        }
        //Increases list size for new elements
        size++;
    }


    public Object get(int position) {
        setCurrent(position);
        return currNode;
    }

    
    public void remove(int position) {
        if (position == 1) {
            head = head.getNext();
        } else {
            setCurrent(position);
            prevNode.setNext(currNode.getNext());
        }
        //Increases list size for new elements
        size++;
    }
    
    //Switches the current node / position with the previous node
    //aka switching an elements position
    private void setCurrent(int position) {
   
        int i;
        prevNode = null;
        currNode = head;
        for (i = 1; i < position; i++) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

                                    
    
    public void printList() {
        SLLNode tempNode = head;
        while (tempNode != null) {
            JOptionPane.showMessageDialog(null,tempNode.toString());
            tempNode = tempNode.getNext();
        }
    }
}
