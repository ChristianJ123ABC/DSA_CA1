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
public class Stack implements SInterface {
    
    private ArrayList<Blood> sBloodList;
    
    public Stack(){
        sBloodList = new ArrayList<Blood>();
    }
    
    public int size(){
        return sBloodList.size();
    }
    
    public boolean isEmpty(){
        return sBloodList.isEmpty();
    }
    
 
    
    
    
    //removes item from top of stack
    public Object pop(){
        if(!(sBloodList.isEmpty())){
            return sBloodList.remove(0);
        }
        else{
            return null;
        }
    }
    
    
    
    //puts item on top of stack
    public void push(Object newPatient){
       
        sBloodList.add(0, (Blood) newPatient);
    }
    
    //removes every element from the ArrayList
    public void emptyStack(){
        while(!sBloodList.isEmpty()){
            pop();
        }
    }
    
    public String displayStack(){
        int i;
        String message =  " ";
        if(sBloodList.isEmpty()){
            message = message.concat("Stack is empty");
        }
        else{
            message = "Last 5 Patients who have not shown up: \n ";
            
            //If the amount of patients exceeds 5 in the list, it will remove the oldest person
            if(sBloodList.size() >= 6){
                
               message = message.concat(sBloodList.get(sBloodList.size()-1).toString()+"\n"); //Used to print an object

                
            }
        }
        return message;
    }
}
