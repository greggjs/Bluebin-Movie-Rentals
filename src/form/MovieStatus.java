package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
 * Look at the quantity of a specified movie, add more
 * movies, or remove all copies of the specified movie.
 * 
 * Form by Patrick Cutno, Code by Jake Gregg
 * @author cutnop
 */
public class MovieStatus extends javax.swing.JFrame {
    Main main;
    
    // vars for display
    String id;
    String title;
    int stock, rented, total;
    
    // vars for table
    Object [][] data = null;
    String[] col = new String [] {
                "Name", "Rent Date", "Due Date"
            };
    DefaultTableModel model = new DefaultTableModel(data, col);
    
    /** Creates new  MovieStatus */
    public MovieStatus(Main main, String id) {
        this.main = main;
        this.id = id;
        initialize();
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RenterTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        AvailableLabels = new javax.swing.JLabel();
        RentedLabel = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle("Movie Status");
        setBounds(java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2 - 200, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2-200, 0, 0);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 100, 123));
        jPanel1.setForeground(new java.awt.Color(0, 100, 123));
        jPanel1.setPreferredSize(new java.awt.Dimension(317, 300));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Renters");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setBackground(new java.awt.Color(0, 100, 123));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 100, 123));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButton3.setText("Change Movie Stock");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        RenterTable.setModel(model);
        RenterTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(RenterTable);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available Copys");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rented Copys");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Copys");

        TitleLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Status for \"" + title+"\"");
        TitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        AvailableLabels.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        AvailableLabels.setForeground(new java.awt.Color(255, 255, 255));
        AvailableLabels.setText(stock+"");

        RentedLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        RentedLabel.setForeground(new java.awt.Color(255, 255, 255));
        RentedLabel.setText(rented+"");

        TotalLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        TotalLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalLabel.setText(""+total);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jButton1.setText("Remove All Copies");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitleLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RentedLabel)
                                    .addComponent(AvailableLabels)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(TotalLabel))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TitleLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AvailableLabels))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RentedLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TotalLabel))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Adds copies of the specified movie and redraws 
     * all necessary form data.
     * 
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        addCopies();
        data=null;
        model = new DefaultTableModel(data, col);
        initialize();
        AvailableLabels.setText(""+stock);  
        RentedLabel.setText(""+rented);
        TotalLabel.setText(""+total);
        fillTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Closes the window and returns to the Admin homepage.
     * 
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        main.loginAdminFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Opens the Admin homepage upon window close
     * 
     * @param evt 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        main.loginAdminFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * Fills the table with all renters of a specified movie
     * 
     * @param evt 
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fillTable();
    }//GEN-LAST:event_formWindowOpened

    /**
     * Removes all copies of a specified movie and redraws all
     * necessary form data.
     * 
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        removeAllCopies();
        data=null;
        model = new DefaultTableModel(data, col);
        initialize();
        AvailableLabels.setText(""+stock);
        RentedLabel.setText(""+rented);
        TotalLabel.setText(""+total);
        fillTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Initializes all form data labels.
     */
    public void initialize() {
        // query database for the movie name of the given 
        // movie id.
        String bank = "select movie_name from Movie"
                + " where movie_id="+id+";";
        title = selectStm(bank, "movie_name");
        
        // get the quantity in stock of the movie
        bank = "select quantity from Movie where movie_id="
                +id+";";
        stock = Integer.parseInt(selectStm(bank, "quantity"));
        
        // get the quantity rented of the movie 
        bank = "select COUNT(movie_id) from Has_Rented "
                + "where movie_id="+id+";";
        rented = Integer.parseInt(selectStm(
                bank, "count(movie_id)"));
        
        // calculate the total movies
        total = stock+rented;
           
    }
    
    /**
     * Executes select statements
     * 
     * @param bank query to be executed
     * @param query return variable type
     * @return result as a String
     */
    private String selectStm(String bank, String query) {
        String res = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/"
                    + "fall2012?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            while(rs.next()) {
                res = rs.getString(query);
            }
            
        } catch (SQLException err) {
            System.out.println("problem has occurred");
            err.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        return res;
    }
    
    /**
     * Fill the table with all renters of specified movie.
     */
    public void fillTable() {
        // get all the renters of a specified movie.
        String bank = "select renter_name, rent_date, due_date"
                + " from Renter natural join Has_Rented"
                + " where movie_id="+id+";";
        StringBuilder new_releases = new StringBuilder("");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/"
                    + "fall2012?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            while(rs.next()) {
                new_releases.append(rs.getString("renter_name"));
                new_releases.append("~");
                new_releases.append(rs.getString("rent_date"));
                new_releases.append("~");
                new_releases.append(rs.getString("due_date"));
                new_releases.append("~");
                
            }
          
        } catch (SQLException err) {
            System.out.println("problem has occurred");
            err.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        // convert the results to a String[]
        String new_releases_s = new_releases.toString();
        String [] rel_arr = new_releases_s.split("~");
        
        // fill the table with the data
        int row = 0;
        for (int i = 0; i < rel_arr.length-2; i+=3) {
            model.insertRow(row, new Object[]{rel_arr[i],
                rel_arr[i+1], rel_arr[i+2]});
            row++;
        }
    }
    
    /**
     * Removes all copies of a specified movie in stock.
     */
    private void removeAllCopies() {
        // query that removes all movies in stock
        String bank = "update Movie set quantity=0 where movie_id="
                +id+";";
        
        // asks user if they're sure they want to. If not,
        // return.
        int choice = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to remove\n"
                + "all copies of \""+title+"\"?",
                "Remove all Copies", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION)
            return;
        
        // execute the update statement to remove all copies.
        prepStm(bank);
        
    }
    
    /**
     * Add copies of a specified movie in the database.
     */
    private void addCopies() {
        // gets the new quantity to be inserted
        int new_q=0;
        while(true) {
        try {
            // gets it in a InputDialog.
            new_q = Integer.parseInt(JOptionPane.showInputDialog(
                    this, "How many copies would you like to add?"));
            break;
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(this, 
                        "Please insert a valid quantity");
            }   
        }
        
        // inserts the new quantity into the database.
        String bank = "update Movie set quantity=quantity+"
                +new_q+" where movie_id="+id+";";
        prepStm(bank);
    }
    
    /**
     * Executes insertions, deletions, and updates.
     * 
     * @param bank query to be executed.
     */
    public void prepStm(String bank) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            PreparedStatement stm = conn.prepareStatement(bank);
            stm.execute();
        } catch (SQLException err) {
            System.out.println("SQL Error");
            return;
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailableLabels;
    private javax.swing.JLabel RentedLabel;
    private javax.swing.JTable RenterTable;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
