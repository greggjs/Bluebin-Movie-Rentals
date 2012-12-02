package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
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
 *
 * @author cutnop
 */
public class Search extends javax.swing.JFrame {
    Main main;
    /** Creates new  */
    public Search(Main main) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        TitleRadio = new javax.swing.JRadioButton();
        KeywordRadio = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        GRadio = new javax.swing.JRadioButton();
        PGRadio = new javax.swing.JRadioButton();
        RRadio = new javax.swing.JRadioButton();
        NC17Radio = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        PG13Radio = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        setTitle("Search for a Movie");
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

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Advance Search");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setBackground(new java.awt.Color(0, 100, 123));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 100, 123));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        TitleRadio.setBackground(new java.awt.Color(0, 100, 123));
        buttonGroup1.add(TitleRadio);
        TitleRadio.setForeground(new java.awt.Color(255, 255, 255));
        TitleRadio.setText("Title");

        KeywordRadio.setBackground(new java.awt.Color(0, 100, 123));
        buttonGroup1.add(KeywordRadio);
        KeywordRadio.setForeground(new java.awt.Color(255, 255, 255));
        KeywordRadio.setText("Keyword");

        jComboBox1.setBackground(new java.awt.Color(0, 100, 123));
        jComboBox1.setModel(null);

        jLabel2.setBackground(new java.awt.Color(0, 100, 123));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Genre");

        GRadio.setBackground(new java.awt.Color(0, 100, 123));
        buttonGroup2.add(GRadio);
        GRadio.setForeground(new java.awt.Color(255, 255, 255));
        GRadio.setText("G");

        PGRadio.setBackground(new java.awt.Color(0, 100, 123));
        buttonGroup2.add(PGRadio);
        PGRadio.setForeground(new java.awt.Color(255, 255, 255));
        PGRadio.setText("PG");
        PGRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGRadioActionPerformed(evt);
            }
        });

        RRadio.setBackground(new java.awt.Color(0, 100, 123));
        buttonGroup2.add(RRadio);
        RRadio.setForeground(new java.awt.Color(255, 255, 255));
        RRadio.setText("R");

        NC17Radio.setBackground(new java.awt.Color(0, 100, 123));
        buttonGroup2.add(NC17Radio);
        NC17Radio.setForeground(new java.awt.Color(255, 255, 255));
        NC17Radio.setText("NC-17");

        jLabel3.setBackground(new java.awt.Color(0, 100, 123));
        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rating");

        PG13Radio.setBackground(new java.awt.Color(0, 100, 123));
        buttonGroup2.add(PG13Radio);
        PG13Radio.setForeground(new java.awt.Color(255, 255, 255));
        PG13Radio.setText("PG-13");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Release Year");

        jComboBox3.setBackground(new java.awt.Color(0, 100, 123));
        jComboBox3.setModel(null);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Actor");

        jComboBox2.setBackground(new java.awt.Color(0, 100, 123));
        jComboBox2.setModel(null);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(TitleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(23, 23, 23)
                                                    .addComponent(KeywordRadio)))
                                            .addGap(50, 50, 50))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(GRadio)
                                            .addGap(46, 46, 46)
                                            .addComponent(PGRadio)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PG13Radio)
                                            .addGap(11, 11, 11)))
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                            .addComponent(RRadio)
                                            .addGap(31, 31, 31)
                                            .addComponent(NC17Radio)
                                            .addGap(10, 10, 10))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleRadio)
                    .addComponent(KeywordRadio)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GRadio)
                    .addComponent(RRadio)
                    .addComponent(NC17Radio)
                    .addComponent(PG13Radio)
                    .addComponent(PGRadio))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void PGRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PGRadioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        main.rentFrame.fillTable();
        main.searchFrame = null;
        main.rentFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        search();
        main.searchResultsFrame = new SearchResults(main);
        main.searchResultsFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        main.searchFrame=null;
        main.rentFrame.fillTable();
        main.rentFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        initialize();
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    public void initialize() {
        String bank = "select category_name from Category;";
        String[] cat_arr = new String[30];
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            for (int i =0; rs.next(); i++) {
                model.addElement(rs.getString("category_name"));
                //cat_arr[i] = rs.getString("category_name");
            }
          
        } catch (SQLException err) {
            System.out.println("problem has occurred");
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        jComboBox1.setModel(model);
        
        bank = "select actor_name from Actor";
        DefaultComboBoxModel model2 = new DefaultComboBoxModel();
        model2.addElement("");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            for (int i =0; rs.next(); i++) {
                model2.addElement(rs.getString("actor_name"));
                //cat_arr[i] = rs.getString("category_name");
            }
          
        } catch (SQLException err) {
            System.out.println("problem has occurred");
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        jComboBox3.setModel(model2);
        DefaultComboBoxModel model3 = new DefaultComboBoxModel();
        model3.addElement("");
        for (int i = 1920; i < 2013; i++) {
            model3.addElement(i);
        }
        jComboBox2.setModel(model3);
        
        TitleRadio.setSelected(true);
        PG13Radio.setSelected(true);
        
        
    }
    
    public void search() {
        String bank = "";
        StringBuilder bank_build = new StringBuilder();
        bank_build.append("select ");
    }
    
    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton GRadio;
    private javax.swing.JRadioButton KeywordRadio;
    private javax.swing.JRadioButton NC17Radio;
    private javax.swing.JRadioButton PG13Radio;
    private javax.swing.JRadioButton PGRadio;
    private javax.swing.JRadioButton RRadio;
    private javax.swing.JRadioButton TitleRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
