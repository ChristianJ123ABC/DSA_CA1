/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodapp;

/**
 *
 * @author flips
 */
//Sources: Week 3 - SLL and PQ SinglyLinkedListApp Solution
public class SLLNode {
    private Object element;
    private SLLNode next;

    public SLLNode(Object element, SLLNode next) {
        this.element = element;
        this.next = next;
    }


    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }
    
    public String toString() {
        return element.toString();
    }
}
