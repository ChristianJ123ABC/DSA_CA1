/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodapp;
//Source: AEMaterHospital Solution Week 3 Moodle
/**
 *
 * @author flips
 */
public interface PQInterface {
    public void enqueue(int priority, Object bloodPatient);
    
    public Object dequeue();
    
    public int size();
    
    public boolean isEmpty();
    
    public String printPQueue();
    
    public Object patientPriority(int i, int priority);
    
    
}
