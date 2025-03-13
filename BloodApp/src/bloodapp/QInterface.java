/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodapp;

/**
 *
 * @author flips
 */
public interface QInterface {
    public boolean isEmpty();

    public int size();

    public Object frontElement();

    public void enqueue(Object newItem);

    public Object dequeue();
}
