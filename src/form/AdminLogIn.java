package form;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import movie.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UserLogIn.java
 *
 * Created on Nov 19, 2012, 4:10:16 PM
 */

/**
 * This is the main page for Admins of the system. They
 * are able to search the status of movies and renters,
 * and can add new movies. They are also permitted to 
 * logout. Logout is also performed when the window 
 * is closed.
 * 
 * Form by Patrick Cutno, Code written by Jake Gregg
 * @author cutnop, greggjs
 */
public class AdminLogIn extends javax.swing.JFrame {
    public Main main;
    /** Creates new form UserLogIn */
    public AdminLogIn(Main main) {
        this.main = main;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        MovieTitleField = new javax.swing.JTextField();
        RenterPhoneField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setTitle("Admin");
        setBounds(java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2 - 200, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-200, 0, 0);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                WindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 100, 123));
        jPanel1.setForeground(new java.awt.Color(0, 100, 123));
        jPanel1.setPreferredSize(new java.awt.Dimension(317, 300));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("What would you");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("like to do?");

        jButton1.setBackground(new java.awt.Color(0, 100, 123));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButton1.setText("Movie Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 100, 123));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButton2.setText("Renter Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 100, 123));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButton3.setText("Sign-out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        MovieTitleField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MovieTitleField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MovieTitleField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movie Title", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 10))); // NOI18N

        RenterPhoneField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RenterPhoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RenterPhoneField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Renter's Phone", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 10))); // NOI18N
        RenterPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenterPhoneFieldActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 100, 123));
        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButton4.setText("Add Movie");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MovieTitleField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RenterPhoneField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(MovieTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RenterPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RenterPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenterPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RenterPhoneFieldActionPerformed

    private void WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowClosing
        // TODO add your handling code here:
        main.frame.setVisible(true);
    }//GEN-LAST:event_WindowClosing

    
    /**
     * Performs a search on a specific movie title after the
     * appropriate button is selected. 
     * 
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        // Initialize some strings for querying
        String input = MovieTitleField.getText();
        String bank = "select movie_id from Movie "
                + "where movie_name='"+input+"';";
        String movie_id = null;
        
        // Get the movie ID we're searching on
        movie_id = selectStm(bank, "movie_id");
        
        // if the movie ID is null, do not proceed
        if (movie_id==null) {
            JOptionPane.showMessageDialog(this,
                    "No movie exists in database."
                    + "\nError: NullId");
            return;
        }
        
        // clear out the TextFields and display the results
        MovieTitleField.setText(null);
        RenterPhoneField.setText(null);
        main.movieStatusFrame = new MovieStatus(main, movie_id);
        this.setVisible(false);
        main.movieStatusFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Performs a search on a specific user based on their
     * phone number when the appropriate button is selected.
     * 
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        // Initialize some strings for querying
        String phone = RenterPhoneField.getText();
        String bank = "select renter_name from Renter "
                + "where renter_phone='"+phone+"';";
        String name = null;
        
        // Get the name of the person we're searching on
        name = selectStm(bank, "renter_name");
        
        // if the name isn't in the database, do not proceed
        if (name==null) {
            JOptionPane.showMessageDialog(this,
                    "No renter exists in database."
                    + "\nError: NullId");
            return;
        }
        
        // clear out the TextFields and display the results
        MovieTitleField.setText(null);
        RenterPhoneField.setText(null);
        main.renterStatusFrame = 
                new RenterStatus(main, phone, name);
        this.setVisible(false);
        main.renterStatusFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Performs a specified select statement and returns
     * the result as a String
     * 
     * @param bank the select query in MySQL syntax
     * @param type the data field returned from the query
     * @return the result of the query
     */
    public String selectStm(String bank, String type) {
        String ret = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/"
                    + "fall2012?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            while(rs.next()) {
                ret = rs.getString(type);
            }

        } catch (SQLException err) {
            System.out.println("problem has occurred");
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        
        return ret;
    }
    
    /**
     * Performs a logout of the Admin and returns to the main frame.
     * 
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        main.loginAdminFrame = null;
        main.frame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Closes the current window and opens the add movie frame
     * 
     * @param evt 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        main.addMovieFrame = new AddMovie(main);
        this.setVisible(false);
        main.addMovieFrame.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MovieTitleField;
    private javax.swing.JTextField RenterPhoneField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
