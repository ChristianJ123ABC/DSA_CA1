/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodapp;

/**
 *
 * @author flips
 */
//Sources: Week 3 - SLL and PQ SinglyLinkedListApp Solution
public interface LinearListInterface {
    public void add(int position, Object element);

    public void add(Object element);

    public Object get(int position);

    public void remove(int position);

    public boolean isEmpty();

    public int size();

    public void printList();
}
