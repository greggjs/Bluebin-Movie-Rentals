/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

/**
 * This class hold crucial information about the current User
 * in the system. IT holds their phone number and name so 
 * that the system is not caught in constant queries.
 * 
 * @author greggjs
 */
public class Renter {
    
    // Strings to hold their name and phone
    private String name;
    private String phone;
    
    /**
     * Creates a new Renter with null instance variables
     */
    public Renter () {
        this.name = "";
        this.phone = "";
    }
    
    /**
     * Creates a new Renter with a specified name and phone.
     * These values are used for display and querying 
     * purposes
     * 
     * @param name Renter's name
     * @param phone Renter's phone
     */
    public Renter (String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    /**
     * Returns the name of the Renter.
     * @return name of the Renter
     */
    public String getName() {return this.name;}
    
    /**
     * Returns the phone of the Renter.
     * @return phone of the Renter
     */
    public String getPhone() {return this.phone;}
    
    /**
     * Sets the phone number of the Renter to a new number
     * @param phone the new phone number
     */
    public void setPhone(String phone) {this.phone = phone;}
    
}
