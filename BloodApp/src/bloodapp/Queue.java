/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodapp;

import java.util.*;

/**
 *
 * @author flips
 */
public class Queue implements QInterface {
    private ArrayList<Blood> qBloodList;
    
    public Queue(){
        qBloodList = new ArrayList<Blood>();
    }
    
    public boolean isEmpty(){
        return qBloodList.isEmpty();
    }
    
    public int size(){
        return qBloodList.size();
    }
    
    //Returns the element in front
    public Object frontElement(){
        if (qBloodList.size() > 0){
            return qBloodList.get(0);
        }
        
        else{
            return null;
        }
    }
    
    //Enqueue without priority
    public void enqueue(Object newPatient){
        qBloodList.add((Blood) newPatient);
    }
    
    public Object dequeue(){
        if (qBloodList.size() > 0){
            return qBloodList.remove(0);
        }
        else{
            return null;
        }
    }
    
    
    
}
