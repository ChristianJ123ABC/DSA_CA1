/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodapp;

/**
 *
 * @author flips
 */
public class Blood {
    private String name;
    private String gpDetails;
    private int age;
    private String ward;

    public Blood(String name, String gpDetails, int age, String ward) {
        this.name = name;
        this.gpDetails = gpDetails;
        this.age = age;
        this.ward = ward;
    }

    
    
    public Blood(){
        name = " ";
        gpDetails = " ";
        age = 0;
        ward = " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public void setGpDetails(String gpDetails) {
        this.gpDetails = gpDetails;
    }
    
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
    
    //Used incase of object error when printing
    public String toString(){
        return "Name: "+name+"\n GP Details: "+gpDetails;
    }
    
    
    
}
