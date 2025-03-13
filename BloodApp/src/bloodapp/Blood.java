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

    public Blood(String name, String gpDetails) {
        this.name = name;
        this.gpDetails = gpDetails;
    }
    
    public Blood(){
        name = " ";
        gpDetails = " ";
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
    
    //Used incase of object error when printing
    public String toString(){
        return "Name: "+name+"\n GP Details: "+gpDetails;
    }
    
    
    
    
}
