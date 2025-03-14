/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodapp;
//Source: AEMaterHospital Solution Week 3 Moodle
/**
 *
 * @author flips
 */
public class PQElement {
    public int priority; //key 
    public Blood bloodPatient;

    public PQElement(int priority, Blood bloodPatient) {
        this.priority = priority;
        this.bloodPatient = bloodPatient;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Blood getPatient() {
        return bloodPatient;
    }

    public void setName(Blood bloodPatient) {
        this.bloodPatient = bloodPatient;
    }
    
    
    public String getDetails(){
        return "Name: "+bloodPatient.getName()+"\n GP Details: "+bloodPatient.getGpDetails();
    }
}
