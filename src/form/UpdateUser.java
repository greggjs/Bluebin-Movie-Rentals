/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import movie.*;

/**
 * User can update their phone number, credit card,
 * and password stored in the database.
 * 
 * Code and Form by Jake Gregg
 * @author greggjs
 */
public class UpdateUser extends javax.swing.JFrame {
    Main main;
    // for printing out the curr phone and credit card
    String phone;
    String credit_card;
    /**
     * Creates new form UpdateUser
     */
    public UpdateUser(Main main) {
        System.out.println(main.curr.getPhone());
        this.phone = main.curr.getPhone();
        getCC();
        initComponents();
        this.main = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CCLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NewPhoneField = new javax.swing.JTextField();
        NewCCField = new javax.swing.JTextField();
        OldPWField = new javax.swing.JPasswordField();
        NewPWField = new javax.swing.JPasswordField();
        UpdatePhone = new javax.swing.JButton();
        UpdateCC = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        ChangePW = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        ConfirmPWField = new javax.swing.JPasswordField();

        setBounds(java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2 - 200, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-200, 0, 0);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 100, 123));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Profile Information");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Phone");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Credit Card");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Change Password");

        CCLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        CCLabel.setForeground(new java.awt.Color(255, 255, 255));
        CCLabel.setText("On File: "+credit_card);

        PhoneLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneLabel.setText("On File: "+ phone);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Old Password");

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("New Password");

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirm Password");

        NewPhoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        NewCCField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        OldPWField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        NewPWField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        UpdatePhone.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        UpdatePhone.setText("Update");
        UpdatePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePhoneActionPerformed(evt);
            }
        });

        UpdateCC.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        UpdateCC.setText("Update");
        UpdateCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCCActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        ChangePW.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        ChangePW.setText("Change");
        ChangePW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePWActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator2)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(PhoneLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(NewPhoneField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(32, 32, 32)
                        .add(CCLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(NewCCField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(21, 21, 21)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(Cancel)
                                            .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(96, 96, 96)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(ChangePW, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(ConfirmPWField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(0, 0, Short.MAX_VALUE))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel8)
                                            .add(jLabel7))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(OldPWField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                            .add(NewPWField)))))))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(21, 21, 21)
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 336, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jLabel2))
                            .add(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jLabel3))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(137, 137, 137)
                                .add(UpdatePhone))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(136, 136, 136)
                                .add(UpdateCC)))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .add(14, 14, 14)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(PhoneLabel)
                    .add(NewPhoneField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(UpdatePhone)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel3)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(CCLabel)
                    .add(NewCCField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(UpdateCC)
                .add(3, 3, 3)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(5, 5, 5)
                .add(jLabel4)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(OldPWField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(NewPWField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(ConfirmPWField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ChangePW)
                    .add(Cancel))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the instance of this frame and opens the 
     * User home page.
     * 
     * @param evt 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        main.updateUserFrame = null;
        main.loginUserFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * Closes this window and opens the User home page.
     * 
     * @param evt 
     */
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        main.updateUserFrame = null;
        main.loginUserFrame.setVisible(true);
    }//GEN-LAST:event_CancelActionPerformed

    /**
     * Updates the user's phone number stored.
     * 
     * @param evt 
     */
    private void UpdatePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePhoneActionPerformed
        // TODO add your handling code here:
        updatePhone();
        
        getCC();
        PhoneLabel.setText("On File: " + phone);
        NewPhoneField.setText("");
    }//GEN-LAST:event_UpdatePhoneActionPerformed

    /**
     * Updates the user's credit card stored.
     * 
     * @param evt 
     */
    private void UpdateCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCCActionPerformed
        // TODO add your handling code here:
        updateCC();
        
        getCC();
        CCLabel.setText("On File: " + credit_card);
        NewCCField.setText("");
    }//GEN-LAST:event_UpdateCCActionPerformed

    /**
     * Updates the user's password stored.
     * 
     * @param evt 
     */
    private void ChangePWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePWActionPerformed
        // TODO add your handling code here:
        updatePW();
        
        OldPWField.setText("");
        NewPWField.setText("");
        ConfirmPWField.setText("");
    }//GEN-LAST:event_ChangePWActionPerformed
    
    /**
     * Gets the user's credit card stored in the database for
     * display purposes.
     */
    public void getCC() {
        // query to get the cc
        String bank = "select credit_card "
                + "from Renter where "
                + "renter_phone='"+phone+"';";
        try {
            // make connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012?"
                    + "user=greggjs&password=greggjs");
            // make statment and result set
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            while (rs.next()) {
                credit_card = rs.getString("credit_card");
            }
        } catch (SQLException e) {
            System.out.println("SQL Error 1");
            return;
        } catch (ClassNotFoundException err) {
            System.out.println ("Problem!");
        }
        
        
    }
    
    /**
     * Updates the user's password in the database
     * to a new one. It ensures that all inputs 
     * are correct.
     */
    public void updatePW() {
        
        // arrays to store the passwords in
        char[] old_pw_arr, new_pw_arr, confirm_pw_arr;
        String check = null, test = null, bank, old_pw,
                new_pw, confirm_pw;
        // once each password is read, it must be converted
        // to a String.
        old_pw_arr = OldPWField.getPassword();
        old_pw = new String(old_pw_arr);
        new_pw_arr = NewPWField.getPassword();
        new_pw = new String(new_pw_arr);
        confirm_pw_arr = ConfirmPWField.getPassword();
        confirm_pw = new String(confirm_pw_arr);
        
        // if any field is blank, return.
        if (old_pw == null || new_pw==null 
                || confirm_pw==null) {
            JOptionPane.showMessageDialog(this,
                    "Please fill out all fields");
            return;
        }
        // if any field is too long, return.
        else if (old_pw.length() > 20 || 
                new_pw.length() > 20 || 
                confirm_pw.length() > 20) {
            JOptionPane.showMessageDialog(this,
                    "One field is too long for a Password");
            return;
        }
        
        // make a query to get the old password
        bank = "select password from Renter where "
                + "renter_phone='"+phone+"';";
        test = selectStm(bank, "password");
        // if the inputed password is not the same as 
        // the one on file, return.
        if (!(old_pw.equals(test))) {
            JOptionPane.showMessageDialog(this,
                    "Incorrect Old Password");
            return;
        }
        // if the new password equals the old password 
        // stored, return.
        else if (new_pw.equals(test)) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a new Password");
            return;
        }
        // if the new password and confirm password fields
        // do not match, return.
        else if (!(new_pw.equals(confirm_pw))) {
            JOptionPane.showMessageDialog(this,
                    "Please Ensure you Confirm "
                    + "your Password Correctly");
            return;
        }
        
        // update the user's password
        bank = "update Renter set password = '"+new_pw
                +"' where renter_phone = '"+phone+"';";
        prepStm(bank);
        
        // inform the user it updated successfully.
        JOptionPane.showMessageDialog(this,
                "Successfully Updated Password", 
                "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Updates the User's phone number in the database
     * to a new one. Checks for correct formatting as well
     */
    public void updatePhone() {
        // get the new number
        String test = NewPhoneField.getText();
        
        try {
            // if it's not a number, return
            Long.parseLong(test);
            if (test.equals("")) {
                JOptionPane.showMessageDialog(this, 
                    "Please enter your new phone number"
                    + "\nError: NullPhone");
                return;
            }
            // if it's not the right format, return
            else if (test.length()!=10) {
                JOptionPane.showMessageDialog(this, 
                    "Please enter a vlid phone number"
                    + "\nExample: 5555555555"
                    + "\nError: IncrtPhone");
                return;
            }
        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid phone "
                    + "number\nExample: 5555555555"
                    + "\nError: NumFormat");
            return;
        }
        
        // get the user's old number in the database
        String bank = "select renter_phone from "
                + "Renter where renter_name = '"+
                main.curr.getName()+"';";
        String check = selectStm(bank, "renter_phone");
        
        // if the two numbers are equal then return
        if (test.equals(check)) {
            JOptionPane.showMessageDialog(
                    this, "Please enter a new Phone Number");
            return;
        }
        
        // update the user's number
        bank = "update Renter set renter_phone='"+
                test+"' where renter_phone='"+phone+"';";
        prepStm(bank);
        
        // update all instances of the number in the
        // Has_Rented table.
        bank = "update Has_Rented set renter_phone='"+
                test+"' where renter_phone='"+phone+"';";
        prepStm(bank);
        
        // Success displayed to user
        JOptionPane.showMessageDialog(this,
                "Successfully Updated Phone", 
                "Success", JOptionPane.INFORMATION_MESSAGE);
        
        // reset the credentials for the user to be displayed
        phone = test;
        main.curr.setPhone(test);
    }
    
    /**
     * Updates the User's credit card number in the database
     * to a new one.
     */
    public void updateCC() {
        // get the new credit card from the user
        String test = NewCCField.getText();
        String bank, check = null;
        try {
            // if it ain't a number, return
            Long.parseLong(test);
            if (test.equals("")) {
                JOptionPane.showMessageDialog(this, 
                    "Please enter your credit card"
                    + "\nError: NullCrCd");
                return;
            }
            // if it ain't a credit card, return
            else if (test.length()!=16) {
                JOptionPane.showMessageDialog(this, 
                    "Please enter a vlid credit card"
                    + "\nExample: 4444777788885555"
                    + "\nError: IncrtCrCd");
                return;
            }
        } catch(NumberFormatException err) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid credit card "
                    + "number\nExample: 5555444433332222"
                    + "\nError: NumFormat");
            return;
        }
        
        // get the old credit card number from the database
        bank = "select credit_card from Renter"
                + " where renter_phone='"+
                main.curr.getPhone()+"';";
        check = selectStm(bank, "credit_card");
        
        // if the old and new ones match, return
        if (test.equals(check)) {
            JOptionPane.showMessageDialog(
                    this, "Please enter a new Credit Card");
            return;
        }
        
        // update the credit card to the new one
        bank = "update Renter set credit_card = '"+test
                +"' where renter_phone = '"
                +main.curr.getPhone()+"';";
        prepStm(bank);
        
        // success dialog shown
        JOptionPane.showMessageDialog(this,
                "Successfully Updated Credit Card", 
                "Success", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    /**
     * Executes an insert, deletion, or update
     * 
     * @param bank query to be executed
     */
    public void prepStm(String bank) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3307/fall2012"
                        + "?user=greggjs&password=greggjs");
            PreparedStatement stm = conn.prepareStatement(bank);
            stm.execute();
        } catch (SQLException e) {
            System.out.println("SQL Error 2");
            return;
        } catch (ClassNotFoundException err) {
            System.out.println ("Problem!");
        }
    }
    
    /**
     * Executes a selection and returns it as a String
     * 
     * @param bank query to be sent
     * @param query type to return
     * @return result as a String
     */
    public String selectStm(String bank, String query) {
        String check = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012?"
                    + "user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            while (rs.next()) {
                check = rs.getString(query);
            }
        } catch (SQLException e) {
            System.out.println("SQL Error 1");
            return null;
        } catch (ClassNotFoundException err) {
            System.out.println ("Problem!");
        }
        return check;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CCLabel;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton ChangePW;
    private javax.swing.JPasswordField ConfirmPWField;
    private javax.swing.JTextField NewCCField;
    private javax.swing.JPasswordField NewPWField;
    private javax.swing.JTextField NewPhoneField;
    private javax.swing.JPasswordField OldPWField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JButton UpdateCC;
    private javax.swing.JButton UpdatePhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
