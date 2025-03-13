/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodapp;

import java.util.*;
//Source: AEMaterHospital Solution Week 3 Moodle
/**
 *
 * @author flips
 */

public class PriorityQueue implements PQInterface {
    
    //grabs arrayList from PQelement to store patient details
    private ArrayList<PQElement> pqBloodList;
    
    public PriorityQueue(){
        pqBloodList = new ArrayList<PQElement>();
    }
    
    public boolean isEmpty(){
        return pqBloodList.isEmpty();
    }
    
   
    public int size(){
        return pqBloodList.size();
    }
    
    //Adds a new element with a priority added to it.
    public void enqueue(int priority, Object bloodPatient){
        
        int index;
        PQElement newElement = new PQElement(priority, (Blood) bloodPatient);
        
        index = findInsertPosition(priority);
        
        if(index == size()){
            pqBloodList.add(newElement);
        }
        else{
            pqBloodList.add(index, newElement);
        }
    }
    
    //Finds current elements position based on their priority, then adds them to the ArrayList
    private int findInsertPosition(int newPriority){
        boolean found = false;
        int position = 0;
        PQElement curElement;
        while (position < pqBloodList.size() && !found){
            curElement = pqBloodList.get(position);
            if(curElement.getPriority() > newPriority){ 
                position = position + 1;
            }
            else{
                found = true;
            }
        }
        return position;
    }
    
    //Removes first index / element on the list with highest priority
    public Object dequeue(){
        return pqBloodList.remove(0);
    }
    
    //Returns the getDetails from Blood superclass and adds the priority to it
    public String printPQueue(){
        String print = new String();
        PQElement curElement;
        
        for(int i = 0; i<pqBloodList.size(); i++){
            curElement = pqBloodList.get(i);
            //adds the priority queue to the getDetails method
            print = print.concat(curElement.getDetails() + " \n Priority: "+curElement.getPriority());
        }
        return print;
    }
    
    
}
