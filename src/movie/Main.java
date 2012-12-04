/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;
import form.*;
import javax.swing.*;
import java.util.logging.*;
import java.util.*;
/**
 *
 * @author greggjs
 */
public class Main {

    public MainFrame frame;
    public UserLogIn loginUserFrame;
    public AdminLogIn loginAdminFrame;
    public NewAccountPage newAccountFrame;
    public MovieStatus movieStatusFrame;
    public Rent rentFrame;
    public RenterStatus renterStatusFrame;
    public Return returnFrame;
    public Search searchFrame;
    public SearchResults searchResultsFrame;
    public AddMovie addMovieFrame;
    public UpdateUser updateUserFrame;
    
    public ArrayList<Movie> movies = new ArrayList<Movie>();
    public Renter curr = new Renter();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
            new Main().run();
        } catch (Exception ex) { 
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, "Error setting LaF", ex); 
        }
    }
    public Main() {
        
    }
    public void run() {
        frame = new MainFrame(this);
        newAccountFrame = new NewAccountPage(this);
        
        frame.setVisible(true);
    }
}
