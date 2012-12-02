/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

import java.sql.Date;

/**
 *
 * @author smartkid1965
 */
public class Movie {
    private String title;
    private Date release;
    private String rating;
    private int quantity;
    
    public Movie() {}
    public Movie(String title, Date release,
            String rating, int quantity) {
        this.title = title;
        this.release = release;
        this.rating = rating;
        this.quantity = quantity;
    }
    /*
    public String toString() {
        
    }*/
}
