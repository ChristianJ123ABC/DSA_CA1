/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodapp;

/**
 *
 * @author flips
 */
////Sources: Week 2 - Abstract Data Types. Stack and Queue Stack App Solution
public interface SInterface {
    public boolean isEmpty();

    public void push(Object newItem);

    public Object pop();
    
    public int size();

    public void emptyStack();

    public String displayStack();
}
