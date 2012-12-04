/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

/**
 *
 * @author smartkid1965
 */
public class Renter {
    private String name;
    private String phone;
    
    public Renter () {
        this.name = "";
        this.phone = "";
    }
    public Renter (String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Renter (String phone) {
        this.phone = phone;
    }
    public String getName() {return this.name;}
    public String getPhone() {return this.phone;}
    public void setPhone(String phone) {this.phone = phone;}
    
}
