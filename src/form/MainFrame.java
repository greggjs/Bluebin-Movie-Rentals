
package form;
import movie.*;
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the main page of the program, where you are
 * prompted to either login as a User, Admin, or 
 * create a new account. You can also exit the program.
 * 
 * @author greggjs
 */
public class MainFrame extends javax.swing.JFrame {
    public Main main;
    /**
     * Creates new form MainFrame
     */
    public MainFrame(Main main) {
        this.main = main;
        initComponents();
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
        UserInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BLUEBIN");
        setBounds(java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2 - 200, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-200, 0, 0);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("BLUEBIN MOVIE RENTALS"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 100, 123));
        jPanel1.setPreferredSize(new java.awt.Dimension(246, 311));

        UserInput.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserInput.setToolTipText("Please Enter your Phone Number (###-###-####)");
        UserInput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone Number/Admin ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10))); // NOI18N
        UserInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserInputActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 100, 123));
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 100, 123));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 100, 123));
        jButton3.setText("Admin Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 100, 123));
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BLUEBIN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Movie Rentals");

        PasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 10))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PasswordField)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(UserInput)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(UserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, 316, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserInputActionPerformed
        
        
    }//GEN-LAST:event_UserInputActionPerformed

    /**
     * Performs a user login, which takes the user to the instance
     * of UserLogIn if the login is successful.
     * 
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        loginUser();
    
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * Shuts down the program.
     * 
     * @param evt 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(-1);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Performs an admin login, which takes the admin to the instance
     * of AdminLogIn if the login is successful.
     * 
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        loginAdmin();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Takes the user to the instance of NewAccountPage, where they
     * create a new account and are logged in to an instance of 
     * UserLogInFrame.
     * 
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.UserInput.setText("");
        this.PasswordField.setText("");
        main.newAccountFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Method to perform a user login. Checks if all inputs are 
     * valid, then queries the database, the checks to see
     * if the user is valid on the system. Once it passes
     * all checks, the user is logged into the system
     * and taken to their home page.
     */
    public void loginUser() {
        
        // Initialize some variables for querying
        String test = UserInput.getText();
        char[] pwd_arr = PasswordField.getPassword();
        String pwd = new String(pwd_arr);
        String bank = "SELECT renter_phone, password, "
                + "renter_name FROM Renter where "
                + "renter_phone = '" + test + "';";
        
        // if the inputs are not correctly formatted, return
        if (!checkUser(test, pwd))
            return;
        
        // query the database for the phone, password, and
        // name of the user.
        String[] ret = multiSelect(bank);
        
        // if the user gave invalid credentials, return
        if (!checkUserQuery(ret[0], ret[1], pwd))
            return;
        // if the user passes, log them in and take them
        // to the instance of UserLogIn.
        else {
            this.setVisible(false);
            this.UserInput.setText("");
            this.PasswordField.setText("");
            main.curr = new Renter(ret[2], ret[0]);
            main.loginUserFrame = new UserLogIn(main);
            main.loginUserFrame.setVisible(true);

        }
    }
    
    /**
     * Method to perform an admin login. Checks if all inputs are 
     * valid, then queries the database, the checks to see
     * if the admin is valid on the system. Once it passes
     * all checks, the admin is logged into the system
     * and taken to their home page.
     */
    public void loginAdmin() {
        
        // initialize some variables for querying
        String test = UserInput.getText();
        char[] pwd_arr = PasswordField.getPassword();
        String pwd = new String(pwd_arr);
        String bank = "SELECT admin_id, password "
                + "FROM Movie_Admin where admin_id = '"
                + test + "'";
        String[] admin = null; // our return value store

        // if the admin credentials are not formatted
        // correctly, return
        if (!checkAdmin(test, pwd))
            return;

        // query the database for the admin ID
        // and password
        admin = doubleSelect(bank);
        
        // if the credentials do not check right, return
        if (!checkAdminQuery(admin, pwd))
            return;
        // otherwise, log the admin into their instance
        // of AdminLogIn
        else {  
            this.setVisible(false);
            this.UserInput.setText("");
            this.PasswordField.setText("");
            main.loginAdminFrame = new AdminLogIn(main);
            main.loginAdminFrame.setVisible(true);
        }
    }
    
    /**
     * Performs a specified query to the database for finding
     * Admin credentials.
     * 
     * @param bank the query to be executed
     * @return the results of the query, where [0] is the 
     * admin ID and [1] is the password.
     */
    public String[] doubleSelect(String bank) {
        
        // Store results here 
        String[] check = new String[2];
        try {
            // make connection to database
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            // store the resutls from the database here first
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            while (rs.next()) {
                // store the results to return here
                check[0] = rs.getString("admin_id");
                check[1] = rs.getString("password");
            }
            
        // catch all appropriate exceptions
        } catch (SQLException e) {
            System.out.println("cannot find driver");
            return null;
        } catch (ClassNotFoundException err) {
            System.out.println ("Problem!");
        }
        return check; // return the results
    }
    
    /**
     * Performs a specified query to the database for finding
     * User credentials
     * 
     * @param bank the query to be executed
     * @return the results of the query, where [0] is the
     * renter's phone, [1] is the renter's password, and 
     * [2] is the renter's name.
     */
    public String[] multiSelect(String bank) {
        
        // Store results here
        String[] ret = new String[3];
        try {
            // make connection to database
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            // store resutls from database query here first
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            while (rs.next()) {
                // copy to return array
                ret[0] = rs.getString("renter_phone");
                ret[1] = rs.getString("password");
                ret[2] = rs.getString("renter_name");
            }
        // catch all appropriate exceptions
        } catch (SQLException err) {
            System.out.println("problem has occurred");
            err.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        return ret; // return the results
    }
    
    /**
     * Checks the Admin credentials before querying.
     * Finds if the inputs are inproperly formatted
     * or empty
     * 
     * @param test test Admin ID
     * @param pwd test Password
     * @return false if failed, true if passed
     */
    public boolean checkAdmin(String test, String pwd) {
        
        // Admin ID empty
        if (test.equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Please enter your Admin "
                    + "ID\nError: NullUser");
            return false;
        }
        // Admin ID and Password of invalid length
        else if (test.length()>20 || pwd.length()>20) {
            JOptionPane.showMessageDialog(this,
                    "Please enter your Admin "
                    + "ID\nError: InvalidLen");
            this.UserInput.setText("");
            return false;
        }
        // Password empty
        else if (pwd.equals("")) {
            JOptionPane.showMessageDialog(this, 
                    "Please enter your password"
                    + "\nError: NullPwd");
            return false;
        }
        return true;
    }
    
    /**
     * Checks the Admin credentials after querying.
     * Finds if the Admin is invalid or gave the 
     * wrong password
     * 
     * @param admin result Admin ID
     * @param pwd result Password
     * @return false if failed, true if passed
     */
    public boolean checkAdminQuery(
                    String[] admin, String pwd) {
        // Admin not found
        if (admin[0]==null) {
            JOptionPane.showMessageDialog(this, 
                    "Error, user not found\nError:"
                    + " InvalidAdmin");
            this.UserInput.setText("");
            this.PasswordField.setText("");
            return false;
        }
        // Password mismatch
        if (!(admin[1].equals(pwd))) {
            JOptionPane.showMessageDialog(this, 
                    "Invalid Password\nError: "
                    + "AdminFoundPwdInvalid");
            this.PasswordField.setText("");
            return false;
        }
        return true;
    }
    
    /**
     * Checks the User credentials before querying.
     * Finds if the inputs are inproperly formatted
     * or empty
     * 
     * @param test test user ID
     * @param pwd test Password
     * @return false if failed, true if passed
     */
    public boolean checkUser(String test, String pwd) {
        try {
            // id is a number
            Long.parseLong(test);
            if (test.equals("")) {
                JOptionPane.showMessageDialog(this,
                        "Please enter a phone number\nExample: "
                        + "5555555555\nError: NullUser");
                return false;
            }
            // id is of correct length
            else if (test.length()!=10) {
               JOptionPane.showMessageDialog(this, 
                       "Please enter a valid phone "
                       + "number\nExample: 5555555555"
                       + "\nError: InvalidPhone");
               this.UserInput.setText("");
               return false;
            }
            // password is not null
            else if (pwd.equals("")) {
                JOptionPane.showMessageDialog(this,
                        "Please enter a password"
                        + "\nError: NullPwd");
                return false;
            }
        } catch(NumberFormatException err) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid phone "
                    + "number\nExample: 5555555555"
                    + "\nError: NumFormat");
            return false;
        }
        return true;
    }
    
    /**
     * Checks the User credentials after querying.
     * Finds if the User is invalid or gave the 
     * wrong password
     * 
     * @param phone result user phone
     * @param pwd_check result password
     * @param pwd given password
     * @return 
     */
    public boolean checkUserQuery(String phone,
            String pwd_check, String pwd) {
        // if the user does not exist
        if (phone==null) {
            JOptionPane.showMessageDialog(this, 
                    "Error, user not found"
                    + "\nError: InvalidUser");
            this.UserInput.setText("");
            this.PasswordField.setText("");
            return false;
        }
        // if the password is not correct
        else if (!pwd_check.equals(pwd)) {
            JOptionPane.showMessageDialog(this,
                    "Invalid Password\nError:"
                    + " UsrFoundPwdInvalid");
            this.PasswordField.setText("");
            return false;
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    public javax.swing.JTextField UserInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
