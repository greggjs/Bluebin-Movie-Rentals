package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import movie.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

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
 *
 * @author cutnop
 */
public class Rent extends javax.swing.JFrame {
    Main main;
    Object[][] data = new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            };
    String col[] = new String [] {
                "Title", "Release Date", "Rating", "Quantity"
            };
    private DefaultTableModel model = new DefaultTableModel(data,col);
    /** Creates new */
    public Rent(Main main) {
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MovieTable = new javax.swing.JTable();

        setTitle("Rent a Movie");
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
        jLabel1.setText("New Releases");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setBackground(new java.awt.Color(0, 100, 123));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 100, 123));
        jButton3.setText("Rent");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 100, 123));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MovieTable.setModel(model);
        jScrollPane1.setViewportView(MovieTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        main.loginUserFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        main.searchFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        main.loginUserFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fillTable();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row_selected = MovieTable.getSelectedRow();
        if (row_selected == -1) {
            JOptionPane.showMessageDialog(this, "Please select a movie to rent");
            return;
        }
        String movie_title = MovieTable.getModel().getValueAt(row_selected, 0).toString();
        String movie_q = "select movie_id from Movie where movie_name='"+movie_title+"'";
        String movie_id = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/"
                    + "fall2012?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(movie_q);
            while(rs.next()) {
                movie_id = rs.getString("movie_id");
            }

        } catch (SQLException err) {
            System.out.println("problem has occurred");
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        int choice = JOptionPane.showConfirmDialog(this, 
                "Charge this to your credit card on file for this"
                + " rental?",
                "Rent New Release", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION)
            return;
        
        Long curr_time = System.currentTimeMillis();
        Long seven_days = (long)604800000;
        Long due_time = curr_time+seven_days;
        
        Date curr_date = new Date(curr_time);
        Date due_date = new Date(due_time);
        
        String bank = "insert into Has_Rented values('"
                +main.curr.getPhone()+"', "+movie_id
                +", '"+curr_date+"','"+due_date+"');";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            PreparedStatement stm = conn.prepareStatement(bank);
            stm.execute();
        } catch (SQLException err) {
            System.out.println("problem has occurred");
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public void fillTable() {
        String bank = "select * from Movie where release_date > '2000-01-01' order by release_date desc;";
        StringBuilder new_releases = new StringBuilder("");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/fall2012?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            while(rs.next()) {
                new_releases.append(rs.getString("movie_name"));
                new_releases.append("~");
                new_releases.append(rs.getString("release_date"));
                new_releases.append("~");
                new_releases.append(rs.getString("rating"));
                new_releases.append("~");
                new_releases.append(rs.getString("quantity"));
                new_releases.append("~");
            }
          
        } catch (SQLException err) {
            System.out.println("problem has occurred");
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        String new_releases_s = new_releases.toString();
        String [] rel_arr = new_releases_s.split("~");
        int row = 0;
        for (int i = 0; i < rel_arr.length-3; i+=4) {
            model.insertRow(row, new Object[]{rel_arr[i], rel_arr[i+1], rel_arr[i+2], rel_arr[i+3]});
            row++;
        }
    }
    
    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MovieTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
