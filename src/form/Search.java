package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
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
 *
 * @author cutnop
 */
public class Search extends javax.swing.JFrame {
    Main main;
    DefaultComboBoxModel model;
    DefaultComboBoxModel model2;
    DefaultComboBoxModel model3;
    /** Creates new  */
    public Search(Main main) {
        this.main = main;
        initialize();
        initComponents();
        TitleRadio.setSelected(true);
        PG13Radio.setSelected(true);
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
        SearchField = new javax.swing.JTextField();
        TitleRadio = new javax.swing.JRadioButton();
        KeywordRadio = new javax.swing.JRadioButton();
        GenreBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        GRadio = new javax.swing.JRadioButton();
        PGRadio = new javax.swing.JRadioButton();
        RRadio = new javax.swing.JRadioButton();
        NC17Radio = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        PG13Radio = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        ActorBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        YearBox = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

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

        SearchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
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

        GenreBox.setBackground(new java.awt.Color(0, 100, 123));
        GenreBox.setModel(model);

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

        ActorBox.setBackground(new java.awt.Color(0, 100, 123));
        ActorBox.setModel(model2);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Actor");

        YearBox.setBackground(new java.awt.Color(0, 100, 123));
        YearBox.setModel(model3);
        YearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearBoxActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(ActorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(SearchField, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(TitleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(23, 23, 23)
                                                        .addComponent(KeywordRadio)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(97, 97, 97)))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(GenreBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4))))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(GRadio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PGRadio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PG13Radio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RRadio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NC17Radio)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(YearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenreBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GRadio)
                    .addComponent(RRadio)
                    .addComponent(NC17Radio)
                    .addComponent(PG13Radio)
                    .addComponent(PGRadio)
                    .addComponent(jButton5))
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        main.rentFrame.fillTable();
        main.searchFrame = null;
        main.rentFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        initialize();
    }//GEN-LAST:event_formWindowOpened

    private void YearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearBoxActionPerformed

    private void PGRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PGRadioActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        searchActor();
        //main.searchResultsFrame = new SearchResults(main,);
        main.searchResultsFrame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        main.searchFrame=null;
        main.rentFrame.fillTable();
        main.rentFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        searchTitleOrKeyword();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        searchGenre();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        searchRating();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        searchReleaseYear();
    }//GEN-LAST:event_jButton6ActionPerformed

    public void initialize() {
        String bank = "select category_name from Category;";
        String[] cat_arr = new String[30];
        model = new DefaultComboBoxModel();
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
        
        bank = "select actor_name from Actor";
        model2 = new DefaultComboBoxModel();
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
        
        model3 = new DefaultComboBoxModel();
        model3.addElement("");
        for (int i = 1920; i < 2013; i++) {
            model3.addElement(i);
        }
        
        
        
    }
    
    public void searchTitleOrKeyword() {
        String search = SearchField.getText();
        String bank=null;
        
        if (TitleRadio.isSelected()) {
            bank = "select * from Movie where movie_name='"+search+"';";
        }
        
        else if (KeywordRadio.isSelected()) {
            bank = "select * from Movie where movie_name like '%"+search+"%';";
        }
        
        StringBuilder res = new StringBuilder();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            for (int i =0; rs.next(); i++) {
                res.append(rs.getString("movie_name"));
                res.append("~");
                res.append(rs.getString("release_date"));
                res.append("~");
                res.append(rs.getString("rating"));
                res.append("~");
                res.append(rs.getString("quantity"));
                res.append("~");
            }
          
        } catch (SQLException err) {
            System.out.println("problem has occurred");
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        main.searchFrame.setVisible(false);
        main.searchResultsFrame = new SearchResults(main, res);
        main.searchResultsFrame.setVisible(true);
    }
   
    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ActorBox;
    private javax.swing.JRadioButton GRadio;
    private javax.swing.JComboBox GenreBox;
    private javax.swing.JRadioButton KeywordRadio;
    private javax.swing.JRadioButton NC17Radio;
    private javax.swing.JRadioButton PG13Radio;
    private javax.swing.JRadioButton PGRadio;
    private javax.swing.JRadioButton RRadio;
    private javax.swing.JTextField SearchField;
    private javax.swing.JRadioButton TitleRadio;
    private javax.swing.JComboBox YearBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void searchGenre() {
        String genre = (String)GenreBox.getSelectedItem();
        if (genre==null) {
            JOptionPane.showMessageDialog(this, "Please select a genre");
            return;
        }
        String bank = "select * from Movie "
                + "natural join Has_Category natural "
                + "join Category where category_name='"
                +genre+"';";
        
        StringBuilder res = new StringBuilder();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            for (int i =0; rs.next(); i++) {
                res.append(rs.getString("movie_name"));
                res.append("~");
                res.append(rs.getString("release_date"));
                res.append("~");
                res.append(rs.getString("rating"));
                res.append("~");
                res.append(rs.getString("quantity"));
                res.append("~");
            }
          
        } catch (SQLException err) {
            System.out.println("problem has occurred");
            
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        main.searchFrame.setVisible(false);
        main.searchResultsFrame = new SearchResults(main, res);
        main.searchResultsFrame.setVisible(true);
    }
    
    public void searchRating() {
        String bank=null;
        
        if (GRadio.isSelected()) {
            bank = "select * from Movie where rating='"+GRadio.getText()+"';";
        }
        else if (PGRadio.isSelected()) {
            bank = "select * from Movie where rating ='"+PGRadio.getText()+"';";
        }
        else if (PG13Radio.isSelected()) {
            bank = "select * from Movie where rating ='PG13';";
        }
        else if (RRadio.isSelected()) {
            bank = "select * from Movie where rating ='"+RRadio.getText()+"';";
        }
        else if (NC17Radio.isSelected()) {
            bank = "select * from Movie where rating ='NC17';";
        }
        
        System.out.println(bank);
        StringBuilder res = new StringBuilder();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            for (int i =0; rs.next(); i++) {
                res.append(rs.getString("movie_name"));
                res.append("~");
                res.append(rs.getString("release_date"));
                res.append("~");
                res.append(rs.getString("rating"));
                res.append("~");
                res.append(rs.getString("quantity"));
                res.append("~");
            }
          
        } catch (SQLException err) {
            System.out.println("problem has occurred");
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        main.searchFrame.setVisible(false);
        main.searchResultsFrame = new SearchResults(main, res);
        main.searchResultsFrame.setVisible(true);
    }
    
    public void searchReleaseYear() {
        int year;
        year = (Integer)YearBox.getSelectedItem();
        if (year==0) {
            JOptionPane.showMessageDialog(this, "Please select a year");
            return;
        }
        String bank = "select * from Movie "
                + "where release_date > '"
                +year+"-01-01' and release_date < '"+year+"-12-31';";
        System.out.println(bank);
        
        StringBuilder res = new StringBuilder();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            for (int i =0; rs.next(); i++) {
                res.append(rs.getString("movie_name"));
                res.append("~");
                res.append(rs.getString("release_date"));
                res.append("~");
                res.append(rs.getString("rating"));
                res.append("~");
                res.append(rs.getString("quantity"));
                res.append("~");
            }
          
        } catch (SQLException err) {
            System.out.println("problem has occurred");
            
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        main.searchFrame.setVisible(false);
        main.searchResultsFrame = new SearchResults(main, res);
        main.searchResultsFrame.setVisible(true);
    }
    
    public void searchActor() {
        String actor = (String)ActorBox.getSelectedItem();
        if (actor==null) {
            JOptionPane.showMessageDialog(this, "Please select a actor");
            return;
        }
        String bank = "select * from Movie "
                + "natural join Starred_In natural "
                + "join Actor where actor_name='"
                +actor+"';";
        
        StringBuilder res = new StringBuilder();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/fall2012"
                    + "?user=greggjs&password=greggjs");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(bank);
            for (int i =0; rs.next(); i++) {
                res.append(rs.getString("movie_name"));
                res.append("~");
                res.append(rs.getString("release_date"));
                res.append("~");
                res.append(rs.getString("rating"));
                res.append("~");
                res.append(rs.getString("quantity"));
                res.append("~");
            }
          
        } catch (SQLException err) {
            System.out.println("problem has occurred");
            
        } catch (ClassNotFoundException e) {
            System.out.println ("cannot find driver!");
        }
        
        main.searchFrame.setVisible(false);
        main.searchResultsFrame = new SearchResults(main, res);
        main.searchResultsFrame.setVisible(true);
    }

}
