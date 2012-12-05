/*
 * Main.java
 * By Jake Gregg
 * 
 * This is where the program starts. This class stores all the
 * instances of all the frames, plus it stores information
 * about the current renter in curr. It starts a new instance
 * of Main and generates the first instance of MainFrame.
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

    // Each frame is stored here in Main, where it 
    // is opened and closed from.
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
    
    // This holds all information about the renter
    // that we need, which is their phone and 
    // name.
    public Renter curr = new Renter();
    
    /**
     * This creates a new instance of Main and starts it.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try { 
            UIManager.setLookAndFeel(UIManager.
                    getSystemLookAndFeelClassName()); 
            new Main().run();
        } catch (Exception ex) { 
            Logger.getLogger(MainFrame.class.getName())
                    .log(Level.SEVERE, "Error setting LaF", ex); 
        }
    }
    
    /**
     * This constructor for main is the default, and 
     * contains no information.
     */
    public Main() {}
    
    /**
     * When this is called, only the main page and the 
     * new user pages are created. It then displays the 
     * main page.
     */
    public void run() {
        frame = new MainFrame(this);
        newAccountFrame = new NewAccountPage(this);
        
        frame.setVisible(true);
    }
}
